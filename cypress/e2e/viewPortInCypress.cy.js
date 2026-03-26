

describe("viewport scenario",()=>{


    it("Mobile viewPort Execution",()=>{

        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") // deskotp browser  viewport
        cy.log("applicaiton launched")
        cy.wait(5000) // similar like thread.sleep | accepts miliseconds format.
        cy.viewport(414,896)  // to be set on iphoneXR 
        cy.wait(5000)
        cy.viewport("samsung-s10") 
        cy.wait(5000)
    })
})