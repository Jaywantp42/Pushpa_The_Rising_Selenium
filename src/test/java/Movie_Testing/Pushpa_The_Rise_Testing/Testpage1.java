package Movie_Testing.Pushpa_The_Rise_Testing;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.ImdbPage;
import pageObjects.WikipediaPage;

public class Testpage1 extends Base{
	String website1;
	String website2;
	String movieName;
	String releaseDate1;
	String countryOfOrigin1;
	String releaseDate2;
	String countryOfOrigin2;
	
	@Test
	public void IMDB() throws IOException
	{
		driver = initializeDriver();
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("G:\\Eclipse_installation\\Eclipse_workspace\\Pushpa_The_Rise_Testing\\src\\main\\java\\properties\\data.properties");
		prop.load(fis);
		website1 = prop.getProperty("website1");
		movieName = prop.getProperty("movieName");
		
		driver.get(website1);
		
		ImdbPage imdb = new ImdbPage(driver);
		imdb.getSearchBar().sendKeys(movieName);
		imdb.getsearchButton().click();
		imdb.getMovieName().click();
		releaseDate1 = imdb.getReleaseDate().getText();
		releaseDate1 = releaseDate1.substring(0, 15);
		System.out.println(releaseDate1);
		countryOfOrigin1 = imdb.getCountryOfOrigin().getText();
		System.out.println(countryOfOrigin1);
	}
	
	@Test()
	public void WIKI() throws IOException
	{
		driver = initializeDriver();
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("G:\\Eclipse_installation\\Eclipse_workspace\\Pushpa_The_Rise_Testing\\src\\main\\java\\properties\\data.properties");
		prop.load(fis);
		
		website2 = prop.getProperty("website2");
		movieName = prop.getProperty("movieName");
		driver.get(website2);
		
		WikipediaPage wk = new WikipediaPage(driver);
		
		wk.getWikiSearchbar().sendKeys(movieName);
		wk.getWikiSearchButton().click();
		countryOfOrigin2 = wk.getCountryOfOrigin().getText();
		System.out.println(countryOfOrigin2);
		releaseDate2 = wk.getReleaseDate().getText();
		System.out.println(releaseDate2);
	}
	
	@Test()
	public void Assert()
	{
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(countryOfOrigin1, countryOfOrigin2, "Country Condition pass");
		softAssert.assertEquals(releaseDate1, releaseDate2, "Release date matched");
		
		
	}
}
