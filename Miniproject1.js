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
        cy.wait(3000)
        cy.get('#sub>span').click()
        cy.wait(5000)
        cy.get('a.menu-item-anchor.menu-item-expand>span:first-of-type>span').click()
        
    })

    

})