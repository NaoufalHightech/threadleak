package ben.com.threadleak.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur pour vérifier l'état du service.
 */
@RestController
public class HealthCheckController {

    @GetMapping("/api/ping")
    public String ping() {
        return "Service actif";
    }
}

