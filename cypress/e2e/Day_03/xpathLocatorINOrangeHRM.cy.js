
describe("learning xpath locator in cypress",function(){

    it("xpath demo",()=>{

       cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
       cy.xpath("//input[@name='username']").type("Admin")
       cy.xpath("//input[@name='password']").type("admin123")
       cy.xpath("//button[@type='submit']").click();


    })
})