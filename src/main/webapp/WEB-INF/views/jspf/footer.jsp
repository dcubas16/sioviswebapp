<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<footer id="footer">
	<div class="wrapper wow fadeInLeft">
		<div class="container">
			<div class="row">
				<div class="col-md-1"></div>
				<div class="col-md-3">
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
				<div class="col-md-3">
					<span class="h8"><spring:message code="label.email" /></span>
					<address>
						<span><spring:message code="label.emailAddress" /></span>
					</address>
				</div>
				<div class="col-md-3">
					<span class="h8"><spring:message code="label.ourWork" /></span>
					<ul class="list2">
						<li><a href="products.htm"><spring:message
									code="label.products" /></a></li>
						<li><a href="services.htm"><spring:message
									code="label.services" /></a></li>
						<!-- 						<li><a href="#">Your Membership</a></li> -->
						<!-- 						<li><a href="#">Your Account</a></li> -->
						<!-- 						<li><a href="#">Support Forum</a></li> -->
					</ul>
				</div>
				<div class="col-md-2">
					<span class="h8"><spring:message code="label.aboutus" /></span>
					<ul class="list2">
						<li><a href="aboutus"><spring:message
									code="label.history" /></a></li>
						<li><a href="aboutus"><spring:message code="label.thenew" /></a></li>
						<li><a href="aboutus"><spring:message
									code="label.archieved" /></a></li>
						<li><a href="aboutus"><spring:message
									code="label.testimonials" /></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>


<!-- 	<div id="cot_tl_fixed"> -->
<!-- 		<a -->
<!-- 			href="http://www.instantssl.com?key5sk1=bd8f74abea258a9f990a489cec4d2ec97e6f3128" -->
<!-- 			onclick="return cot_tl_bigPopup('https://secure.comodo.com/ttb_searcher/trustlogo?v_querytype=W&amp;v_shortname=SC5&amp;v_search=trustlogo.com&amp;x=6&amp;y=5')"><img -->
<!-- 			src="/images/comodo_secure_seal_113x59_transp.png" -->
<!-- 			alt="SSL Certificate" border="0" -->
<!-- 			onmouseover="Ovr=setTimeout('cot_tl_toggleMiniPOPUP_show()',1000);clearTimeout(Ovr2)" -->
<!-- 			onmouseout="Ovr2=setTimeout('cot_tl_toggleMiniPOPUP_hide()',3000);clearTimeout(Ovr)"></a> -->
<!-- 	</div> -->

	<div id="cot_tl_fixed">
		<a
			href="#"
			onclick=""><img
			src="resources/images/greypower_website/comodo_secure_seal_76x26_transp.png"
			alt="SSL Certificate" ></a>
	</div>

</footer>