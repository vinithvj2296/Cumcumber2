$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobilePurchasevaliidation.feature");
formatter.feature({
  "name": "Mobile purchase validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Mobile purchase validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "Mobilepurchasevalidation.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User handles login",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilepurchasevalidation.user_handles_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search mobile",
  "keyword": "When "
});
formatter.match({
  "location": "Mobilepurchasevalidation.user_search_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the mobile",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilepurchasevalidation.user_select_the_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validating Mobile name",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilepurchasevalidation.user_validating_Mobile_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validating Mobile price and offers",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilepurchasevalidation.user_validating_Mobile_price_and_offers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validating pincode by invalid code",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilepurchasevalidation.user_validating_pincode_by_invalid_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add to cart and validating product delivery date",
  "keyword": "Then "
});
formatter.match({
  "location": "Mobilepurchasevalidation.add_to_cart_validating_product_delivery_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validating total price details",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilepurchasevalidation.validating_total_price_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});