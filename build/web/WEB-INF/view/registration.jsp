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
    <script src="js/cities.js"></script>

</head>

<body>
    <form action="ver" method="POST">
        <div class="container">
            <div class="row">
                <div class="col-md-offset-8 col-md-4">
                    <div class="form-login">
                        <h4>Sign Up to e-Pocket</h4>
                        <input type="text" class="form-control input-sm chat-input" placeholder="First Name" name="firstname" required="required"/><br>
                        <input type="text" class="form-control input-sm chat-input" placeholder="Last Name" name="lastname" required="required"/><br>
                        <input type="email" class="form-control input-sm chat-input" placeholder="Email" name="email" required="required"/><br>
                        <input type="number" class="form-control input-sm chat-input" placeholder="Mobile Number" name="phnum" required="required"/><br>
                        <input type="password"  class="form-control input-sm chat-input" placeholder="Password" name="password" required="required"/><br>
                        <div class="form-group">
                        <input type="number"  class="form-control input-sm chat-input" placeholder="City Code" name="city_id" required="required"/><br>
                        <input type="text"  class="form-control input-sm chat-input" placeholder="City" name="city_name" required="required"/><br>
                        <input type="number"  class="form-control input-sm chat-input" placeholder="State Code" name="state_id" required="required"/><br>
                        <input type="text"  class="form-control input-sm chat-input" placeholder="State" name="state_name" required="required"/><br>
                        <input type="number"  class="form-control input-sm chat-input" placeholder="Country Code" name="country_code" required="required"/><br>
                        <input type="text"  class="form-control input-sm chat-input" placeholder="Country Name" name="country_name" required="required"/><br>
                        
                        </div>
                        <input type="radio" name="gender" value="male" checked> Male
                        <input type="radio" name="gender" value="female"> Female
                        <input type="radio" name="gender" value="other"> Other
                        <div class="form-group">
                        <select class="form-control" name="que">
                            <option class="hidden"  selected disabled>Security Question</option>
                            <option>What is Your Birth Place?</option>
                            <option>What is Your School Name</option>
                            <option>What is Your Pet Name?</option>
                        </select>
                            <input type="text" class="form-control" placeholder="Enter Your Answer" value="" name="ans" required="required"/>
                        </div>
                        <button type="submit" class="btn btn-primary">Sign Up</button>
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