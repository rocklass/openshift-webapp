package org.rocklass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main application
 * 
 * @author rocklass
 *
 */
@RestController
@SpringBootApplication
public class DemoApplication {

	/**
     * Index GET Controller
     * 
     * @return index
     */
    @RequestMapping(value = {"", "/"})
    public String index() {
        return "Running ...";
    }

	/**
     * Main method
     * 
     * @param args
     *            application arguments
     */
    public static void main(final String... args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
