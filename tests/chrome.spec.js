import {test} from '@playwright/test'

/**
 * Parallel execution - scenario-3
 */

test('Open Amazon',async({page})=>{

    await page.goto("https://amazon.com")
    console.log('amazon opened')

})