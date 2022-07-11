package co.com.utest.questions;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.UtestRegisterPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Result implements Question <Boolean>{
    private List<UtestData> data;

    public Result(List<UtestData> data) {
        this.data = data;
    }

    public static Result answer(List<UtestData> data) {
        return new Result(data);
    }

    //Acciones del actor
    @Override
    public Boolean answeredBy(Actor actor) {
        String buttonSetup = Text.of(UtestRegisterPasswordPage.BUTTON_SETUP).viewedBy(actor).asString();

        return data.get(0).getStrButtonText().equals(buttonSetup);
    }
}
