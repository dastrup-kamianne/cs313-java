
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Discussion Thread</title>
    </head>
    <body>
        <h1 id="dischead">Discussion Thread</h1>
        
        
        <pre><c:import url="/discussion.txt" /></pre>
        <a href="newpost.jsp" id="adisc">Reply to the discussion thread</a>
    </body>
</html>
