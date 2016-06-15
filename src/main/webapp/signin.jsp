

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Sign In</title>
    </head>
    <body>
        <h1>Sign In Page</h1>
        
        <p>Please sign in below.</p>
        
        <form action="UserSignIn" method="GET">
            Username: <input type="text" name="username"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" value="Sign In">
        </form>
        
    </body>
</html>
