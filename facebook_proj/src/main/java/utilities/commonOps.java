package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class commonOps extends base
{

    public static void initBrowser(String url)
    {
        driver = InitChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static WebDriver InitChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @BeforeClass
    public void startSession()
    {
        initBrowser("https://www.instagram.com/");
        ManagePages.InitElem();
    }

    //@AfterClass
//  //  public void closeSession()
//    {
//        driver.quit();
//    }
}
