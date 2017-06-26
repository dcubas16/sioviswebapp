<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<footer id="footer">
	<div class="wrapper wow fadeInLeft">
		<div class="container">
			<div class="row">
				<div class="grid_3 __float-right">
					<span class="h8"><spring:message code="label.aboutus" /></span>
					<ul class="list2">
						<li><a href="#"><spring:message code="label.history" /></a></li>
						<li><a href="#"><spring:message code="label.thenew" /></a></li>
						<li><a href="#"><spring:message code="label.archieved" /></a></li>
						<li><a href="#"><spring:message code="label.testimonials" /></a></li>
					</ul>
				</div>
				<div class="grid_3 __float-right">
					<span class="h8"><spring:message code="label.ourWork" /></span>
					<ul class="list2">
						<li><a href="#"><spring:message code="label.products" /></a></li>
						<li><a href="#"><spring:message code="label.services" /></a></li>
						<!-- 						<li><a href="#">Your Membership</a></li> -->
						<!-- 						<li><a href="#">Your Account</a></li> -->
						<!-- 						<li><a href="#">Support Forum</a></li> -->
					</ul>
				</div>
				<div class="grid_3 __float-right">
					<span class="h8"><spring:message code="label.email" /></span>
					<address>
						<span><spring:message code="label.emailAddress" /></span>
					</address>
				</div>
				<div class="grid_3">
					<span class="h8"><spring:message code="label.followus" /></span>
					<ul class="socials1">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
					</ul>
					<div class="privacy-block">
						&copy; <span id="copyright-year"></span> <a href="#"><spring:message
								code="label.privacyPolicy" /></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</footer>