package com.mobicule.mcollectsettlementnew.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class EntrataSeleniumTests {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.entrata.com");
    }

    @Test
    public void teststudentPage() {
        WebElement studentLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Student")));
        studentLink.click();

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("student"), "student page title is incorrect.");


        WebElement studentContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".student-content-class")));

        Assert.assertTrue(studentContent.isDisplayed(), "student content is not displayed.");
    }

    @Test
    public void testmilitaryPage() {
        WebElement militaryLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Military")));
        militaryLink.click();

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("military"), "military page title is incorrect.");



        WebElement militaryContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".military-content-class")));
        Assert.assertTrue(militaryContent.isDisplayed(), "military content is not displayed.");
    }

    @Test
    public void testresourcesPage() {
        WebElement resourcesLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Guides")));
        resourcesLink.click();

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("resources"), "resources page title is incorrect.");



        WebElement resourcesContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".guides-content-class")));
        Assert.assertTrue(resourcesContent.isDisplayed(), "resources content is not displayed.");
    }

    @Test
    public void testblogPage() {
        WebElement blogLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Blog")));
        blogLink.click();

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("blog"), "blog page title is incorrect.");



        WebElement firstblogPost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".blog-post-title")));

        Assert.assertTrue(firstblogPost.isDisplayed(), "First blog post is not displayed.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}