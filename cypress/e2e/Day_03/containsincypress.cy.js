

describe("Cypress contains()",()=>{


    it('demo contains scenarios',()=>{


        cy.visit("https://automationexercise.com/");

        cy.contains("Signup / Login").click();

        cy.contains('Login to your account').should('be.visible')

        cy.contains('a','Home').click();

        cy.contains('a','Products').click();


        cy.contains('.product-image-wrapper','Blue Top').contains('Add to cart').click();

        cy.contains('.modal-content','View Cart').click()

        cy.contains('Shopping Cart').should('be.visible')

    })
})