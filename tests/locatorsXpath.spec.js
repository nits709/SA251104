

import {test,expect} from '@playwright/test';

test("loginScenarioWithXpath",async({page})=>{

    await page.goto("https://demoblaze.com/index.html")
    await page.locator("//a[@id='login2']").click();

})