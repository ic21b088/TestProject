package at.fhtw.TestProject.Controller;

import at.fhtw.TestProject.Service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @PostMapping("/square/{number}")
    public Long getSquare(@PathVariable Long number)
    {
        return service.getSquare(number);
    }

    /*@PostMapping("/square/{number}") //für weitere Features nur dieser Teil nötig
    public Long getSquare(@PathVariable Long number)
    {
        return service.getSquare(number);
    }*/

}
