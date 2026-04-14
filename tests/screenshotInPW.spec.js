import { test } from '@playwright/test'

test('pageview screenshot', async ({ page }) => {
    await page.goto('https://demoblaze.com/')
    //await page.screenshot({path: 'Homepage.png'}) // syntax
    await page.screenshot({ path: 'tests/screenshots/pageView/' + Date.now() + '_Homepage.png' });


})

test('fullPage screenshot', async ({ page }) => {
    await page.goto('https://demoblaze.com/')
    await page.screenshot({ path: 'tests/screenshots/Fullpage/' + Date.now() + '_Homepage.png', fullPage: true });
})

test('Locator screenshot', async ({ page }) => {
    await page.goto('https://demoblaze.com/')
    //await page.screenshot({ path: 'tests/screenshots/Fullpage/' + Date.now() + '_Homepage.png', fullPage: true });

    await page.locator('#carouselExampleIndicators > div > div:nth-child(2) > img').screenshot({ path: 'tests/screenshots/locators/' + Date.now() + '_locators.png'})
})