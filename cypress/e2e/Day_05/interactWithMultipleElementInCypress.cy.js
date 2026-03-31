

describe("Interact Multiple", () => {

    // it("get the size of element", () => {

    //     cy.visit("https://automationexercise.com/category_products/1")

    //     //below locators returns total number of element present in page
    //     cy.get('.features_items .col-sm-4').then((el) => {

    //         const totalLength = el.length;
    //         cy.log("size of element " + totalLength)

    //     })
    // })

    // it("get the size of element", () => {

    //     cy.visit("https://automationexercise.com/category_products/1")

    //     //below locators returns total number of element present in page
    //     cy.get('.features_items .choose a').then((el) => {

    //         const totalLength = el.length;
    //         cy.log("size of element " + totalLength)

    //         cy.log(el.eq(1).text())

    //         for (let i = 0; i < totalLength; i++) {
    //             cy.log(el.eq(i).text());
    //         }

    //     })
    // })


        it("click on product tile one by one", () => {
            cy.visit("https://automationexercise.com/category_products/1")

            cy.screenshot("Test1")  // takes full page screenshot

            //below locators returns total number of element present in page
            cy.get('.features_items .choose a').then((el) => {

                const totalLength = el.length;  // || total element count
                cy.log("size of element " + totalLength);

                for (let i = 0; i < totalLength; i++) {
                    cy.log(el.eq(i).text());
                    cy.get('.features_items .choose a')
                        .eq(i)
                        .click()


                    //catpure the title of page
                    cy.title().then((title) => {
                        cy.log(title)
                    })

                    //navigation commands
                    cy.go('back')

                }

            })
        })


    

})