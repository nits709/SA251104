import { test, expect } from '@playwright/test'


//driver.findElements('locator).get(index)
//nth function is equal to the get function from list in java.
test("getelementByAltText", async ({ page }) => {

    page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

    const comLogo = await page.getByAltText('orangehrm-logo').nth(1); // getting 2 matching nodes

    const comLogo1 =await page.getByAltText('company-branding');

    await expect(comLogo).toBeVisible();
    await expect(comLogo1).toBeVisible();

    await page.close();




})