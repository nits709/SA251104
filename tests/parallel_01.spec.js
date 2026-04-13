import {test} from '@playwright/test'

/**
 * Parallel execution - scenario-1
 */

test('Open Amazon',async({page})=>{

    await page.goto("https://amazon.com")
    console.log('amazon opened')

})

test('Open Google',async({page})=>{

    await page.goto("https://google.co.in")
    console.log('Google opened')

})


test('Open Facebook',async({page})=>{

    await page.goto("https://facebook.com")
    console.log('facebook opened')

})
