
Feature: Title of your feature
  I want to use this template for my feature file

  

  Scenario Outline: Title of your scenario outline
   	Given user loads the addproductAPI with the payload of "<userid>","<file>"
		When user calls the post http method with "addProductAPI"
		Then user should see the response as 201

    Examples: 
      | userid  | file | 
     
