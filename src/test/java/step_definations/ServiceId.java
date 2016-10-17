package step_definations;

import com.mg.apitest.ceapitest.CostEstimate;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by jaspreetwalia on 17/10/2016.
 */
public class ServiceId {
    CostEstimate costEstimate = null;

    @Given("^costEstimate details are finalised$")
    public void costestimate_details_are_finalised() throws Throwable {
        costEstimate = new CostEstimate();
        String testFileName = "costEstimationSIdNull.json";
        String jsonFile = costEstimate.loadJsonFile(testFileName);

    }

    @When("^I create costestimate with null service id$")
    public void i_create_costestimate_with_null_service_id() throws Throwable {
        System.out.print("Hello");

        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^failure message should be returned$")
    public void failure_message_should_be_returned() throws Throwable {
        System.out.print("Hello");

        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @Then("^status code should be (\\d+)$")
    public void status_code_should_be(int arg1) throws Throwable {
        System.out.print("Hello");

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I create costestimate with not null  service id$")
    public void i_create_costestimate_with_not_null_service_id() throws Throwable {
        System.out.print("Hello");

        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^success message should be returned$")
    public void success_message_should_be_returned() throws Throwable {
        System.out.print("Hello");

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
