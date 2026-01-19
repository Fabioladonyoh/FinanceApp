package tg.Ipnet.FinanceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tg.Ipnet.FinanceApp.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Role fingByNom(String Nom);

}
