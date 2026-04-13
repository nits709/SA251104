import { test, expect } from '@playwright/test'

test("Assertion in PW", async ({ page }) => {

    await page.goto("https://demo.nopcommerce.com/register?returnUrl=%2F")

    //1. await expect('locator').toBeEnabled();
    const searchElement = await page.locator('#small-searchterms')
    await expect(searchElement).toBeEnabled(); // boolean - true or false
    await expect(searchElement).toBeEditable(); // 1 or 0
    await expect(searchElement).toHaveAttribute('aria-label','Search store')


    //2 await  expect('locator').toBeChecked();

    const MaleGenderElement = await page.locator('#gender-male')
    await MaleGenderElement.click();

    await expect(MaleGenderElement).toBeChecked();

    await page.locator('#FirstName').fill('Selenium')
    const firstName = await page.locator('#FirstName')
    await expect(firstName).toHaveValue('Selenium')  // PW
    expect(firstName).toHaveValue('Selenium')  // JS based Assertions

   /*
   Assginment
   1. identify newsletter checkbox and check the default state of element
   2. identify register button , check button have text as register or not
   */

    




})