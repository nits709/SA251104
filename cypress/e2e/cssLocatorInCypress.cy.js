


/**
 * in selenium driver.findElement
 * in cypress - find locator user get function
 */
describe("find element with CSS locatos",()=>{

    it("locators excercise",()=>{

        cy.visit("https://automationexercise.com/")

        cy.get("[href='/products']").click(); // click on the element
        cy.get("input[name='search']").type("T-shirts")  // to enter the string in field use type in cy
        cy.get("button[id='submit_search']").click();


    })

})