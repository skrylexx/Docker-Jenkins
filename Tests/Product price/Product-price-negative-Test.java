// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ProductpricenegativeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void productpricenegative() {
    // Test name: Product-price-negative-
    // Step # | name | target | value | comment
    // 1 | open | https://skrylexx.github.io/Products_CRUDS/ |  | 
    driver.get("https://skrylexx.github.io/Products_CRUDS/");
    // 2 | setWindowSize | 974x1039 |  | 
    driver.manage().window().setSize(new Dimension(974, 1039));
    // 3 | click | id=inputName |  | 
    driver.findElement(By.id("inputName")).click();
    // 4 | type | id=inputName | Aaa | 
    driver.findElement(By.id("inputName")).sendKeys("Aaa");
    // 5 | type | id=inputPrice | -150 | 
    driver.findElement(By.id("inputPrice")).sendKeys("-150");
    // 6 | click | css=body |  | 
    driver.findElement(By.cssSelector("body")).click();
    // 7 | click | id=btnAdd |  | 
    driver.findElement(By.id("btnAdd")).click();
    // 8 | assertElementPresent | id=alertPrice |  | 
    {
      List<WebElement> elements = driver.findElements(By.id("alertPrice"));
      assert(elements.size() > 0);
    }
  }
}
