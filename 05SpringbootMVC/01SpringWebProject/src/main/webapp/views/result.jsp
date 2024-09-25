<%@ page language="java" %>
<html>
    <head>
         <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h2>
           <%-- Result is: <%= session.getAttribute("result") %> --%>
           Result is: ${result}
        </h2>
    </body>
</html>