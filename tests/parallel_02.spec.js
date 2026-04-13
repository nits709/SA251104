import {test} from '@playwright/test'

/**
 * Parallel execution - scenario-2
 */

test('Open Amazon',async({page,browserName})=>{

    await page.goto("https://amazon.com")
    console.log('amazon opened')
    console.log(`Running test on ${browserName}`)

})