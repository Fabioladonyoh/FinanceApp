package tg.Ipnet.FinanceApp.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tg.Ipnet.FinanceApp.Entity.Transaction;
import tg.Ipnet.FinanceApp.Repository.TransactionRepository;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionRepository repo;

    public TransactionController(TransactionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction t) {
        return repo.save(t);
    }
}

