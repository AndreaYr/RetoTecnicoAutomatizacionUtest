package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterDevicesPage extends PageObject {

    //Objeto para el contenedor de las marcas de dispositivos móviles
    public static final Target MOBILE_DEVICE_CONTAINER = Target.the("Contenedor de dispositivos móviles")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));

    //Objeto para la marca del dispositivo móvil
    public static final Target INPUT_MOBILE_DEVICE = Target.the("Campo para dispositivo móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    //Objeto para el contenedor de los modelos
    public static final Target MODEL_CONTAINER = Target.the("Contenedor de los modelos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));

    //Objeto para el modelo del móvil
    public static final Target INPUT_MODEL = Target.the("Campo para el modelo del dispositivo móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    //Objeto para el contenedor de los sistemas operativos
    public static final Target OPERATING_SYSTEM_CONTAINER = Target.the("Contenedor del sistema operativo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));

    //Objeto para el sistema operativo del móvil
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Campo para el sistema operativo del dispositivo móvil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    //Objeto para el boton de siguiente
    public static final Target BUTTON_LAST_STEP = Target.the("Botón que lleva a la última sección")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
