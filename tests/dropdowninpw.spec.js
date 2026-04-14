import { test } from '@playwright/test'

test('handling dropdown', async ({ page }) => {

    await page.goto("https://testautomationpractice.blogspot.com/")

    await page.waitForTimeout(2000)

// select the option by visible text | inner text, label also
    await page.locator('#country').selectOption({ label: 'India' }) //label

    await page.waitForTimeout(2000)

    // select the option by using value attribute
    await page.locator('#country').selectOption('china')

    await page.waitForTimeout(2000)

    // select the value | option from dropdown by index. | index starts at 0th of 1st option

    await page.locator('#country').selectOption({index:2}); // select the option by index.

    await page.waitForTimeout(2000)


    //javascript

    await page.selectOption('#country','India') // javascript format
    await page.waitForTimeout(2000)


    /*Assignment
    1. https://omayo.blogspot.com/
    2. automate Multi selection box 
     */

})