package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoginDemo {

    private static final Logger logger = LogManager.getLogger(LoginDemo.class);

    public static void main(String[] args) {
        logger.debug("Debug Message Logged");
        logger.debug("Error Message Logged");
        logger.debug("Fatal Message Logged");
    }
}