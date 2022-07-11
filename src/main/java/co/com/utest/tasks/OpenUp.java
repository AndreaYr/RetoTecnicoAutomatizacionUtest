package co.com.utest.tasks;

import co.com.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestPage utestPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    //Acciones del actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage),
            Click.on(UtestPage.JOIN_BUTTON));

    }
}
