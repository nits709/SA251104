import {test,expect} from '@playwright/test'

// test.use({
//     timeout:20000
// })

test.only('hard',async({page})=>{

    await page.goto('https://demoblaze.com');
    console.log('A');
    //await expect(page).toHaveTitle('STORE')
    await expect(page).toHaveTitle('STORE123')
    console.log('B');
    console.log('C');
})



//assert.all();

test("soft assertion", async ({page})=>{
    await page.goto('https://demoblaze.com')
    console.log('A')
    await expect.soft(page).toHaveTitle('STORE123')
    console.log('B')
    console.log('C')
})