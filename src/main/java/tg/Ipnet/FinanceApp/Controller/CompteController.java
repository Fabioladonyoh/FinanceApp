package tg.Ipnet.FinanceApp.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tg.Ipnet.FinanceApp.Entity.Compte;
import tg.Ipnet.FinanceApp.Repository.CompteRepository;

@RestController
@RequestMapping("/api/comptes")
public class CompteController {

    private final CompteRepository repo;

    public CompteController(CompteRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Compte> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Compte create(@RequestBody Compte c) {
        return repo.save(c);
    }
}

