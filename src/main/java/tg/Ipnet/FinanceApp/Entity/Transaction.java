package tg.Ipnet.FinanceApp.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private Double montant;

    private LocalDateTime dateTransaction;

    @ManyToOne
    @JoinColumn(name = "compte_source_id")
    private Compte compteSource;

    @ManyToOne
    @JoinColumn(name = "compte_cible_id")
    private Compte compteCible;

    public Transaction() {
        this.dateTransaction = LocalDateTime.now();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public LocalDateTime getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(LocalDateTime dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public Compte getCompteSource() {
		return compteSource;
	}

	public void setCompteSource(Compte compteSource) {
		this.compteSource = compteSource;
	}

	public Compte getCompteCible() {
		return compteCible;
	}

	public void setCompteCible(Compte compteCible) {
		this.compteCible = compteCible;
	}

    
}

