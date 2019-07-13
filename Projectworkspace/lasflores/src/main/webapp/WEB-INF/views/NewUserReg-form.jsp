<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="YOUR_CLIENT_ID.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <link href="<c:url value="/resources/css/backgroundlogin.css" />" rel="stylesheet">

<script>
function onSignIn(googleUser) {
    // Useful data for your client-side scripts:
    var profile = googleUser.getBasicProfile();
    console.log("ID: " + profile.getId()); // Don't send this directly to your server!
    console.log('First Name: ' + profile.getFirstname());
    console.log('Last Name: ' + profile.getLastname());
    console.log("Email: " + profile.getEmail());
    console.log("Phone No: " + profile.getPhoneno());
    // The ID token you need to pass to your backend:
    var id_token = googleUser.getAuthResponse().id_token;
    console.log("ID Token: " + id_token);
    
function validateForm() {
  var x = document.forms["myForm"]["fname"].value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }



var email = document.forms.Email;

if (email.value == "")

{

window.alert("Please enter a valid e-mail address.");

email.focus();

return false;

}

if (email.value.indexOf("@", 0) < 0)

{

window.alert("Please enter a valid e-mail address.");

email.focus();

return false;

}

if (email.value.indexOf(".", 0) < 0)

{

window.alert("Please enter a valid e-mail address.");

email.focus();

return false;

}

    if(form.pwd1.value != "" && form.pwd1.value == form.pwd2.value) {
      if(form.pwd1.value.length < 6) {
        alert("Error: Password must contain at least six characters!");
        form.pwd1.focus();
        return false;
      }
      if(form.pwd1.value == form.firstname.value) {
        alert("Error: Password must be different from Username!");
        form.pwd1.focus();
        return false;
      }
      re = /[0-9]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one number (0-9)!");
        form.pwd1.focus();
        return false;
      }
      re = /[a-z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one lowercase letter (a-z)!");
        form.pwd1.focus();
        return false;
      }
      re = /[A-Z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one uppercase letter (A-Z)!");
        form.pwd1.focus();
        return false;
      }
    } else {
      alert("Error: Please check that you've entered and confirmed your password!");
      form.pwd1.focus();
      return false;
    }

    alert("You entered a valid password: " + form.pwd1.value);
    return true;
  }
  }
</script>
</head>

<body>
 
<form name=forms onsubmit="return validateForm()" method="post" modelAttribute="userReg">
  FirstName: <input type="text" name="fname"><br><br>
  LastName: <input type="text" name="lname"><br><br>
  Password: <input type="password" name="password"><br><br>
  Email: <input type="email" name="email"><br><br>
  Phone Number: <input type="text" name="mobile"><br><br>
  <input type="submit" value="Submit">
  
 </form>
  

</body>
</html>

