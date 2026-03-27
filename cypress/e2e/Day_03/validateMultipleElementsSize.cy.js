

describe("validate multiple Product",function(){

    it("validate total men tshirt on page",function(){

        cy.visit("https://automationexercise.com/products")
        cy.get("[href='#Men']").click();
        cy.get("[href='/category_products/3']").click();


        //search an element and hold number of matching node and validate against  expected size
        cy.get('.features_items .col-sm-4').should('have.length',6)

    })

})