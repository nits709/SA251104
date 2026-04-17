
import { test, expect } from '@playwright/test'
const testData = require('./testData.json');

test('iframe in PW', async ({ page }) => {

    await page.goto(testData.url)


    // selecting iframe
    const frame = await page.frameLocator(testData.frameLocator)

    //get drag and drop objects
    const draggable = frame.locator(testData.draggable);
    const droppable = frame.locator(testData.droppable);


    // verify element inside iframe | draggable and droppable
    await expect(draggable).toBeVisible()
    await expect(droppable).toBeVisible()


    // dragging the element to droppable area

    await draggable.dragTo(droppable)

    await expect(droppable).toHaveText("Dropped!");

    // console.log("data "+ testData.login.admin.url)
            //testData.login.user1.droppable
    /**
     * {
     "login":{
         "admin":{
     "url": "https://jqueryui.com/droppable/",
     "frameLocator": ".demo-frame",
     "draggable": "#draggable",
     "droppable": "#droppable"
         },
 
         "user1":{
             "url": "https://jqueryui.com/droppable/",
             "frameLocator": ".demo-frame",
             "draggable": "#draggable",
             "droppable": "#droppable"
         }
     }
 }
     */




})