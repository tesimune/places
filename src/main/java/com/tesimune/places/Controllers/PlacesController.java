package com.tesimune.places.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/places")
public class PlacesController {

    @GetMapping("/")
    public String index() {
        return "Index";
    }

    @GetMapping("/{uuid}")
    public String show(@PathVariable String uuid) {
        return "Show " + uuid;
    }

    @PostMapping("/")
    public String store() {
        return "Created";
    }

    @PutMapping("/{uuid}")
    public String update(@PathVariable String uuid) {
        return "Updated " + uuid;
    }

    @DeleteMapping("/{uuid}")
    public String delete(@PathVariable String uuid) {
        return "Deleted " + uuid;
    }
}
