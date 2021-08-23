Feature: Free CRM Create contacts

  Scenario Outline: Free CRM Create a new Conatct scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user move to new Conatct page
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then user Close the browser

    Examples: 
      | username  | password   | firstname | lastname | position |
      | muraribec | Krishana8$ | murari    | kumar    | Manager  |
      | murari123 | Krishana8$ | KUMAR     | murari   | SE       |
