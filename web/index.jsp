<%-- 
    Document   : welcome
    Created on : 24 May, 2021, 11:30:08 AM
    Author     : saquib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>e-Pocket</title>
        <!--<link rel="stylesheet" type="text/css" href="css/slider.css">-->
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="bootstrap.css">
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        
</head>
<body>
    <nav class="navbar navbar-default">
	<div class="container">
            <div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-nav-demo" aria-expanded="false">
       		<span class="sr-only">Toggle navigation</span>
        	<span class="icon-bar"></span>
        	<span class="icon-bar"></span>
       		<span class="icon-bar"></span>
      		</button>
		<a href="#" class="navbar-brand">e-Pocket</a>
		</div>
                <div>
                    <div class="collapse navbar-collapse" id="bs-nav-demo">
			<ul class="nav navbar-nav">
                            <li><a href="#">About</a></li>
                            <li><a href="#">Contact</a></li>
                            <li><a href="#">Privacy & Policies</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
                            <li><a href="fc/Registration">Sign Up</a></li>
                            <li><a href="fc/Login">Log In</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
	<div class="slideshow-container">
            
            <input id="sliderSwitch" class="slider__switch" type="checkbox" name="sliderSwitch" hidden />
            <div class="slider">
              <ul class="slider__list">
                <li class="slider__slide"><img src="image/slider/1.png" style="width: 100%" /></li>
                <li class="slider__slide"><img src="image/slider/2.png" style="width: 100%" /></li>
                <li class="slider__slide"><img src="image/slider/3.png" style="width: 100%" /></li>
                <li class="slider__slide"><img src="image/slider/4.png" style="width: 100%" /></li>
              </ul>
            </div>
	</div>-
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <script type="text/javascript" src="js/slider.js"></script>
</body>
</html>