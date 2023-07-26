Feature:Login Page

Background:
Given search url:"https://tutorialsninja.com/demo/index.php?route=account/login"
Then QAFOX Login Page should be displayed

Scenario: Validate Login with valid credentials
Given username "ztoh@gmail.com"
Given password "ztoh_india"
And click login Button
Then QAFOX home page should be displayed

Scenario: Validate Login with Invalid credentials
Given username "ztohindia@gmail.com"
Given password "ztoh_india_pvtltd"
And click login Button 
Then  No match for E-Mail Address and/or Password should be displayed