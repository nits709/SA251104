

/**
 * 
 * before/After is similar to before/After Test in selenium
 * before/After Each is similar to before/After Method inselenium
 * 1. before(): this block of code run once before all testcases runs are present inside the describe - test suite
  2. after(): this block of code runs once after all testcases runs are present inside the describe - test suits
  3. beforeEach(): Runs before each testcases (it block) which are present inside the describe suites
  4. afterEach(): Runs After each testcases (it block) which are present inside the describe suites
 */


describe("Hooks in cypress",()=>{

    before("LaunchBrowser",()=>{
       cy.log("launch browser")
    })

    beforeEach("Launch URL",()=>{
    cy.log("Launch application URL")
 })

 after("ClosedBrowser",()=>{
    cy.log("quit browser")
 })

 afterEach("Release allObjects",()=>{
 cy.log("shutdown application")
})

    it('test facebook application',()=>{
        cy.log("facebook application is executing")
    })


    it("test gmail application",()=>{
        cy.log("gmail application is executing")
    })

    it("testC ",()=>{
        cy.log("test c is executing")
    })
})