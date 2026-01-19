package tg.Ipnet.FinanceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tg.Ipnet.FinanceApp.Entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
