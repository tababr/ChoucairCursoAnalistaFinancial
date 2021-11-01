package co.com.chourcair.certification.proyectobase.stepdefinitions;

import co.com.chourcair.certification.proyectobase.model.AcademyChoucairData;
import co.com.chourcair.certification.proyectobase.questions.Answer;
import co.com.chourcair.certification.proyectobase.tasks.Login;
import co.com.chourcair.certification.proyectobase.tasks.OpenUp;
import co.com.chourcair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChourcairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Chourcair$")
    public void thanBrandonwantsToLearnAutomationAtTheAcademyChourcair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course (.*) on the chourcair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChourcairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Question<Boolean>) Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }
}
