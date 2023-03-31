package com.example.bookstoreback.Controller;

import com.example.bookstoreback.Entity.Livre;
import com.example.bookstoreback.Exception.NullLivreException;
import com.example.bookstoreback.Services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin("http://localhost:4200")
public class LivreController {
    @Autowired
    private LivreService livreService;
    @GetMapping
    public List<Livre> getAllLivres(){
        return livreService.getAllLivres();
    }
    @GetMapping(path = "/{id}")
    public Livre getLivreById(@PathVariable int id)throws NullLivreException {
        return livreService.getLivreById(id);
    }
    @PostMapping
    public Livre saveLivre(@RequestBody Livre livre){
        return livreService.createLivre(livre);
    }
    @PutMapping
    public Livre updateLivre(@RequestBody Livre livre){
        return livreService.updateLivre(livre);
    }
    @DeleteMapping(path = "/{id}")
    public void deleteLivreById(@PathVariable int id){
        livreService.deleteLivreById(id);
    }
    @GetMapping(path = "/category/{category}")
    public Livre getLivreByCategory(@PathVariable String category)throws NullLivreException {
        return livreService.getLivreByCategory(category);
    }
    @GetMapping(path = "/name/{name}")
    public Livre getLivreByName(@PathVariable String name)throws NullLivreException {
        return livreService.getLivreByName(name);
    }
}
