package edu.ciberetc.DAWII_CL2_Miranda.Repository;

import edu.ciberetc.DAWII_CL2_Miranda.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
    Usuario findByNomusuario(String nomusuario);

}
