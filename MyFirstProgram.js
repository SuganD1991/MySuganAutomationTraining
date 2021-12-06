describe('My Suite', function () {
    it('Test Case 1', function () {
        cy.visit('https://freecrm.com/')
        cy.title().should('eq', '#1 Free CRM customer relationship management software cloud')
    })

    it('Test Case 2', function () {
        cy.visit('https://freecrm.com/')
        cy.title().should('eq', '#1 not CRM customer relationship management software cloud')
    })
    

})