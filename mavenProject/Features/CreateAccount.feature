Feature: Register

Scenario: Successful registration of new Customer(s)
	Given User Launch the chrome Browser
	When User visits "https://luni-interface-029.vercel.app/" with title "Home - StyleMate"
	Then Click on the human icon
	Then Click on Create Account Link
	Then User enters Firstname as "firstname" Lastname as "lastname" Email as "firstlast@gmail.com" Password as "pass123"
	Then Click on Create Account
	Then Close the window

Scenario Outline: Registering More Customers
	Given User Launch the chrome Browser
	When User visits "https://luni-interface-029.vercel.app/" with title "Home - StyleMate"
	Then Click on the human icon
	Then Click on Create Account Link
	Then User enters Firstname as "<firstname>" Lastname as "<lastname>" Email as "<email>" Password as "<password>"
	Then Click on Create Account
	Then Close the window
	
	Examples:
		| firstname | lastname | email | password |
		| first1 | last1 | emailExample1@gmail.com | d*^*a231s |
		| first2 | last2 | emailExample2@gmail.com | e*^*b231s |
		| first3 | last3 | emailExample3@gmail.com | f*^*c231s |



#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
