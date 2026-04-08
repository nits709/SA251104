
import { test, expect } from '@playwright/test'

//driver.findElements(By.ccsSelector('#content a')) | size();
// element.get(i).getText();
test('interactWithMultipleElement', async ({ page }) => {
    await page.goto("https://the-internet.herokuapp.com/")
    console.log("page navigates successfully")

    const noOfLinks = await page.locator('#content a'); // 44 links
    const link = await noOfLinks.count();

    console.log("total number of links present on page " + link)

    for (let i = 0; i < link; i++) {
        const textOfLinks = noOfLinks.nth(i); //1
        const textOnElement = await textOfLinks.innerText();
        console.log("text of links "+textOnElement)


        await textOfLinks.click();
        const title = await page.title();
        console.log("title "+title)
        page.goBack() // take us to main page
        //page.goForward();
    }




})