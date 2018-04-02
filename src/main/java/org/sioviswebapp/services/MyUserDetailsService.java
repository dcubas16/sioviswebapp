package org.sioviswebapp.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.sioviswebapp.dao.UsuarioDAO;
import org.sioviswebapp.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


//@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

		// Programmatic transaction management
		/*
		return transactionTemplate.execute(new TransactionCallback<UserDetails>() {

			public UserDetails doInTransaction(TransactionStatus status) {
				com.mkyong.users.model.User user = userDao.findByUserName(username);
				List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());

				return buildUserForAuthentication(user, authorities);
			}

		});*/
		
		Usuario usuario = usuarioDAO.obtenerUsuario(1);
		List<GrantedAuthority> authorities = buildUserAuthority(usuario);

		return buildUserForAuthentication(usuario, authorities);
	}
	
	
	private List<GrantedAuthority> buildUserAuthority(Usuario usuario) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
//		for (UserRole userRole : userRoles) {
//			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
//		}
		
		setAuths.add(new SimpleGrantedAuthority(usuario.getApellidoPat()));

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}
	

	// Converts com.mkyong.users.model.User user to
	// org.springframework.security.core.userdetails.User
	private User buildUserForAuthentication(Usuario usuario, List<GrantedAuthority> authorities) {
		User user = new User(usuario.getLogin(), usuario.getContrasenia(), true, true, true, true, authorities);
		return user;
	}





}