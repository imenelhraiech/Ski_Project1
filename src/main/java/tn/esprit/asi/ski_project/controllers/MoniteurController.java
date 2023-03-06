package tn.esprit.asi.ski_project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_project.entities.Moniteur;
import tn.esprit.asi.ski_project.services.IMoniteurService;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurController {
    @Autowired

    private IMoniteurService iMoniteurService;
    @PostMapping
    public void add(@RequestBody Moniteur m) {
        iMoniteurService.add(m);
    }

    @PutMapping
    public Moniteur update(@RequestBody Moniteur m) {
        return iMoniteurService.update(m);

    }

    @GetMapping
    public List<Moniteur> getAll() {
        return iMoniteurService.getAll();
    }

    @GetMapping("/{id}")
    public Moniteur getById(@PathVariable long id) {
        return iMoniteurService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iMoniteurService.remove(id);
    }
}
