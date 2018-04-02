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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "MENU", uniqueConstraints = {
        @UniqueConstraint(columnNames = "menu_pk")})
@Inheritance(strategy=InheritanceType.JOINED)
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="menu_pk")
	private int menuPk;
	
	@Column(name = "codigo_padre", nullable = true)
	private int codigoPadre;
	
	@Column(name = "ventana", nullable = false)
	private String ventana;
	
	@Column(name = "usuario_registro", nullable = false)
	private String usuarioRegistro;
	
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "usuario_modifico", nullable = true)
	private String usuarioModifico;
	
	@Column(name = "fecha_modifico", nullable = true)
	private Date fechaMdifico;
	
	@OneToMany(mappedBy="menu")
    private Set<PerfilMenu> perfilMenu;
	
	@OneToMany(mappedBy="menu")
    private Set<MenuOpcion> menuOpcion;

	public int getMenuPk() {
		return menuPk;
	}

	public void setMenuPk(int menuPk) {
		this.menuPk = menuPk;
	}

	public int getCodigoPadre() {
		return codigoPadre;
	}

	public void setCodigoPadre(int codigoPadre) {
		this.codigoPadre = codigoPadre;
	}

	public String getVentana() {
		return ventana;
	}

	public void setVentana(String ventana) {
		this.ventana = ventana;
	}

	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getUsuarioModifico() {
		return usuarioModifico;
	}

	public void setUsuarioModifico(String usuarioModifico) {
		this.usuarioModifico = usuarioModifico;
	}

	public Date getFechaMdifico() {
		return fechaMdifico;
	}

	public void setFechaMdifico(Date fechaMdifico) {
		this.fechaMdifico = fechaMdifico;
	}
	
	
}
