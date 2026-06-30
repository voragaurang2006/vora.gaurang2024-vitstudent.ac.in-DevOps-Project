package com.corporate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] academ) {
        SpringApplication.run(App.class, academ);
    }

    // Health endpoint for Nagios and monitoring dashboards
    @GetMapping("/api/health")
    public Map<String, Object> healthCheck() {
        Map<String, Object> status = new HashMap<>();
        status.put("status", "UP");
        status.put("message", "ABC Technologies Website is running smoothly.");
        status.put("timestamp", System.currentTimeMillis());
        return status;
    }

    // Simple contact api stub for form submissions
    @GetMapping("/api/contact")
    public Map<String, String> contactStub() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Thank you for contacting ABC Technologies. We will get back to you shortly.");
        return response;
    }
}
