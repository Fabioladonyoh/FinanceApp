package tg.Ipnet.FinanceApp.Entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenoms;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String motDePasse;

    private LocalDateTime dateNaissance;
    
    private String adresse;
    
    private String numtel;
    
    private String numCni;
    

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "utilisateur_roles",
        joinColumns = @JoinColumn(name = "utilisateur_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    public Utilisateur() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public LocalDateTime getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDateTime dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumtel() {
		return numtel;
	}

	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}

	public String getNumCni() {
		return numCni;
	}

	public void setNumCni(String numCni) {
		this.numCni = numCni;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

    
}

