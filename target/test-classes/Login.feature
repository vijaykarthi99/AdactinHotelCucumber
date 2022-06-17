Feature: validate acadin hotel Login

  Scenario Outline: validate the Login page maodel
    Given user is an Login page
    When user given a valid "<username>" and valid "<password>"
    And user click on button
    Then you are succesfully login
    When user as Select "<Location>"
    And user to Select "<Hotel>"
    Then user a Select the "<Room Type>"
    And user as "<Number of Rooms>"
    Then user as to Select "<Check In Date>"
    And user as for Select "<Check Out Date>"
    Then user to a Select "<Adults per Room>"
    And user for Select "<Children per Room>"
    Then user as Click for Search button
    Then user as Click the radio button and click the continue
    And user as give the "<First Name>"
    Then user as give to the "<Last Name>"
    And user given the "<Billing Address>"
    Then user as give a "<Credit Card No>"
    And user as Select the "<Credit Card Type>"
    Then user as Select to the "<Expiry Date Month>" and "<Expiry Date Year>"
    And user give a "<CVV Number>"
    Then user Click the BookNow button
    Then user Click the MyItinerary
    And user get the OrderNo
    And User Click the Logout button
    Then User get the successfully logged out message

    Examples: 
      | username   | password  | Location | Hotel        | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address                    | Credit Card No   | Credit Card Type | Expiry Date Month | Expiry Date Year | CVV Number |
      | vijaymaniG | Y5QELK | Paris    | Hotel Hervey | Double    | 3 - Three       | 30/04/2022    | 01/05/2022     | 3 - Three       | 3 - Three         | Vijaymani  | Ganesan   | 20/1a,Nartheast street,venis,europ | 8638973276328724 | American Express | February          |             2015 |        123 |
    #  | vijaymaniG | vidhun14# | sedney   | Hotel Hervey | Double    | 2 - Three       | 01/05/2022    | 02/05/2022     | 1 - Three       | 2 - Three         | Vijay      | Mani      | 20/1a,Weasteast street,india,Asia  | 8638973276328456 | VISA             | April             |             2017 |        243 |
