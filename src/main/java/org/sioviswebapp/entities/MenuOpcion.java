package org.sioviswebapp.entities;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "menu_opcion", uniqueConstraints = {
        @UniqueConstraint(columnNames = "menu_opcion_pk")})
@Inheritance(strategy=InheritanceType.JOINED)
public class MenuOpcion {
	
	@ManyToOne
    @JoinColumn(name="opcion_pk", nullable=false)
    private Opcion opcion;
	
	@ManyToOne
    @JoinColumn(name="menu_pk", nullable=false)
    private Menu menu;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "menu_opcion_pk", nullable = false)
	private int menuOpcionPk;
	
	
	@Column(name = "usuario_registro", nullable = false)
	private int usuarioRegistro;
	
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "usuario_modifico", nullable = true)
	private int usuarioModifico;
	
	@Column(name = "fecha_modifico", nullable = true)
	private Date fechaModifico;
	
	@OneToMany(mappedBy="menuOpcion")
    private Set<AccesoOpcion> accesoOpcion;

	public int getMenuOpcionPk() {
		return menuOpcionPk;
	}

	public void setMenuOpcionPk(int menuOpcionPk) {
		this.menuOpcionPk = menuOpcionPk;
	}

	public int getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(int usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getUsuarioModifico() {
		return usuarioModifico;
	}

	public void setUsuarioModifico(int usuarioModifico) {
		this.usuarioModifico = usuarioModifico;
	}

	public Date getFechaModifico() {
		return fechaModifico;
	}

	public void setFechaModifico(Date fechaModifico) {
		this.fechaModifico = fechaModifico;
	}

}
