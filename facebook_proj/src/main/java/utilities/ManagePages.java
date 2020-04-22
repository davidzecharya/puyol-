package utilities;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends base
{
    public static void InitElem()
    {
        ElementIg = PageFactory.initElements(driver, pageObjectModel.ElementIg.class);
    }
}
