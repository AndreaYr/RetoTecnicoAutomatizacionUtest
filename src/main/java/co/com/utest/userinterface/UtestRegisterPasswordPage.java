package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPasswordPage extends PageObject {

    // Objeto para el botón de finalizar el formulario
    public static final Target BUTTON_SETUP = Target.the("Botón que confirma el registro")
            .located(By.id("laddaBtn"));

    //Objeto para la contraseña
    public static final Target PASSWORD = Target.the("Campo en donde se ingresa la clave de el usuario")
            .located(By.id("password"));

    //Objeto para la confirmación de contraseña
    public static final Target CONFIRM_PASSWORD = Target.the("Confirmación de la clave")
            .located(By.id("confirmPassword"));

    //Objeto para el Checkbox de información
    public static final Target CHECKBOX = Target.the("Checkbox de aceptación de información (stay informed) ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    //Objeto para el Checkbox de términos de uso
    public static final Target CHECKBOX_TWO = Target.the("Checkbox de aceptación de términos de uso")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    //Objeto para el Checkbox de política de privacidad y seguridad
    public static final Target CHECKBOX_THREE = Target.the("Checkbox de aceptación de política de privacidad y seguridad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
}
