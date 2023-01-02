package deors.demos.java.pipeline;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${defaultGreeting}")
    private String defaultGreeting;

    public HelloService() {
        super();
    }

    public String getHelloGreeting() {
        return defaultGreeting;
        //Commet to check analyzed branch
    }

    public String getHelloGreeting(String name) {
        return String.format("%s, %s", defaultGreeting, name);
    }
}
