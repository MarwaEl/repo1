package ma.PFE.local;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class MYSpringbootApp {


    private final static Logger LOGGER = LoggerFactory.getLogger(MYSpringbootApp.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(MYSpringbootApp.class);

        LOGGER.debug("start application log 1 ");
        LOGGER.warn("start application log 2 ");
        LOGGER.info("start application log 3 ");

    }
}




