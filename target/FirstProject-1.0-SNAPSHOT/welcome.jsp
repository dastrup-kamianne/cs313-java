

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        
        <h1>
            Welcome ${param.username}!
        </h1>
        
        <form action="UserLogOut" method="GET">
            <input type="submit" value="Log Out">
        </form>
        
    </body>
</html>
