Feature: Web table user order feature

  @wip
  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

  @femaleScientist
  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table
    @maleScientists
    Examples: Famous female scientists
      | productType | quantity | customerName      | street    | city   | state   | zipCode | cardType   | cardNumber       | expDate | expectedName      |
      | MoneyCog    | 2        | Marie Curie      | London st | London | England | 50505   | Visa       | 6501445510102251 | 12/26   | Marie Curie       |
      | MoneyCog    | 4        | Filora Halmurat   | Via Bach  | Padua  | Italy   | 35132   | MasterCard | 6501445510102251 | 12/26   | Filora Halmurat   |
      | MoneyCog    | 6        | Sultangul Ablimit | London st | London | England | 50505   | Visa       | 6501445510102251 | 12/26   | Sultangul Ablimit |

    Examples: Famous male scientists
      | productType | quantity | customerName    | street    | city   | state   | zipCode | cardType   | cardNumber       | expDate |expectedName      |
      | MoneyCog    | 2        | Mehmud Qeshghri | London st | London | England | 50505   | Visa       | 6501445510102251 | 12/26   |Mehmud Qeshghri   |
      | MoneyCog    | 4        | Emir Temur      | Via Bach  | Padua  | Italy   | 35132   | MasterCard | 6501445510102251 | 12/26   |Emir Temur        |
      | MoneyCog    | 6        | Yusuf Has Hajip | London st | London | England | 50505   | Visa       | 6501445510102251 | 12/26   |Yusuf Has Hajip   |