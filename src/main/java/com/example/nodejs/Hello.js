const { stdout } = require("process");
const readline = require("readline");

console.log("Você quer iniciar no mundo da programação?")

const r1 = readline.createInterface({input: process.stdin, output: stdout});

r1.question("Digite sim ou não: ", (i) => {
    if (i == "Sim"){
    console.log("Hello World!")};

r1.close();
});

