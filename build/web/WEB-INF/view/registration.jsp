<%@include file="include/header.jsp" %>
    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100">
                <div class="login100-form-title" style="background-image: url(../image/bg-01.jpg);">
                    <span class="login100-form-title-1">Sign Up</span>
		</div>
                    <form action="/registration" class="login100-form validate-form" method="POST">
                        <div class="wrap-input100 validate-input m-b-26" data-validate="First Name is required">
                            <span class="label-input100">First Name</span>
                            <input class="input100" type="text" name="firstname" placeholder="Enter First Name">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Last Name is required">
                            <span class="label-input100">Last Name</span>
                            <input class="input100" type="text" name="lastname" placeholder="Enter Last Name">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Email is required">
                            <span class="label-input100">Email</span>
                            <input class="input100" type="text" name="email" placeholder="Enter Email">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-18" data-validate="Password is required">
                            <span class="label-input100">Password</span>
                            <input class="input100" type="password" name="pass" placeholder="Enter password">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Phone Num is required">
                            <span class="label-input100">Phone Number</span>
                            <input class="input100" type="text" name="phnum" placeholder="Enter Your Phone Number">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate="City Name is required">
                            <span class="label-input100">City Name</span>
                            <input class="input100" type="text" name="city_name" placeholder="Enter City Name">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate="State Name is required">
                            <span class="label-input100">State Name</span>
                            <input class="input100" type="text" name="state_name" placeholder="Enter State Name">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Country Name is required">
                            <span class="label-input100">Country Name</span>
                            <input class="input100" type="text" name="country_name" placeholder="Enter Country Name">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="flex-sb-m w-full p-b-30">
                            <div class="contact100-form-checkbox">
                                <input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
                                <label class="label-checkbox100" for="ckb1">Remember me</label>
                            </div>
                        </div>
                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn">Sign Up</button>
                        </div>
                </form>
            </div>
        </div>
    </div>
<%@include file="include/footer.jsp" %>