package mx.com.gm.repository;

import mx.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IusuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
