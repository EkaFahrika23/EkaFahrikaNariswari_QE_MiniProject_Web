package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.checkerframework.checker.units.qual.C;

public class DoAnAction {

//    register
    public static Performable fillNamaLengkap(String namaLengkap) {
        return Task.where("{0} fill nama lengkap field with " + namaLengkap,
                Enter.theValue(namaLengkap)
                        .into(RegisterPage.NAMA_LENGKAP_FIELD)
        );
    }

    public static Performable fillEmailFieldWithValue(String email) {
        return Task.where("{0} email field with " + email,
                Enter.theValue(email)
                        .into(RegisterPage.EMAIL_FIELD)
        );
    }

    public static Performable fillPasswordFieldWithValue(String password) {
        return Task.where("{0} password field with " + password,
                Enter.theValue(password)
                        .into(RegisterPage.PASSWORD_FIELD)
        );
    }
    public static Performable clickRegisterButton() {
        return Task.where("{0} click register button",
                Click.on(RegisterPage.REGISTER_BUTTON)
        );
    }

//    login
    public static Performable clickLogin() {
        return Task.where("{0} click button login on homepage",
                Click.on(AltaShopPage.LOGIN)
        );
    }
    public static Performable EmailFieldWithValue(String email) {
        return Task.where("{0} email field with " + email,
                Enter.theValue(email)
                        .into(AltaShopPage.FIELD_EMAIL)
        );
    }
    public static Performable PasswordFieldWithValue(String password) {
        return Task.where("{0} password field with " + password,
                Enter.theValue(password)
                        .into(AltaShopPage.FIELD_PASSWORD)
        );
    }
    public static Performable clickLoginButton() {
        return Task.where("{0} click Login button",
                Click.on(AltaShopPage.LOGIN_BUTTON)
        );
    }
    public static Performable invalidEmail(String invEmail){
        return Task.where("{0} invalid email with" + invEmail,
                Enter.theValue(invEmail)
                        .into(AltaShopPage.FIELD_EMAIL)
        );
    }
    public static Performable invalidPassword(String invPassword){
        return Task.where("{0} invalid password with" + invPassword,
                Enter.theValue(invPassword)
                        .into(AltaShopPage.FIELD_PASSWORD)
        );
    }

//    homepage
    public static Performable clickButtonDetail(){
        return Task.where("{0} click detail button",
                Click.on(AltaShopPage.DETAIL_BUTTON)
        );
    }
    public static Performable clickBuyButton(){
        return Task.where("{0} click buy button",
                Click.on(AltaShopPage.BUY_BUTTON)
        );
    }
    public static Performable clickCartButton(){
        return Task.where("{0} click cart button",
                Click.on(AltaShopPage.CART_BUTTON)
        );
    }

    public static Performable clickAddProduct(){
        return Task.where("{0} click Add Product",
                Click.on(AltaShopPage.ADD_PRODUCT)
        );
    }
    public static Performable clickPurchaseButton(){
        return Task.where("{0} click purchase button",
                Click.on(AltaShopPage.PURCHASE)
        );
    }
    public static Performable clickProfileButton(){
        return Task.where("{0} click profile button",
                Click.on(AltaShopPage.PROFILE_BUTTON)
        );
    }
    public static Performable clickTransactionButton(){
        return Task.where("{0} click transaction button",
                Click.on(AltaShopPage.TRANSACTION_BUTTON)
        );
    }
    public static Performable clickLogoutButton(){
        return Task.where("{0} click logout button",
                Click.on(AltaShopPage.LOGOUT_BUTTON)
        );
    }


}