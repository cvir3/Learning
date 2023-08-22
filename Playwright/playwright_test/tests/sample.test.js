const {test, expect} = require('@playwright/test')

test("My First test", async function({page}){
    expect(12).toBe(12)
})

test("MY second test", async function({page}){
    expect(12).toBe(12)
})

test.only("MY Third test", async function({page}){
    expect("Viren Chauhan").toContain("Viren1")
})