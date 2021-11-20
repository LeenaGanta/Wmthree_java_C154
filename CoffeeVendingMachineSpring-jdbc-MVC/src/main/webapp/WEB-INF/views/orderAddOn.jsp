<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Order AddOn </title>
<style>
@charset "ISO-8859-1";

.footer-dark {
	background:
		url(https://www.nescafe.com/gb/sites/default/files/coffee-bean-art-header-desktop.jpg)
		#444;
	background-repeat: no-repeat;
	background-size: 100% 120%;
	padding-top: 80px;
}

.header-dark {
	background:
		url(https://image.shutterstock.com/image-photo/bannercafes-restaurants-mug-invigorating-black-260nw-1854759595.jpg)
		#444;
	background-repeat: no-repeat;
	background-size: 100% 110%;
	padding-bottom: 80px;
}

.navbar {
	background: transparent;
	padding-top: 0;
	padding-bottom: 0;
	color: #996347;
	font-family: 'Elsie Swash Caps', cursive;
	font-weight: bold;
	text-align: center;
	}
.button {
  background-color: #996347; 
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.login {
	border: 5px outset #A47381;
	border-radius: 0px 0px 40px 0px;
	padding-top: 15px;
	padding-bottom: 15px;
	padding-left: 15px;
	padding-right: 15px;
	background: #FFFFFF;
background: -moz-linear-gradient(45deg, #FFFFFF 0%, #D18761 45%, #996347 100%);
background: -webkit-linear-gradient(45deg, #FFFFFF 0%, #D18761 45%, #996347 100%);
background: linear-gradient(45deg, #FFFFFF 0%, #D18761 45%, #996347 100%);
}

</style>

</head>
<body>
<div class="header-dark"></div>
<div class="navbar">Add-On Menu</div>
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    	<br>
    	<br>
    	<br>
        <div class="container">
      <br><br><br>
      <a href="./"  style="margin: 0 auto; text-align: center; font-size:25px; background:activeborder; font-family:serif;">
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      
 
      
      <div class="nav justify-content-end" id="navbarNavAltMarkup">
        <div class="navbar-nav ml-auto">
          <a class="nav-item nav-link" href="./coffeeMenu">Coffee Menu </a>
          <a class="nav-item nav-link" href="./order">Order Coffee </a>
           <a class="nav-item nav-link" href="./check">Check Added Results </a>
          <a class="nav-item nav-link" href="./home">Home</a>
			 <a class="nav-item nav-link" href="./bill">Bill</a>
        </div>
      </div>
      </div>
    </nav>
</header>


<section>
<div class="login">
	<div id="cover-caption">
        <div id="container" class="container">
            <div class="row">
                <div class="col-sm-10 offset-sm-1 text-center">
                    <br>
                    <br>
                    <div class="info-form">
		<div class="form-center">
		<h5>Whatever you wish for ${user.name}</h5>
		<br><br><br>
<form action="./addAddOn" method="post">
AddOn: <select name="addOn">
<c:forEach items="${addOns}"  var="addOn">
&nbsp;&nbsp;<option value="${addOn}">${addOn}</option>
</c:forEach>
</select>
<br><br>
<input type="submit" value="submit" class="button">
</form>
<br><br><br>
${message }
</div></div></div></div></div></div></div>
</section>
<br><br>
<footer>
<div class="footer-dark"></div>
</footer>
</body>
</html>