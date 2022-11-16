package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchField = By.id("twotabsearchtextbox");
    private By searchBtn = By.id("nav-search-submit-button");

    public SearchPage clickSearchField (){
        driver.findElement(searchBtn).click();
        return new SearchPage (driver);
    }
    public void setSearch(String field){
        driver.findElement(searchField).sendKeys(field);
    }
    public SearchPage clickSearchBtn(){
        driver.findElement(searchBtn).click();
        return new SearchPage(driver);
    }
}
