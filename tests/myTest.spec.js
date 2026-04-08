import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://autotestacademy.com/');
  await page.getByRole('link', { name: 'Login / Sign Up' }).click();
  await page.getByRole('textbox', { name: 'john@example.com' }).click();
  await page.getByRole('button', { name: 'Don\'t have an account? Sign Up' }).click();
  await page.getByRole('textbox', { name: 'JohnDoe' }).click();
  await page.getByRole('textbox', { name: 'JohnDoe' }).click();
  await page.getByRole('textbox', { name: 'JohnDoe' }).fill('johnDoe');
  await page.getByRole('textbox', { name: 'JohnDoe' }).press('Tab');
  await page.getByRole('textbox', { name: 'john@example.com' }).fill('john@yopmail.com');
  await page.getByRole('textbox', { name: 'john@example.com' }).press('Tab');
  await page.getByRole('textbox', { name: '••••••••' }).fill('Smart@123');
  await page.getByRole('button', { name: 'Create Account' }).click();
  await page.getByRole('button', { name: 'Logout' }).click();
});