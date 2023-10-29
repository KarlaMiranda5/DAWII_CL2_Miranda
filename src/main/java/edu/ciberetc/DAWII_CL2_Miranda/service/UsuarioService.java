package edu.ciberetc.DAWII_CL2_Miranda.service;

import edu.ciberetc.DAWII_CL2_Miranda.Repository.RolRepository;
import edu.ciberetc.DAWII_CL2_Miranda.Repository.UsuarioRepository;
import edu.ciberetc.DAWII_CL2_Miranda.model.bd.Rol;
import edu.ciberetc.DAWII_CL2_Miranda.model.bd.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepossitory;
    private RolRepository rolRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder=
            new BCryptPasswordEncoder();

    public Usuario findUserByEmail(String email){
        return usuarioRepossitory.findByEmail(email);
    }

    public Usuario findUserByUserName(String username){
        return usuarioRepossitory.findByNomusuario(username);
    }

    public Usuario saveUser(Usuario usuario){
        usuario.setPassword(bCryptPasswordEncoder.encode(
                usuario.getPassword()));
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomrol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepossitory.save(usuario);
    }

}
