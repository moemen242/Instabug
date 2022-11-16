package search;

import bases.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.SearchPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {

    private WebDriver driver;
@Test
    public void testSearchFunc(){


        homePage.setSearch("airpods");
     SearchPage searchPage = homePage.clickSearchField();
      assertTrue(driver.getTitle().contains("airpods"));
     assertEquals(searchPage.getInfo(),"airpods","not correct");


    }
}
