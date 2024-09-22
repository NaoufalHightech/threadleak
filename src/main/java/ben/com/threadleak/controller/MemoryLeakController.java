package ben.com.threadleak.controller;


import ben.com.threadleak.utils.LargeObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Contrôleur simulant une fuite de mémoire.
 */
@RestController
public class MemoryLeakController {

    private static Map<Long, LargeObject> memoryLeakMap = new HashMap<>();

    @GetMapping("/api/memory-leak")
    public String createMemoryLeak() {
        LargeObject object = new LargeObject();
        memoryLeakMap.put(System.currentTimeMillis(), object);
        return "Objet ajouté à la map statique.";
    }
}
