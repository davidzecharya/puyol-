import org.testng.annotations.Test;
import utilities.commonOps;
import WorkFlows.getFollowing;
import Extentions.ActionUi;

public class connectToBrowser extends commonOps
{
    @Test(priority = 1, description = " ")
    public void login() throws InterruptedException
    {
//        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9014");
//        driver = new ChromeDriver(options);
//        driver.navigate().to("https://chromedriver.storage.googleapis.com/index.html?path=80.0.3987.106/");
////        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#email")).sendKeys("0586301887");
//        driver.findElement(By.cssSelector("#pass")).sendKeys("Bb12345678");

////Change chrome driver path accordingly
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("debuggerAddress", "localhost:4014");
//        WebDriver driver = new ChromeDriver(options);
//        System.out.println(driver.getTitle());
        //getFollowing.getFollowingData("name");
        Thread.sleep(6000);
        ActionUi.SetText(ElementIg.userName,"0586301887");
        ActionUi.SetText(ElementIg.pass,"Davidze8409558");
        Thread.sleep(6000);
        ActionUi.click(ElementIg.submit);
        Thread.sleep(10000);
        ActionUi.click(ElementIg.notNow);
    }

    @Test(priority = 2, description = " ")
    public void scroll() throws InterruptedException
    {
        Thread.sleep(3000);
        getFollowing.getFollowingData("david zecharya");
    }

    @Test(priority = 3, description = " ")
    public void getData() throws InterruptedException
    {
        Thread.sleep(3000);
        getFollowing.getNames();
    }
}


//80.0.3987.132
//C:\Program Files (x86)\Google\Chrome\Application
//chrome.exe -remote-debugging-port=9014 --user-data-dir="C:\Selenium\Chrome_Test_Profile"
