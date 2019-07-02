$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/search multiple product.feature");
formatter.feature({
  "name": "search multiple product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search for product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user search for product",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "travel kit"
      ]
    },
    {
      "cells": [
        "headphone"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "searchmultipleproduct.user_search_for_product(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify and display",
  "keyword": "And "
});
formatter.match({
  "location": "searchmultipleproduct.verify_and_display()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close application",
  "keyword": "Then "
});
formatter.match({
  "location": "searchmultipleproduct.close_application()"
});
formatter.result({
  "status": "passed"
});
});