package co.com.utest.stepdefinitions;

import co.com.utest.model.UtestData;
import co.com.utest.questions.Result;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    //Se prepara escenario del autor.
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que andrea quiere registrarse en Utest$")
    public void queAndreaQuiereRegistrarseEnUtest() throws Exception{
        //Estas clases van en Task
        OnStage.theActorCalled("Andrea").wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^ingresa la informacion requerida por el sistema$")
    public void ingresaLaInformacionRequeridaPorElSistema(List<UtestData> data) throws Exception {
       OnStage.theActorInTheSpotlight().attemptsTo(
               RegisterYourself.stepOne(data),
               RegisterLocation.stepTwo(data),
               RegisterDevices.stepThree(data),
               RegisterPassword.lastStep(data)
       );
    }

    @Entonces("^se completa el registro al oprimir el boton de Complete Setup$")
    public void seCompletaElRegistroAlOprimirElBotonDeCompleteSetup(List<UtestData> data) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Result.answer(data)));
    }
}


