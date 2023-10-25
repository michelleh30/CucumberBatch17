package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndLaunchApplication();

    }

    @After
    //this executes always at the end irrespective of the result
    public void end(Scenario scenario){
        /*byte[] pic;
        //here we can take the screenshot before closing the browser
        //scenario class in cucumber which will give me the info of
        //the execution. it hold the complete info of the execution
        //getName is the method which return the name of the scenario
        if(scenario.isFailed()) {
            pic = takeScreenshot("failed/" + scenario.getName());//the place you are taken the sc
        }else{
            pic=takeScreenshot("passed/"+scenario.getName());
        }
        closeBrowser();

         */
    }


}
