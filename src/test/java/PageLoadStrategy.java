import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadStrategy {
  private static final org.openqa.selenium.PageLoadStrategy NORMAL = null;

public static void main(String[] args) {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    WebDriver driver = new ChromeDriver(chromeOptions);
    try {
      // Navigate to Url
      driver.get("http://192.168.10.10:8080/omniapp/pages/login/loginapp.app");
    } finally {
      driver.quit();
    }
  }
}
