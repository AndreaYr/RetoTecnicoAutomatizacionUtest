package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.UtestRegisterLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.utest.userinterface.UtestRegisterLocationPage.*;

public class RegisterLocation implements Task {
    private List<UtestData> data;

    //Constructor
    public RegisterLocation(List<UtestData> data) {
        this.data = data;
    }

    //Método
    public static RegisterLocation stepTwo(List<UtestData> data) {
        return Tasks.instrumented(RegisterLocation.class, data);
    }


    //Acciones del actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrCity()).into(UtestRegisterLocationPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY), //Flecha abajo
                Hit.the(Keys.ENTER).into(INPUT_CITY),      //oprime enter
                Enter.theValue(data.get(0).getStrPostalCode()).into(INPUT_POSTAL_CODE),
                Click.on(COUNTRY_CONTAINER),
                Enter.theValue(data.get(0).getStrCountry()).into(INPUT_COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(NEXT_BUTTON_DEVICES)
        );
    }
}
