package com.tandohak.grpcspringbootclient;

import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.examples.lib.MapFieldEntry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class GreeterController {

    private final GreeterService greeterService;

    @GetMapping("/")
    public ResponseEntity<?> greeter(String name) {

        MapFieldEntry entry = greeterService.hello(name);

        if (entry.getResult()) {

            return ResponseEntity.ok(entry.getName());

        } else {
            return ResponseEntity.badRequest().build();
        }

    }

}
