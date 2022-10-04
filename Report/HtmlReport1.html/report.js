$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/featureser/amazon.feature");
formatter.feature({
  "name": "User Purchase the product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Launch The Application Url.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Category From The Dropdown.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Category_From_The_Dropdown()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d105.0.5195.127)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-GC40ON1D\u0027, ip: \u0027192.168.43.9\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.127, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\PURUSH~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:53430}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 98b501e5fadf0f8ef46aeb32cd88b7b3\n*** Element info: {Using\u003did, value\u003dsearchDropdownBox}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat com.stepdefinition.StepDefinition.user_Select_The_Category_From_The_Dropdown(StepDefinition.java:40)\r\n\tat ✽.user Select The Category From The Dropdown.(src/test/java/com/featureser/amazon.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Enter The Product in Search Box",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Product_in_Search_Box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check On The Suggestions and Click On The Matching Suggestion.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.check_On_The_Suggestions_and_Click_On_The_Matching_Suggestion()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Product List Out Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Check The Number Of Products Under Results",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Check_The_Number_Of_Products_Under_Results()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d105.0.5195.127)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-GC40ON1D\u0027, ip: \u0027192.168.43.9\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.127, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\PURUSH~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:53430}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 98b501e5fadf0f8ef46aeb32cd88b7b3\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027MORE RESULTS\u0027]//following::div[contains(@class,\u0027sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:432)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy19.size(Unknown Source)\r\n\tat com.stepdefinition.StepDefinition.user_Check_The_Number_Of_Products_Under_Results(StepDefinition.java:86)\r\n\tat ✽.user Check The Number Of Products Under Results(src/test/java/com/featureser/amazon.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Check The Number Of Products Under More Results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Check_The_Number_Of_Products_Under_More_Results()"
});
formatter.result({
  "status": "skipped"
});
});