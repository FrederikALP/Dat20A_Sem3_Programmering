package HandMaven.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandMavenController {

    @GetMapping("/about")
    public String aboutThisProject() {
        return "This was made by hand, feels good innit m8";
    }
}
