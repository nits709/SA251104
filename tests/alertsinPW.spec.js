

import { test, expect } from '@playwright/test'
import { text } from 'node:stream/consumers'

test("Handling a simple alert", async ({ page }) => {

    await page.goto("https://testautomationpractice.blogspot.com/")

    //page.on block which has to call or write before perform any action on alert

    page.on('dialog', async dialog => {
        //assertion, which validates dialog coming on page
        expect(dialog.type()).toContain('alert')
        expect(dialog.message()).toContain('I am an alert box!')
        await dialog.accept() //ok
    })
    await page.locator('#alertBtn').click();
    await page.waitForTimeout(2000);

})


test('Handle confirmation alert',async({page})=>{


    await page.goto('https://testautomationpractice.blogspot.com/')

    //confirmaiton alert
    page.on('dialog', async dialog=>{
        expect(dialog.type()).toContain('confirm')
        expect(dialog.message()).toContain('Press a button!')
        await dialog.accept() //ok
      //  await dialog.dismiss() // cancel
    })

    await page.locator('#confirmBtn').click();
     const alertText = await page.locator('#demo');   
     await expect(alertText).toHaveText('You pressed OK!')
})


//Assginment
// Automate prompt alert in playwright
/*1. navigate to application https://omayo.blogspot.com/
2. click on prompt alert
3. enter text
4. validate the message
*/