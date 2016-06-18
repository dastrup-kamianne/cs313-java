

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Sign In</title>
    </head>
    <body>
        <h1>Sign In Page</h1>
        
        <p>Please sign in below.</p>
        
        <form action="NewSignIn" method="POST">
            Username: <input type="text" name="username"><br><br>
            Password: <input type="password" name="password"><br><br>
            <input type="submit" value="Sign In">
        </form>
        
    </body>
</html>
