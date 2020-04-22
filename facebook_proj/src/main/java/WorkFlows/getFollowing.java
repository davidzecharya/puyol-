package WorkFlows;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.commonOps;
import Extentions.ActionUi;

public class getFollowing extends commonOps
{
    public static void getFollowingData(String name) throws InterruptedException
    {
        ActionUi.SetText(ElementIg.search, name);
        Thread.sleep(5000);
        ActionUi.click(ElementIg.searchResult.get(0));
        Thread.sleep(10000);
        ActionUi.click(ElementIg.PostOrFollowersOrFollowing.get(2));
        Thread.sleep(4000);
        scrollDown(ElementIg.countMember.get(1).getText());
    }

    public static void getNames() throws InterruptedException
    {
        String[] names = new String[ElementIg.FollowingNames.size()];
        String[] href = new String[ElementIg.FollowingHref.size()];
        String[] img = new String[ElementIg.FollowingHref.size()];

        for (int i = 0; i < ElementIg.FollowingNames.size();i++){
            names[i] = ElementIg.FollowingNames.get(i).getText();
            href[i] = ElementIg.FollowingHref.get(i).getAttribute("href");
            img[i] = ElementIg.FollowingImage.get(i+1).getAttribute("src");
            System.out.println(names[i] + "/    " + href[i] + "/    " + img);
        }
    }

//
//    public static ImageIO image()
//    {
//
//        //elemImg.get_attribute('src')
//    }




    public static void scrollDown(String count) throws InterruptedException
    {
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        ActionUi.click(ElementIg.allowScroll.get(0));
        for (int i = 0; i < Integer.parseInt(count); i = ElementIg.FollowingNames.size())
        {
            actions.sendKeys(Keys.chord(Keys.END)).perform();
            Thread.sleep(4000);
            ActionUi.click(ElementIg.allowScroll1.get(i/3));

        }
    }


}
