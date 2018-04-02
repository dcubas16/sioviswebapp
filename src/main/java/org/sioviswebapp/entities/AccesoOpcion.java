package org.sioviswebapp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "acceso_opcion", uniqueConstraints = {
        @UniqueConstraint(columnNames = "acceso_opcion_pk")})
@Inheritance(strategy=InheritanceType.JOINED)
public class AccesoOpcion {
	
	@ManyToOne
    @JoinColumn(name="menu_opcion_pk", nullable=false)
    private MenuOpcion menuOpcion;
	
	@ManyToOne
    @JoinColumn(name="perfil_menu_pk", nullable=false)
    private PerfilMenu perfilMenu;
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="acceso_opcion_pk")
	private int accesoOpcionPk;
	
	
	
	@Column(name = "es_visible", nullable = false)
	private boolean esVisible;
		
	@Column(name = "usuario_registro", nullable = false)
	private String usuarioRegistro;
	
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "usuario_modifico", nullable = true)
	private String usuarioModifico;
	
	@Column(name = "fecha_modifico", nullable = true)
	private Date fechaModifico;

}
