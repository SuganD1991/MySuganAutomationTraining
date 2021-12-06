describe('My Suite', function () {


    before(function () {

        cy.fixture('example').then(function (test_data) {
            this.credentials = test_data
        })
    })
   
   
   
   
   
   
    it('Test Case 1', function () {
        cy.visit(this.credentials.url)
        cy.get('input[id=txtUserID]').type(this.credentials.user)
        cy.get('input[id=txtPassword]').type(this.credentials.password)
        cy.get('#sub > span').click()
    })

})