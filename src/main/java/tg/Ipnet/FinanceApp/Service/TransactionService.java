package tg.Ipnet.FinanceApp.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tg.Ipnet.FinanceApp.Entity.Compte;
import tg.Ipnet.FinanceApp.Entity.Transaction;
import tg.Ipnet.FinanceApp.Repository.CompteRepository;
import tg.Ipnet.FinanceApp.Repository.TransactionRepository;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepo;
    private final CompteRepository compteRepo;

    public TransactionService(TransactionRepository transactionRepo, CompteRepository compteRepo) {
        this.transactionRepo = transactionRepo;
        this.compteRepo = compteRepo;
    }

    @Transactional
    public Transaction effectuerTransaction(Transaction t) {
        Compte c = t.getCompteCible();

        if (t.getMontant() <= 0) {
            throw new RuntimeException("Montant invalide");
        }

        if (t.getType().equals("DEBIT")) {
            if (c.getSolde() < t.getMontant()) {
                throw new RuntimeException("Solde insuffisant");
            }
            c.setSolde(c.getSolde() - t.getMontant());
        } else {
            c.setSolde(c.getSolde() + t.getMontant());
        }

        compteRepo.save(c);
        return transactionRepo.save(t);
    }
}
