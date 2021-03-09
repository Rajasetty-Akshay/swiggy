Feature: login to swiggy

  Scenario Outline: loggin to swiggy successfully
    Given user has opened swiggy website on chrome browser
    When user eneters correct "<phonenumber>"
    Then user should be able to login successfuly
    
   Examples:
    		| phonenumber |
    		| 8197373629  |

