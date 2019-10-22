import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoopThroughList
{
	WebDriver driver;

	@Before
	public void setup()
	{
		driver = new ChromeDriver();
	}

	@Test
	public void loop_ordered_list()
	{
		driver.get("https://sauceaaron.github.io/Lists/");
		List<WebElement> elements =  driver.findElements(By.tagName("li"));

		for(WebElement element : elements)
		{
			System.out.println(element.getText());
		}
	}

	@After
	public void teardown()
	{
		driver.quit();
	}
}
