Feature: checking Ecommerce website API

@login
Scenario: logging in to the API

Given user loads the API with the "loginpayload"
When user calls the post http method with "loginAPI"
Then user should see the response as 200


@AddProduct
Scenario: Adding the product

Given user loads the addproductAPI with the payload
When user calls the post http method with "addProductAPI"
Then user should see the response as 201


@CreateOrder
Scenario: creating the order

Given user loads the API with the "Createorderpayload"
When user calls the post http method with "createOrderAPI"
Then user should see the response as 201


@DelOrder
Scenario: Delete the order

Given user loads the API with the "Delorderpayload"
When user calls the delete http method with "DelOrderAPI"
Then user should see the response as 404