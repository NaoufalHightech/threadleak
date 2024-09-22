package ben.com.threadleak.controller;

import ben.com.threadleak.utils.ThreadDeLaMort;
import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur simulant un blocage de thread.
 */
@RestController
public class ThreadBlockController {

    @GetMapping("/api/thread-block")
    public String startThreadBlock() {
        ThreadDeLaMort thread = new ThreadDeLaMort();
        thread.start();  // Démarre un thread qui ne termine jamais
        return "Thread bloquant démarré.";
    }
}

