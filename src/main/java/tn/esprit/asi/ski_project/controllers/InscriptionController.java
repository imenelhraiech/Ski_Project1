package tn.esprit.asi.ski_project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_project.entities.Inscription;
import tn.esprit.asi.ski_project.services.IInscriptionService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inscription")
public class InscriptionController {
    @Autowired
    private IInscriptionService iInscriptionService;

    @PostMapping
    public void add(@RequestBody Inscription i) {
        iInscriptionService.add(i);
    }

    @PutMapping
    public Inscription update(@RequestBody Inscription i) {
        return iInscriptionService.update(i);

    }

    @GetMapping
    public List<Inscription> getAll() {
        return iInscriptionService.getAll();
    }

    @GetMapping("/{id}")
    public Inscription getById(@PathVariable long id) {
        return iInscriptionService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iInscriptionService.remove(id);
    }
}
