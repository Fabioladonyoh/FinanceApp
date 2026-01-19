package tg.Ipnet.FinanceApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import tg.Ipnet.FinanceApp.Entity.Compte;
import tg.Ipnet.FinanceApp.Repository.CompteRepository;

@Service
public class CompteService {

    private final CompteRepository repo;

    public CompteService(CompteRepository repo) {
        this.repo = repo;
    }

    public List<Compte> getAll() {
        return repo.findAll();
    }

    public Compte create(Compte c) {
        if (c.getSolde() < 0) {
            throw new RuntimeException("Solde initial invalide");
        }
        return repo.save(c);
    }
}
