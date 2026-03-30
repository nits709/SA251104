describe("learning parent and child relation in locators",()=>{

    //skip and only

it("Childern locator exercise",()=>{

cy.visit("https://automationexercise.com/category_products/1")
cy.get(".features_items").children(".col-sm-4").should('have.length',3) // 3

//cy.get(".features_items").children(".single-products").should('have.length',3)

})

it("find locaotr exercise",()=>{
    cy.visit("https://automationexercise.com/category_products/1")
    cy.get(".features_items").children(".col-sm-4")
    .eq(1)  //0 - 1 | 1 -- second
    .find("[href='/product_details/4']")
    .should('have.text','View Product')
})


it.only("validate number of checkbox",()=>{


    cy.visit('https://omayo.blogspot.com/')
    cy.get("[type='checkbox']").should('have.length',7)

    // in order to check pen checkbox
    //cy.get("[type='checkbox']").eq(3).click();  //| approach-1

    cy.get("[type='checkbox']").filter("[value='Pen']").eq(1).click(); //| apporach-2

})


})