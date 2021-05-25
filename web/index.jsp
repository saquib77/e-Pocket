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
    <link rel="shortcut icon" href="image/icons8-cloud.svg" type="image/x-icon">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="css/main.css" type="text/css" />
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

</head>

<body>
    <form action="fc" method="POST>"
<div class="container">
    <div class="row">
        <div class="col-md-offset-8 col-md-4">
            <div class="form-login">
            <h4>Welcome back to e-Pocket</h4>
            <input type="email" id="email" class="form-control input-sm chat-input" placeholder="Email" name="email" required="required"/>
            </br>
            <input type="text" id="password" class="form-control input-sm chat-input" placeholder="Password" name="password" required="required"/>
            </br>
            <div class="wrapper">
            <span class="group-btn">     
                <button type="submit" class="btn btn-primary">Login</button>
                <a href="fc/reg" class="btn btn-primary btn-md">Sign Up  <i class="fa fa-sign-in"></i></a>
            </span>
            </div>
            </div>
        
        </div>
    </div>
</div>
</form>

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body>

</html>