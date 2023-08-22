const {test,expect} = require("@playwright/test")
const { use } = require("../playwright.config")

/* Maximize screen */
//This is for specific screen
test.use({viewport:{width:1515,height:818}})
//There is 2 way you can set viewport in the confing file in the browsers

test("Valid Login",async function({page}){

    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

    /* How to get screen size */
    console.log(await page.viewportSize().width)
    console.log(await page.viewportSize().height)



    await page.getByPlaceholder("Username").type("Admin", {delay:100})
    
    await page.locator("input[name='password']").type("admin123", {delay:100})

    await page.locator("//button[@type='submit']").click()
    
    await expect(page).toHaveURL(/dashboard/)

    // await page.waitForTimeout(3000)

    await page.getByAltText("profile picture").first().click()
    
    await page.getByText("Logout").click()

    await expect(page).toHaveURL(/auth/)
    // await page.waitForTimeout(3000)
    




})