package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaPage {
	
	public WebDriver driver;

	public WikipediaPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By searchbar = By.xpath("//input[@id='searchInput']");
	By searchbutton = By.xpath("//div[@class='search-container']/form/fieldset/button/i");
	By releasedate = By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li");
	By countryofOrigin = By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr[14]/td");
	
	public WebElement getWikiSearchbar()
	{
		return driver.findElement(searchbar);
	}
	public WebElement getWikiSearchButton()
	{
		return driver.findElement(searchbutton);
	}
	public WebElement getReleaseDate()
	{
		return driver.findElement(releasedate);
	}
	public WebElement getCountryOfOrigin()
	{
		return driver.findElement(countryofOrigin);
	}
	
}
