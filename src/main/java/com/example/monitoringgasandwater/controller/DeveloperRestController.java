package com.example.monitoringgasandwater.controller;

import com.example.monitoringgasandwater.model.Developer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperRestController {

    private List<Developer> DEVELOPERS = Stream.of(
            new Developer(1L, "Developer"),
            new Developer(2L, "Admin")
    ).collect(Collectors.toList());

    @GetMapping
    public List<Developer> getAll(){
        return DEVELOPERS;
    }

    @GetMapping("/{id}")
    public Developer getById(@PathVariable Long id) {
        return DEVELOPERS.stream().filter(developer -> developer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

//    @PostMapping
//    @PreAuthorize("hasAuthority('developers:write')")
//    public Developer create(@RequestBody Developer developer) {
//        this.DEVELOPERS.add(developer);
//        return developer;
//    }
//
//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAuthority('developers:write')")
//    public void deleteById(@PathVariable Long id) {
//        this.DEVELOPERS.removeIf(developer -> developer.getId().equals(id));
//    }
}
