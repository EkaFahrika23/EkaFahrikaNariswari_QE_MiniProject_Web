package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://alta-shop.vercel.app/")
public class AltaShopPage extends PageObject {

    public static Target LOGIN = Target.the("login").locatedBy("//button/span/i[contains(@class,'v-icon')]");
    public static Target FIELD_EMAIL = Target.the("email").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static Target FIELD_PASSWORD = Target.the("password").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");

    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("//Span[contains(text(),'Login')]");

//    public static Target HOME_PAGE = Target.the("Home Page").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[contains(text(),' Enormous Cotton Computer '");

//    public static Target ALERT_MESSAGE = Target.the("Alert message").locatedBy("//main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]/div[contains(text(),'record not found')]");
    public static Target DETAIL_BUTTON = Target.the("detail product").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]");

    public static Target BUY_BUTTON = Target.the("Buy Product").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[2]");

    public static Target CART_BUTTON = Target.the("Cart button").locatedBy("//header/div[1]/button[1]");

    public static Target ADD_PRODUCT = Target.the("Add product").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]");

    public static Target PURCHASE = Target.the("Purchase product").located(By.id("button-bayar"));

    public static Target PROFILE_BUTTON = Target.the("Profile button").locatedBy("//header[1]/div[1]/button[2]");

    public static Target TRANSACTION_BUTTON = Target.the("TransactionButton").locatedBy("//body/div[@id='app']/div[2]/div[1]/div[@id='list-item-13485']");

    public static Target LOGOUT_BUTTON = Target.the("Logout Button").located(By.id("list-item-13487"));
}
