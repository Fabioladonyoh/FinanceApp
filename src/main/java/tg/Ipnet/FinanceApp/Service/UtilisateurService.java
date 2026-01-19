package tg.Ipnet.FinanceApp.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import tg.Ipnet.FinanceApp.Entity.Utilisateur;
import tg.Ipnet.FinanceApp.Repository.UtilisateurRepository;

@Service
public class UtilisateurService {

    private final UtilisateurRepository repo;

    public UtilisateurService(UtilisateurRepository repo) {
        this.repo = repo;
    }

    public List<Utilisateur> getAll() {
        return repo.findAll();
    }

    public Utilisateur create(Utilisateur u) {
        return repo.save(u);
    }
}
