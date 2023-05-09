package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;
import starter.helpers.RegisterPage;

public class RegisterDefinitions {
    @Given("{actor} on the register page")
    public void userOnTheRegisterPage(Actor actor){actor.wasAbleTo(NavigateTo.RegisterPage());}

    @When("{actor} input valid Nama Lengkap {string}")
    public void inputValidNamaLengkap(Actor actor, String namaLengkap){
        actor.attemptsTo(DoAnAction.fillNamaLengkap(namaLengkap));
    }
    @And("{actor} input valid email {string}")
    public void inputValidEmail(Actor actor, String email){
        actor.attemptsTo(DoAnAction.fillEmailFieldWithValue(email));
    }
    @And("{actor} input valid password {string}")
    public void inputValidPassword(Actor actor, String password){
        actor.attemptsTo(DoAnAction.fillPasswordFieldWithValue(password));
    }
    @Then("{actor} click register button")
    public void userClickRegisterButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickRegisterButton());
    }
//    @When("{actor} input fullname {string}")
//    public void inputFullname(Actor actor, String fullname){
//
//    }
//    @And("{actor} input with invalid email {string}")
//    public void inputWithInvalidEmail(Actor actor, String invalidEmail){
//
//    }
//    @And("{actor} input password {string}")
//    public void inputPassword(Actor actor, String invalidPassword){
//
//    }
}
