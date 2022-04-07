package configuration.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.Logger;
import utils.LoggingUtils;

public class Hooks {

    protected static Logger logger = LoggingUtils.getLogger();

    @Before
    public void setUp() {
        logger.info("Set up method.");
    }

    @After
    public void tearDown() {
        logger.info("Tear down method.");
    }
}
