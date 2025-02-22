# Rokomari.com Automation using using Page object Model
# [Live Allure Report](http://192.168.0.107:13088/index.html#)

## Technology used
  
- Test tool:  Selenium Webdriver 
- Language: Java  
- Architecture: POM
- Framework: TestNG
- IDE: IntelliJ IDEA  
  
## Pre Requisites:
  
- Open/install Java JDK 16 version on your PC  
- Install Maven on your PC  
- Install TestNG on your IDE  
- Install Intellij/Eclipse or any other IDE  
- Setup Java, and Maven environment on your PC  
- Chrome Browser  

## The Steps executed in this Automation are:

### TestCase 01: Test_001_HomePage

- Open the Chrome browser
- Go to Rokomari Web Site
- Maximize the browser window
- Wait for complete Pageload
- Perform testing 
- Take a screenshot 

### TestCase 02: Test_002_SignUpPage

- Hover on Sign In button
- click on Sign In button
- Provide gmail credential and complete Sign up/ Sign IN
- Perform testing
- Take a screenshot 

### TestCase 03: Test_003_SelectProduct
- Hover on লেখক & click-on হুমায়ূন আহমেদ
- Wait for Complete Pageload
- Fileter Category by selecting সমকালীন উপন্যাস and রচনা সংকলন ও সমগ্র
- Scroll down and click on next to move to next page 
- Wait for Complete Pageload
- Select any book on the page to add-to-card
- Perform testing
- Take screenshot

### TestCase 04: Test_004_MyCartPage

- Click cart icon to go to My-cart page 
- Wait for Complete Pageload
- Perform testing
- Take screenshot

### TestCase 05: Test_005_ShippingPage

- Click on Proceed to Checkout Button
- Wait for Complete Pageload
- Fill up forms with with name & phone number
- Select খাগড়াছড়ি from drop-down as a City
- Select দীঘিনালা from drop-down as an Area
- Select বাবুছড়া ইউনিয়ন from drop-down as a Zone
- Provide address text in the text field 
- Select COD as a payment option
- Scroll-down & show Confirm Order Button
- Perform testing
- Take Screenshot

### TestCase 06: Test_006_Logout

- Click on User Name Button
- Click on User sign Out Button from drop-down 
- Perform testing
- Take Screenshot
- Close browser


## Run the script:
- Right Click on testng.xml file
- Then select Run as TestNG
- Run the Cases
- Close the program


## Authors
[@biplabkumarkundu](https://github.com/biplabkumarkundu/)

## Data Driven testing, Iframe, Alert, and so on. Check this project.
[Othoba.com Automation Using POM](https://github.com/biplabkumarkundu/WebAutomation_Othoba.com_Selenium_TestNG_POM_Allure)
