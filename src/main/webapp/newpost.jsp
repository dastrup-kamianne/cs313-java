

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <h1>Welcome, ${sessionScope.username}!</h1>
        
        <form action="CreatePost" method="GET">
            <input type="hidden" name="username" value="${sessionScope.username}">
            <textarea name="newpost" cols="50" rows="10">Enter a new post here</textarea><br><br>
            <input type="submit" value="Add Post">
        </form><br>
        
        <a href="viewpost.jsp">View discussion thread</a>
    </body>
</html>
