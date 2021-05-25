<%-- 
    Document   : verification
    Created on : 24 May, 2021, 9:36:18 PM
    Author     : saquib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verify Your Email</title>
        <link rel="shortcut icon" href="image/icons8-cloud.svg" type="image/x-icon">
        <link rel="stylesheet" href="css/main.css" type="text/css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300&display=swap" rel="stylesheet">
        
    </head>
    <body>
        <form action="/fc/registration.jsp" method="POST">
            <div class="container">
                <div class="row">
                    <div class="col-md-offset-8 col-md-4">
                    <div class="form-login">
                        <h4>Verify Your Email</h4>
                            <input type="number" id="email" class="form-control input-sm chat-input" placeholder="Enter OTP" name="otp" required="required"/><br>
                        <div class="wrapper">
                        <span class="group-btn">     
                            <button type="submit" class="btn btn-primary">Submit</button>
                            <a href="log" class="btn btn-primary btn-md">Login  <i class="fa fa-sign-in"></i></a>
                        </span>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        </form>
    </body>
</html>
