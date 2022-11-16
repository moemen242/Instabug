package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private WebDriver driver;



    public SearchPage(WebDriver driver){
        this.driver=driver;
    }
    private By img = By.className("s-image");
    private By info = By.className("a-size-medium a-color-base a-text-normal");

    public  String getInfo()
    {
       return driver.findElement(info).getText();

    }

}
