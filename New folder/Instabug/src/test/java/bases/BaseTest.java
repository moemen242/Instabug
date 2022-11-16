
package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import pages.HomePage;

public class BaseTest {

    protected HomePage homePage;
    private WebDriver driver;

@BeforeClass
    public void setUp(){

    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }


@AfterClass
    public void tearDown(){
        driver.quit();
    }


}
