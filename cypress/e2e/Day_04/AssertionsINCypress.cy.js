

describe('Implicit and explicit assertion',()=>
{
    it.skip('Implicit Assertion',()=>{

        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        // cy.url().should('include','orangehrmlive') //checking some text present in entire URL

        // //eq- checks the equality  (end to end ) url validation
        // cy.url().should('eq','https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

        // cy.url().should('contain','orangehrm') ////checking some text present in entire URL
        // cy.url().should('not.contain','greenhrm')

        cy.url()
            .should('include',"orangehrmlive")
            .and('eq','https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
            .and('contain','orangehrm')
            .and('not.contain','greenhrm')
    })


    it.skip('Implicit assertion on UI elements',()=>{
            cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
            cy.title().should('eq','OrangeHRM')
            cy.title().should('contain','HRM')
            cy.title().should('include','Orange')

            //check the existence of element | visiblility of element |
            cy.get('.orangehrm-login-branding > img').should('be.visible').and('exist')

            'have.length'

            //check entered value
            cy.get("input[name='username']").type("Admin")
            cy.get("input[name='username']").should('have.value','Admin')
    })


    it.only('Explicit Assertion',()=>{
        cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
        cy.get("input[name='username']").type("Admin")
        cy.get("input[name='password']").type("admin123")
        cy.get("button[type='submit']").click();

        let expName ="My First JBL";
        cy.get(".oxd-userdropdown-name").then((strUserName)=>{
                 let actName =  strUserName.text();

                 expect(actName).to.equal(expName);   //| BDD style
                 assert.equal(actName,expName)  //TDD style
        })
    })
})