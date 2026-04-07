import {test,expect} from '@playwright/test'

test('locators',async({page})=>{

    await page.goto("https://demoblaze.com/")

    // property type locator
    // await page.locator('id=login2').click();   //property type locator , coming from playwright
    await page.click('id=login2') // coming from javascript


    //using playwright format
    // await page.locator('[id="loginusername"]').fill("pavanol"); //css format
    // await page.locator('#loginpassword').fill("test@123"); //css format
    // await page.locator('#logInModal > div > div > div.modal-footer > button.btn.btn-primary').click();

    
    //using javascript format
    await page.fill('[id="loginusername"]',"pavanol")
    await page.fill('#loginpassword',"test@123")
    await page.click('#logInModal > div > div > div.modal-footer > button.btn.btn-primary')
    
    
             const logoutElement = await page.locator('id=logout2');
             await expect(logoutElement).toBeVisible(); //this checks element is coming on page or not

             await page.click('id=logout2');
             await page.close();


})