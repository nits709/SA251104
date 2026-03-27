/**
 * describe()  - represents the suite block - collection of testcases
 * describe block have 2 parameter - suite name,function 
 * it() - testcase 
 * 2 paramter - testcaseName, function parameter - any function type.
 * 
 * Selenium --> get() - function to open/ launch URL
 * Cypress -> visit()
 */

        describe("My test Suite",function(){

            it("launch App url",function(){

                cy.visit('https://google.co.in')
                cy.log("URL launched")

            })


            it("launch OrangeHRM", function(){
                cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
                cy.log("Orange HRM url launched")

            })

        })


