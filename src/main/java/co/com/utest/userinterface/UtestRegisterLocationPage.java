package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterLocationPage extends PageObject {

    // Objeto para la ciudad
    public static final Target INPUT_CITY = Target.the("Campo en donde se ingresa la ciudad").located(By.id("city"));

    // Objeto para el código postal
    public static final Target INPUT_POSTAL_CODE = Target.the("Campo en donde se ingresa el código postal")
            .located(By.id("zip"));

    // Objeto para el contenedor de los paises
    public static final Target COUNTRY_CONTAINER = Target.the("Contenedor de los paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    // Objeto para el input de los paises
    public static final Target INPUT_COUNTRY = Target.the("Campo en donde se ingresa el país")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    // Objeto para el botón siguiente de la sección dispositivos
    public static final Target NEXT_BUTTON_DEVICES = Target.the("Botón que lleva a la sección de dispositivos")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
