package tn.esprit.asi.ski_project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_project.entities.Piste;
import tn.esprit.asi.ski_project.services.IPisteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/piste")
public class PisteController {
    @Autowired

    private IPisteService iPisteService;
    @PostMapping
    public void add(@RequestBody Piste p) {
        iPisteService.add(p);
    }

    @PutMapping
    public Piste update(@RequestBody Piste p) {
        return iPisteService.update(p);

    }

    @GetMapping
    public List<Piste> getAll() {
        return iPisteService.getAll();
    }

    @GetMapping("/{id}")
    public Piste getById(@PathVariable long id) {
        return iPisteService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iPisteService.remove(id);
    }
}
