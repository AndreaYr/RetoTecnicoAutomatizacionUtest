package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.utest.userinterface.UtestRegisterPasswordPage.*;

public class RegisterPassword implements Task {
    private List<UtestData> data;

    public RegisterPassword(List<UtestData> data) {
        this.data = data;
    }

    public static RegisterPassword lastStep(List<UtestData> data) {
        return Tasks.instrumented(RegisterPassword.class, data);
    }

    //Acciones del actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(CHECKBOX),
                Click.on(CHECKBOX_TWO),
                Click.on(CHECKBOX_THREE),
                Click.on(BUTTON_SETUP)
        );

    }
}
