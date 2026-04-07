
import { test, expect } from '@playwright/test'

/**
 * What is page? | window, browser, tab
 * driver.get(); | launch the URL
 * goto("url") // this launch the application in playwright
 * page.goto("url")
 */

test("myFirstScript", async ({ page }) => {

    // testscript

   await page.goto("https://demoblaze.com/")
    let pageTitle = await page.title();
    console.log("title of page " + pageTitle)


    const pageURL = await page.url(); // this return current url of page
    console.log("url of page "+ pageURL);


    await expect(page).toHaveURL(pageURL) ;  // this check the current url of page
    await expect(page).toHaveTitle(pageTitle) ; //this check the title of page

    await page.close(); //close the browser.






})