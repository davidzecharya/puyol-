package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementIg
{
    @FindBy(css = "[placeholder=\"Search\"]")
    public WebElement search;

    @FindBy(css = "a.yCE8d")
    public List<WebElement> searchResult;

    //get(0) to post  , get(1) to Followers, get(2) to Following
    @FindBy(css = "ul li.Y8-fY")
    public List<WebElement> PostOrFollowersOrFollowing;

    @FindBy(css = "div.PZuss li div div  div.enpQJ div.d7ByH")
    public List<WebElement> FollowingNames;

    //get(0) to FollowersNumber , get(1) to FollowingNumber
    @FindBy(css = "ul li.Y8-fY a span.g47SY")
    public List<WebElement> countMember;

    @FindBy(css = "img._6q-tv")
    public List<WebElement> FollowingImage;

    @FindBy(css = "div.enpQJ div.d7ByH a")
    public List<WebElement> FollowingHref;

    @FindBy(css = "input[name=\"username\"]")
    public WebElement userName;

    @FindBy(css = "input[name=\"password\"]")
    public WebElement pass;

    @FindBy(css = ".aOOlW.HoLwm")
    public WebElement notNow;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement submit;

    @FindBy(css = "div._7UhW9")
    public List<WebElement> allowScroll;

    @FindBy(css = "div.wFPL8")
    public List<WebElement> allowScroll1;
}
