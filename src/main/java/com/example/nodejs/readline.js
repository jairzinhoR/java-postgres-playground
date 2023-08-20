const readline = require("readline");

const r1 = readline.createInterface({input: process.stdin, output: process.stdout});

r1.question('Digite o valor de a: ', (a) => {
    r1.question('Digite o valor de b: ', (b) => {
        console.log(a);
        console.log(b);
        r1.close();
    });
});
