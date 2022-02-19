Feature: Hotel Booking in Adactin Application
Scenario: Login page
Given User launch the Application
When User enter the Username in Username Field
And User enter the Password in Password Field
Then User click the Login Button to Navigate to Search Hotel page

Scenario: Search Hotel Page
When User select the hotel location
And User select the hotel
And User select Room Type
And User select No of Rooms
And User select the check-in Date
And User select the check-out Date
And User enter the adults per in Room
And User enter the child per in Room
Then User click the login Button it will navigate to Select Hotel Page

Scenario: Select Hotel Page
When User select the Button to Select Hotel
Then User click the Continue it will navigate to Booking Page

Scenario: Book A Hotel Page
When User enter the First Name in First Name Field
And User enter the Last Name in Last Name Field
And User enter the Billing Address in the Field
And User enter the Credit Card No in the Credit Card No Field
And User select the Credit Card Type
And User select the exp month of Card
And User select the exp year of Card
And User enter the ccv number in the ccv Field
Then Click the Book Button it will navigate to Confirmation Page

Scenario: Booking Confirmation Page
Then Click the My iternerary Button it will navigate to Booked iternerary Page
Scenario: Booked Iternerary Page
Then Click Logout Button