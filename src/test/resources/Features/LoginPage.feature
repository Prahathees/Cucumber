Feature: To verify Adactin Application

Scenario Outline: To verify whether order id is generated
Given User is on the Adactin login page
When User should enter the Username, Password and click the login button

|username|prahathees|
|password|12345abcd|

And User should enter the "<location>", "<no_of_rooms>","<checkin_date>","<checkout_date>", "<adults_per_room>" and click serach button in Search hotel page
And User should select the hotel from Select Hotel page

And User should enter the first_name, last_name, address, Credit_no, CC_type, exp_month, exp_year and CVV in the Book A Hotel page

|first_name|last_name|address|Credit_no|CC_type|exp_month|exp_year|CVV|
|Prahathees|Anbazhagan|Kodambakkam, Chennai-24|1254789654231574|VISA|January|2020|125|

Then The order id should be generated 

Examples: 

|location|no_of_rooms|checkin_date|checkout_date|adults_per_room|
|Sydney|2 - Two|20/09/2021|21/09/2021|1 - One|
|Melbourne|1 - One|25/09/2021|25/09/2021|1 - One|
|Sydney|2 - Two|20/09/2021|21/09/2021|1 - One|
|Melbourne|1 - One|25/09/2021|25/09/2021|1 - One|
|Adelaide|2 - Two|20/10/2021|21/10/2021|1 - One|
|London|2 - Two|13/10/2021|14/10/2021|2 - Two|
|New York|1 - One|20/09/2021|21/09/2021|1 - One|
|Melbourne|2 - Two|29/09/2021|30/09/2021|2 - Two|
|Paris|3 - Three|20/11/2021|21/11/2021|1 - One|
|Adelaide|2 - Two|27/09/2021|28/09/2021|2 - Two|
|Melbourne|3 - Three|20/09/2021|21/09/2021|1 - One|
|Los Angeles|2 - Two|20/10/2021|21/10/2021|2 - Two|
