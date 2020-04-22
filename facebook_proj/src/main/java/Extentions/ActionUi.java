package Extentions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ActionUi
{
    public static void click(WebElement Selector)
    {
        Selector.click();
    }

    public static void SetText(WebElement Input, String value)
    {
        Input.sendKeys(value);
    }

    public static String getValue(WebElement Element)
    {
        return Element.getAttribute("value");
    }
}
