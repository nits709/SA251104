
describe("Automation login",function(){


    it("xpath scenario", function(){

        cy.visit("https://automationexercise.com/login")
        cy.xpath("//input[@data-qa='login-email']").type("nitin@gmail.com")
        cy.xpath("//input[@data-qa='login-password']").type("adasdasdasdad")
        cy.xpath("//button[@data-qa='login-button']").click();


    })
})