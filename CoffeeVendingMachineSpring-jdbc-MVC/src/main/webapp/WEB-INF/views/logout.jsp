<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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

</style>

</head>

<div class="header-dark"></div>
<div class="navbar">GoodBye!</div>
<body>
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
          
          <a class="nav-item nav-link" href="./">Login</a>
          
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
<h5>${message}</h5>
</div></div></div></div></div></div></div>
</section>
<footer>
<div class="footer-dark"></div>
</footer>
</body>
</html>