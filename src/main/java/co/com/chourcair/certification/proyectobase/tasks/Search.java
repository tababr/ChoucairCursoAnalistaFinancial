package co.com.chourcair.certification.proyectobase.tasks;


import co.com.chourcair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task{
    private String course;

    public Search(String course){
        this.course = course;
    }
    public static Performable the(String course) {
        return Tasks.instrumented(Search.class, course);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)
        );

    }
}
