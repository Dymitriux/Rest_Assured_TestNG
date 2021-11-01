package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.Logger;
import utils.LoggingUtils;
import utils.RestUtils;

public class MainSteps  {

    private final String baseUrl = "http://swapi.dev/api/";
    protected static Logger logger = LoggingUtils.getLogger();

    public MainSteps() {
        RestUtils.setBaseUrl(baseUrl);
    }

    @Given("user connect to {string} endpoint")
    public void userConnectToEndpoint(String endpoint) {
        RestUtils.setEndpoint(endpoint);
    }

    @And("user execute GET for id {int}")
    public void userExecuteGETForId(int id) {
        RestUtils.executeGet("/" + id);
    }

    @Then("user log response result")
    public void userLogResponseResult() {
        logger.info("Response:\n" + RestUtils.getResponse().asPrettyString());
    }
}
