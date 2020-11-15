$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/nagra/testcases/ItemTesting.feature");
formatter.feature({
  "name": "Item testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add new item to basket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an empty basket",
  "keyword": "Given "
});
formatter.match({
  "location": "ItemTesting.an_empty_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer adds a new item to the basket",
  "keyword": "When "
});
formatter.match({
  "location": "ItemTesting.the_customer_adds_a_new_item_to_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the total price changes",
  "keyword": "Then "
});
formatter.match({
  "location": "ItemTesting.the_total_price_changes()"
});
formatter.result({
  "status": "passed"
});
});