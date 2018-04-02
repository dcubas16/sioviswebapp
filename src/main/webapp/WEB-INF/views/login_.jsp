<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<head>
<c:import url="../views/jspf/resources_login.jsp" />
  <body class="text-center">
  		
    <form class="form-signin">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputEmail" class="sr-only">Usuario ID</label>
      <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="">
      <label for="inputPassword" class="sr-only">Contraseña</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
<!--       <div class="checkbox mb-3"> -->
<!--         <label> -->
<!--           <input type="checkbox" value="remember-me"> Remember me -->
<!--         </label> -->
<!--       </div> -->
      <button class="btn btn-lg btn-primary btn-block" type="submit">Aceptar</button>
      <p class="mt-5 mb-3 text-muted">© 2017-2018</p>
    </form>

</html>