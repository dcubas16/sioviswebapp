<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<header id="header" class="main-page">
	<div class="info" style="padding: 10px 0 0px">
		<div class="container">
			<div class="row">
<!-- 				<div class="grid_3"> -->
<!-- 					<address>Jirón Los Castaños </address> -->
<!-- 				</div> -->
				<div class="grid_2">
					<span class="link"><a href="#"><spring:message code="label.emailAddress"/></a></span>
				</div>
				<div class="grid_2">
					<span class="phone">+51 949 815 064</span>
				</div>
				<div class="grid_3">

				</div>
				
				
				<div class="grid_5">
					<ul class="socials1">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
<!-- 						<li><a href="#"><i class="fa fa-rss"></i></a></li> -->
<!-- 						<li><a href="#"><i class="fa fa-pinterest"></i></a></li> -->
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="stuck_container">
		<div class="wrapper">
			<div class="container">
				<div class="row">
					<div class="grid_12">
						<h1>
							<a href="home.htm"> 
								<img border="0" alt="GreyPower" src="resources/images/greypower_logo_website_horizontal.png" 
								width="270" height="70" style="padding-bottom: 10px">
							</a>
						</h1>
						<nav>
							<ul class="sf-menu">
								<li class="current"><a href="home.htm"><spring:message code="label.home"/></a></li>
								<li><a href="aboutus.htm"><spring:message code="label.aboutus"/></a>
									<ul>
										<li><a href="history.htm"><spring:message code="label.history"/></a></li>
										<li><a href="news.htm"><spring:message code="label.news"/></a>
											<ul>
												<li><a href="theNew.htm"><spring:message code="label.thenew"/></a></li>
												<li><a href="archieved.htm"><spring:message code="label.archieved"/></a></li>
											</ul></li>
										<li><a href="testimonials.htm"><spring:message code="label.testimonials"/></a></li>
									</ul></li>
								<li><a href="services.htm"><spring:message code="label.services"/></a></li>
								<li><a href="products.htm"><spring:message code="label.products"/></a></li>
								<li><a href="contact.htm"><spring:message code="label.contact"/></a></li>
							</ul>
							<div class="clearfix"></div>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
</header>