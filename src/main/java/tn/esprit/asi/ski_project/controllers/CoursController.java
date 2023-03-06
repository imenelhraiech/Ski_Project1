package tn.esprit.asi.ski_project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_project.entities.Cours;
import tn.esprit.asi.ski_project.services.ICoursService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    private ICoursService iCoursService ;
    @PostMapping
    public void add (@RequestBody Cours c){
        iCoursService.add(c);
    }

    @PutMapping
    public Cours update(@RequestBody Cours c) {
        return iCoursService.update(c);
    }

    @GetMapping
    List<Cours> getAll() {
        return iCoursService.getAll() ;
    }
    @GetMapping("/{id}")
    Cours getById(@PathVariable long id) {
        return iCoursService.getById(id) ;
    }
    @DeleteMapping("/{id}")
    void remove(@PathVariable long id){
        iCoursService.remove(id);
}
}
