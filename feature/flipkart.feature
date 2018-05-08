Feature: Adding items into the Flipkart Addcart


  
  Scenario Outline: Adding some items into the cart 
    Given user navigates to the Flipkart.com
    When  user added items " <sam1> " , " <sam2> " ," <sam3> " ," <sam4> " ," <sam5> " into the cart
    Then 	items should get added successfully

    Examples:
     
      |sam1|sam2|sam3|sam4|sam5|
      |Samusng|Samsung|Samsung|Samsung|Samsung|
  