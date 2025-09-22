Feature: Login

@parallel
Scenario: Login into Orange HRM

Given User launches browser
When user opens orange hrm url
And Enter username and password
And click on login
Then HRM home page should be displayed

@parallel
Scenario Outline: Login into Orange HRM with data from feature file

Given User launches browser
When user opens orange hrm url "https://opensource-demo.orangehrmlive.com/"
And Enter "<username>" and "<password>"
And click on login
Then HRM home page should be displayed

 Examples:

   | username | password|
   | Admin | admin123|