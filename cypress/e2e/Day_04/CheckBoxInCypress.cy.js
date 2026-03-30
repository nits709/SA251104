
describe('check radio button interactions',()=>{


    it('checkbox',()=>{
    cy.visit("https://testautomationpractice.blogspot.com/")
    cy.get("input#sunday").should('be.visible')

   // not checked | not.be.checked and for checked - be.checked
    cy.get("input#sunday").should('not.be.checked')

    //checking the sunday checkbox - sunday 
    // check() | click  
    
  //  cy.get("input#sunday").check().should('be.checked')       // turns from not to check
       // cy.get("input#sunday").click();

       //provide 7 mathcing node | select checkbox in one go
    //    cy.get(".form-check-input[type='checkbox']").check().should('be.checked')

    //     cy.wait(2000)
    //    cy.get(".form-check-input[type='checkbox']").uncheck().should('not.be.checked')


    //which returns 7 matching node | want to check 1st and 7th index
    //eq() , first and last


    cy.get(".form-check-input[type='checkbox']").first().check().should('be.checked')

    cy.wait(2000)

    cy.get(".form-check-input[type='checkbox']").last().check().should('be.checked')

    
    })
})