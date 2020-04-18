package ffb.analyzer.core.webclient.servlet;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-get")
    @Consumes("application/json")
    public TestPerson getResponse() {
        TestPerson response = new TestPerson();
        response.setFirstName("First");
        response.setLastName("Last");
        return response;
    }

    @PostMapping("/test-post")
    @Produces("application/json")
    @Consumes("application/json")
    public TestPerson postResponse(@RequestBody TestPerson content) {
        return content;
    }
}
