package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Ejemplostep {


    @Given("que ingrese en saucedemo.com")
    public void IngresoSaucedemo(){
        System.out.println("Ingresé en Saucedemo.com");
    }

    @Then("ingreso un usuario en la pantalla de login")
    public void IngresoUsuario(){
        System.out.println("Ingresé un usuario");
    }
}



