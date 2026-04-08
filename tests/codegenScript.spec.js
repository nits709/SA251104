import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://demoblaze.com/');
  await page.getByRole('link', { name: 'Log in' }).click();
  await page.getByText('Log in ×').click();
  await page.locator('#loginusername').click();
  await page.locator('#loginusername').fill('nitin@gmail.com');
  await page.locator('#loginpassword').click();
  await page.locator('#loginpassword').fill('Smart@123');
  page.once('dialog', dialog => {
    console.log(`Dialog message: ${dialog.message()}`);
    dialog.dismiss().catch(() => {});
  });
  await page.getByRole('button', { name: 'Log in' }).click();
  await page.getByRole('dialog', { name: 'Log in' }).getByLabel('Close').click();
});