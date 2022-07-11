package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//clase que se extiende pageObject
public class UtestRegisterYourselfPage extends PageObject {

    //Objeto para el nombre
    public static final Target INPUT_FIRST_NAME = Target.the("Campo en donde se ingresa el nombre").located(By.id("firstName"));

    //Objeto para el apellido
    public static final Target INPUT_LAST_NAME = Target.the("Campo en donde se ingresa el apellido").located(By.id("lastName"));

    //Objeto para el correo
    public static final Target INPUT_MAIL = Target.the("Campo en donde se ingresa el correo electronico").located(By.id("email"));

    //Objetos del selector de fecha de nacimiento
    public static final Target BIRTH_MONTH = Target.the("Campo selector de mes de nacimiento").located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("Campo selector de dia de nacimiento").located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Campo selector de año de nacimiento").located(By.id("birthYear"));

    //Objeto para el boton de siguiente
    public static final Target NEXT_BUTTON_LOCATION = Target.the("Botón que lleva a la sección de dirección").located(By.xpath("//a[@class='btn btn-blue']"));
}
