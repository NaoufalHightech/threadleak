package ben.com.threadleak.controller;
import ben.com.threadleak.utils.LargeObject;
import ben.com.threadleak.utils.LargeObjectJSON;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LargeObjectController {

    @PostMapping("/upload")
    public String uploadLargeObject(@RequestBody LargeObjectJSON largeObject) {
        // Simuler un traitement long
        processLargeObject(largeObject);
        return "Processing Complete";
    }

    private void processLargeObject(LargeObjectJSON largeObject) {
        try {
            Thread.sleep(100_000); // Simuler un traitement long
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

