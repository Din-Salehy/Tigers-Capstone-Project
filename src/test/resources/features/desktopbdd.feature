@destopTabTest
Feature: Desktops Tab

  Background: 
    Given User is on Retail website
    When User click on Desktops tab
    Then User click on Show all desktops

  @test1
  Scenario: User verify all items are present in Desktops tab
    Then User should see all items are present in Desktop page

  @tes2
  Scenario: User add HP LP 3065  from Desktops tab to the cart
    And User click  ADD TO CART option on HP LP3065item
    And User select quantity '1'
    Then User click add to Cart button
    Then User should see a Message 'Success: You have added HP LP3065 to your shopping cart!'
@test3
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click  ADD TO CART option on Canon EOS 5Ditem
    And User select color from dropdown Red
    And User select quantity '2'
    And User click add to Cart button
 #   Then User should see a Message 'Success: You have added Canon EOS 5D Camera to your shopping cart!'
@test4
  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname | yourReview            | Rating |
      | Din Salehy | The product is good in term of quality, Price wise it is afforadable as well |      4 |
    And User click on Continue Button
    Then User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'

