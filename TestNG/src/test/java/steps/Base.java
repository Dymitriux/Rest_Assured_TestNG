package steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.Logger;
import utils.LoggingUtils;

import static io.restassured.RestAssured.when;

public class Base {

    private final String baseUrl = "http://swapi.dev/api/";

    protected Logger logger = LoggingUtils.getLogger();
    protected Response response;
    protected String endPoint = "";

    public Base() {
        setBaseUrl(baseUrl);
    }

    public void setBaseUrl(String baseUrl) {
        logger.debug("Base URL: " + baseUrl);
        RestAssured.baseURI = baseUrl;
    }

    public void setEndpoint(String endpoint) {
        logger.debug("Selected endpoint: " + endpoint);
        RestAssured.basePath = endpoint;
    }

    public void executeGet(String id) {
        response = when().get("/" + id);
    }
}
