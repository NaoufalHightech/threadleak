package ben.com.threadleak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadleakApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreadleakApplication.class, args);
    }

}
