package edu.ciberetc.DAWII_CL2_Miranda.Repository;

import edu.ciberetc.DAWII_CL2_Miranda.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {

    Rol findByNomrol(String nombrerol);

}
