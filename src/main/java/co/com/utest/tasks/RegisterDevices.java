package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.utest.userinterface.UtestRegisterDevicesPage.*;

public class RegisterDevices implements Task {
    private List<UtestData> data;

    //Constructor
    public RegisterDevices(List<UtestData> data) {
        this.data = data;
    }

    //método
    public static RegisterDevices stepThree(List<UtestData> data) {
        return Tasks.instrumented(RegisterDevices.class, data);
    }

    //Acciones del actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MOBILE_DEVICE_CONTAINER),
                Enter.theValue(data.get(0).getStrMobileDevice()).into(INPUT_MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(MODEL_CONTAINER),
                Enter.theValue(data.get(0).getStrModel()).into(INPUT_MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(OPERATING_SYSTEM_CONTAINER),
                Enter.theValue(data.get(0).getStrOperatingSystem()).into(INPUT_OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BUTTON_LAST_STEP)
        );
    }
}
