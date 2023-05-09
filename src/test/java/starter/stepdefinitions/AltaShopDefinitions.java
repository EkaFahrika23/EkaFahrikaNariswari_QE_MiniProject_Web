package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.AltaShopPage;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

public class AltaShopDefinitions {

    @Given("{actor} on the home page")
    public void userOnTheHomePage(Actor actor){actor.wasAbleTo(NavigateTo.LoginPage());}

    @When("{actor} click button login")
    public void ButtonLogin(Actor actor){
        actor.attemptsTo((DoAnAction.clickLogin()));
    }
//    @And("{actor} on the login page")
//    public void userOnTheLoginPage(Actor actor){actor.wasAbleTo(NavigateTo.LoginPage());}

    @And("{actor} input the valid email {string}")
    public void inputValidEmail(Actor actor, String email){
        actor.attemptsTo(DoAnAction.EmailFieldWithValue(email));
    }
    @And("{actor} input the valid password {string}")
    public void inputValidPassword(Actor actor, String password){
        actor.attemptsTo(DoAnAction.PasswordFieldWithValue(password));
    }
    @And("{actor} click login button")
    public void userClickLoginButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLoginButton());
    }
//    @Then("{actor} see {string} text on the home page")
//    public void seeHomePage(Actor actor, String text){
//        actor.attemptsTo(Ensure.that(LoginPage.HOME_PAGE).hasText(text));
//    }

//    invalid login
    @And("{actor} input invalid email {string}")
    public void inputInvalidEmail(Actor actor, String invEmail){
        actor.attemptsTo(DoAnAction.invalidEmail(invEmail));

    }
    @And("{actor} input invalid password {string}")
    public void inputInvalidPassword(Actor actor, String invPassword){
        actor.attemptsTo(DoAnAction.invalidPassword(invPassword));

    }
//    @Then("{actor} see this {string} alert message invalid account")
//    public void alertMessageInvalid(Actor actor, String alert){
//        actor.attemptsTo(Ensure.that(AltaShopPage.ALERT_MESSAGE).hasText(alert));
//
//    }

//    details product
    @Given("{actor} logged on AltaShop with email {string} and password {string}")
    public void userLoggedOnAltaShop(Actor actor, String email, String password){
        userOnTheHomePage(actor);
        ButtonLogin(actor);
        inputValidEmail(actor, email);
        inputValidPassword(actor, password);
        userClickLoginButton(actor);
    }
    @And("{actor} click detail button on a product Enormous Cotton Computer")
    public void userClickDetailButton(Actor actor){
        actor.attemptsTo(DoAnAction.clickButtonDetail());

    }

//    Buy the product
    @Given("{actor} login on AltaShop with email {string} and password {string}")
    public void userLoginOnAltaShop(Actor actor, String email, String password){
        userOnTheHomePage(actor);
        ButtonLogin(actor);
        inputValidEmail(actor, email);
        inputValidPassword(actor, password);
        userClickLoginButton(actor);
    }
    @When("{actor} click buy button on a product Enormous Cotton Computer")
    public void buyProduct(Actor actor){
        actor.attemptsTo(DoAnAction.clickBuyButton());

    }
    @And("{actor} click cart button")
    public void cartButton(Actor actor){
        actor.attemptsTo(DoAnAction.clickCartButton());

    }
    @And("{actor} click add the product")
    public void addProduct(Actor actor){
        actor.attemptsTo(DoAnAction.clickAddProduct());

    }
    @Then("{actor} click button purchase")
    public void buttonPurchase(Actor actor){
        actor.attemptsTo(DoAnAction.clickPurchaseButton());

    }
    @When("{actor} click button profile")
    public void ButtonProfile(Actor actor){
        actor.attemptsTo(DoAnAction.clickProfileButton());
    }
    @Then("{actor} click transaction button")
    public void transactionButton(Actor actor){
        actor.attemptsTo(DoAnAction.clickTransactionButton());

    }
    @When("{actor} click profile button")
    public void ProfileButton(Actor actor){
        actor.attemptsTo(DoAnAction.clickProfileButton());

    }
    @Then("{actor} click logout button")
    public void logoutButton(Actor actor){
        actor.attemptsTo(DoAnAction.clickLogoutButton());
    }


}
