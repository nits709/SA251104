import {test,expect} from "@playwright/test"

test("upload File",async({page})=>{
        await page.goto("https://the-internet.herokuapp.com/upload")

        const filePath = "/Volumes/Renuka/Professional Stuff (Restricted)/Invoices/accessibility-report-template.html"

        await page.setInputFiles('#file-upload',filePath)
        await page.locator('#file-submit').click();

        const verifyText = await page.locator('#uploaded-files').textContent();
        console.log("text "+verifyText);
})