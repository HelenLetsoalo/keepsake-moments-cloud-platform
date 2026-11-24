package za.co.keepsakemoments.keepsake_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//acts as a front door. When someone knocks on the door from the internet this block
@RestController
public class HelloController {

    //When someone asks to see a specific page or piece of info, this block hands it over. (Friendly receptionist)
    @GetMapping("/api/hello")
    public String hello() {
        return "Keepsake Moments backend is running";
    }
}
