package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.List;
import static co.com.utest.userinterface.UtestRegisterYourselfPage.*;

public class RegisterYourself implements Task {
    private List<UtestData> data;

    public RegisterYourself(List<UtestData> data) {
        this.data = data;
    }

    public static RegisterYourself stepOne(List<UtestData> data) {
        return Tasks.instrumented(RegisterYourself.class, data);
    }

    //acciones del actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        //pasa por parametro la página de los objetos e instancia
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(data.get(0).getStrMail()).into(INPUT_MAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(BIRTH_YEAR),
                Click.on(NEXT_BUTTON_LOCATION));

    }
}
