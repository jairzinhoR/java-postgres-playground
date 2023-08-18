const { sum, inOneHour } = require('./my-code')

describe('math functions', () => {
    beforeAll(() => {
        console.log('before all')
    });
    it('sum 2 numbers', () => {
    expect(sum(1,2)).toBe(3)
})
});

describe('time functions', () =>{
    it('returns the timestamp for one hour ahead', () => {
        global.Date.now = () => 0
        expect(inOneHour()).toBe(3600000)
    })
})
