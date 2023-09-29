package tn.enis.projet.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface MemberRepository extends JpaRepository<Membre,Long>
{

Membre findByCin(String cin);
List<Membre>findByNomStartingWith(String caractere);
Membre findByEmail(String email);

}