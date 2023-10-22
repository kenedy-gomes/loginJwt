package Repository;

 
 



import Domain.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepositories extends JpaRepository<Usuarios, Long> {


}
