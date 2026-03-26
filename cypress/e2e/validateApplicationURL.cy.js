

describe("validate launch URL",()=>{
    it("validate application URL - positive",()=>{
    cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    cy.title().should('eq','OrangeHRM')
    cy.log("Application URL Launch");
    
    })


    it("validate application URL - negative",()=>{
        cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
        cy.title().should('eq','OrangeHRM123')
        cy.log("Application URL Launch");
        
        })
})