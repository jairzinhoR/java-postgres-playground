const sum = (a, b) => {
    return a + b;
}

const inOneHour = () => {
    const now = Date.now();
    const inOneHourInMili = 1 * 60 * 60 * 1000;
    return now + inOneHourInMili;
}

console.log(inOneHour());
module.exports = { sum };
module.exports = { sum, inOneHour };
