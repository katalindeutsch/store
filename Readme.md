# Nagras's online store
> A simple shopping application, where you can find your desired products in the catalogue, add to your basket and get huge discounts!
>Don't worry, if you change your mind, you can remove the items with one click!

# New Features!
If you are a customer:
  - Add items to your basket (more of one type)
  - Remove items from your basket
  - Check the total price of the basket (including any discount)
  - Check the available items in the catalogue (with their stock count)

What Nagra provides:
  - Adds new items to the catalogue (with the stock count)
  - Removes items from the catalogue if the are already sold
  - Shows you the available items (and the stock count) with a unique identifier of the product
  - Provides you discounts of different types of item
#

#Admin side of the documentation
>The correct implementation of all the methods and services, is essential to create a quality product. To make sure that Nagra provides the best, all the implementations are covered with testcases.

How to find the tests:
  - They are all implemented in the ```src\test ``` folder
  - The step definitions are in ```src\test\java\com\nagra\stepdefinitions```
  - The feature files can be found in ```src\test\resources\com\nagra```

You should know about the tests:
  - The test folder forms a whole unit, for the unit testing
  - Feature files are implemented in Gherkin and they use the stepdefinitions
  - Step definitions are implemented in Java classes
  - ```App.Test``` is the runner java class, with cucumber running options
  - After each run, a folder is generated with the results: ```target\report```