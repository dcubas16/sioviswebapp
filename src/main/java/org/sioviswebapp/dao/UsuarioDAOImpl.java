package org.sioviswebapp.dao;

import org.hibernate.SessionFactory;
import org.sioviswebapp.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioDAOImpl implements UsuarioDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Usuario obtenerUsuario(int usuarioPk) {

		Usuario usuario = (Usuario) sessionFactory.getCurrentSession().get(Usuario.class, usuarioPk);

		return usuario;
	}
}
