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
        cy.get('ul.menu.menu-format-create-case-menu>li:nth-of-type(7)>a>span>span').click()
        cy.get('input[id=546ad300]').type(this.credentials.firstname)
        cy.get('input[id=6e54da89]').type(this.credentials.lastname)
        cy.get('button.Strong.pzhc.pzbutton[type="button"][title="Complete this assignment"]').click()
        
    })

    

})