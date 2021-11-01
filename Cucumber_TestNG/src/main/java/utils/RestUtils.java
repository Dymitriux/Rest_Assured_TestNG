package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.when;

public class RestUtils {

    private static Logger logger = LoggingUtils.getLogger();
    private static Response response;

    public static void setBaseUrl(String baseUrl) {
        logger.debug("Base URL: " + baseUrl);
        RestAssured.baseURI = baseUrl;
    }

    public static void setEndpoint(String endpoint) {
        logger.debug("Selected endpoint: " + endpoint);
        RestAssured.basePath = endpoint;
    }

    public static void executeGet(String id) {
        response = when().get("/" + id);
    }

    public static Response getResponse() {
        return response;
    }
}
