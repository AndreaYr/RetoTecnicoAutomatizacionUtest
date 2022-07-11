package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {

    //Objeto del boton "Join"
    public static final Target JOIN_BUTTON = Target.the("Botón que nos muestra el formulario para registrarse")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
