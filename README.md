**Test Cases Explained**
studentPage:
Verify that the Student page on entrata.com loads correctly and displays the expected content.

militaryPage:
Checks that the Military page loads correctly and that the expected content is visible.

resourcesPage:

Verify that the Guides page (referred to as "resources") loads properly and displays the expected content.

blogPage:

Verify that the Blog page loads correctly and that the first blog post is visible.


**Common Elements -**

Use of WebDriverWait: Uses a WebDriverWait to handle dynamic content loading, 

Assertions: Uses Assert.assertTrue() to validate conditions:

Setup: The @BeforeClass method sets up the WebDriver, maximizes the browser window, and navigates to the Entrata homepage.

Execution: Each @Test method executes independently, interacting with various links and validating the content on the respective pages.

Teardown: The @AfterClass method ensures that the WebDriver quits and closes the browser after all tests have been run, freeing up resources.
