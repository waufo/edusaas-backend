package com.edusaas.adapter.in.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> GetHealthApp(){
        Map<String, Object> map = new HashMap<>();
        map.put("status", "OK");
        map.put("version", "1");
        map.put("timestamp", java.time.Instant.now().toString());

        return ResponseEntity.ok(map);
    }
}
