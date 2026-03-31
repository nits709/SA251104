

describe("Handling dropdown",()=>{

it("automate select tagname dropdown",()=>{

    cy.visit("https://testautomationpractice.blogspot.com/")

    cy.get('#country')
        .select('germany')
        .should('have.value','germany') //select option by value attribute and validation also

        cy.wait(2000)
        cy.get('#country')
        .select('Japan')  // selecting the option by visible text/inner
        .should('have.value','japan')

        cy.wait(2000)

        cy.get('#country')
        .select(5)  // select by index where dropdown index was started from 0
        .should('have.value','australia')
        cy.screenshot("FullPage_withSelectDD")
 
})

it("automating dropdown without select tagname",()=>{

    cy.visit("https://www.dummyticket.com/dummy-ticket-for-visa-application/")
    cy.get('#select2-reasondummy-container').click();
    cy.get('.select2-search__field').type('Prank a friend').type('{enter}')
    cy.get('.select2-selection__rendered').should('have.text','Prank a friend')
    cy.screenshot("FullPage_withoutSelectDD")
})






})