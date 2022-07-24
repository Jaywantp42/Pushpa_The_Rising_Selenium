package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbPage {

	public WebDriver driver;
	
	public ImdbPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}	
	
	By searchbar = By.xpath("//input[@id ='suggestion-search']");
	By searchbutton = By.xpath("//button[@id='suggestion-search-button']//*[@id='iconContext-magnify']");
	By clickname = By.xpath("//table[@class='findList']/tbody/tr[1]/td[2]/a");
	By releasedate = By.xpath("/html/body/div[2]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[1]/div/ul");
	By countryoforigin = By.xpath("/html/body/div[2]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[2]/div/ul/li/a");
	
	
	public WebElement getSearchBar()
	{
		return driver.findElement(searchbar);
	}
	public WebElement getsearchButton()
	{
		return driver.findElement(searchbutton);
	}
	public WebElement getMovieName()
	{
		return driver.findElement(clickname);
	}
	public WebElement getReleaseDate()
	{
		return driver.findElement(releasedate);
	}
	public WebElement getCountryOfOrigin()
	{
		return driver.findElement(countryoforigin);
	}
}
