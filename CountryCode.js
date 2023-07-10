'use strict';

const fs = require('fs');
const axios = require('axios');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function (inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function () {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

async function getCountryName(code) {
    try {
        const resp = await axios.get(`https://jsonmock.hackerrank.com/api/countries?alpha2Code=${code}`);
        const country = resp.data.data[0];
        return country.name;
    } catch (error) {
        console.log(error);
    }
}

async function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const code = readLine().trim();

    const name = await getCountryName(code);

    ws.write(`${name}\n`);
}
