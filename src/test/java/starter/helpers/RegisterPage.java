package starter.helpers;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://alta-shop.vercel.app/auth/register")
public class RegisterPage extends PageObject {

    public static Target NAMA_LENGKAP_FIELD = Target.the("nama lengkap field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");

    public static Target EMAIL_FIELD = Target.the("email field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");

    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]");

    public static Target REGISTER_BUTTON = Target.the("register button").locatedBy("//span[contains(text(),'Register')]");
}
