Feature: Facebook Login Feature

    @murari @smokeTesting  @testing @bdd 
	Scenario Outline: Facebook Login Test
   
    Given user is already on Login Page
    When title of login page is Facebook
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
	
	Examples:
	| username	|	password	|
	|	muraribec@gmail.com	|	jskfjsd12121	|
	
	@kumar  @regressionTesting
	Scenario: Facebook Header login   
    Given user is already on Login Page
    When title of login page is Facebook
    Then user get header of the login page
    Then user validate header of the login page


























#  Scenario Outline: Free CRM Login Test
#    #Without example keyword
#    #Given user is already on Login Page
#    #When title of login page is Free CRM
#    #Then user enters "muraribec" and "Krishana8$"
#    #Then user clicks on login button
#    #Then user is on home page
#    #With Example keyword
#    Given user is already on Login Page
#    When title of login page is Free CRM
#    Then user enters "<username>" and "<password>"
#    Then user clicks on login button
#    Then user is on home page
#    Then user Close the browser
#
#    Examples: 
#      | username  | password   |
#      | muraribec | Krishana8$ |
#      | kumar     | kumar123   |
