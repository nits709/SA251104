import { test, expect } from '@playwright/test'


//driver.findElements('locator).get(index)
//nth function is equal to the get function from list in java.
test("getelementByAltText", async ({ page }) => {

    page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    const comLogo = await page.getByAltText('orangehrm-logo').nth(1); // getting 2 matching nodes
    const comLogo1 = await page.getByAltText('company-branding');
    await expect(comLogo).toBeVisible();
    await expect(comLogo1).toBeVisible();
    await page.close();

})

test("getelementByPlaceHolder", async ({ page }) => {
    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

    await page.getByPlaceholder("Username").fill("Admin")
    await page.getByPlaceholder("Password").fill("admin123")
    await page.locator("[type='submit']").click();
    await page.waitForTimeout(5000) //brings delay

})

test("getElementByRole", async ({ page }) => {
    await page.goto("https://the-internet.herokuapp.com/login")
    await page.locator("#username").fill("tomsmith")
    await page.locator("#password").fill("SuperSecretPassword!")
    await page.getByRole('button', { name: 'Login' }).click();

    await page.waitForTimeout(2000)

    let logOutElement = await page.getByText('Logout').nth(1);
    await expect(logOutElement).toBeVisible();




})
