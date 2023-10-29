package edu.ciberetc.DAWII_CL2_Miranda.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarioRol")
public class UsuarioRol {

    @Id
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Integer idusuario;
    @ManyToOne
    @JoinColumn(name = "idrol" )
   private Integer idrol ;



}
