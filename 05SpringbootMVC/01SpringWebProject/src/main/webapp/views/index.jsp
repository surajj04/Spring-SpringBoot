<%@ page language="java" %>
<html>
    <head>
         <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h2>
            Hello World!!
        </h2>
        <br>
        <div class="login-container">
           <form action="add" method="post">
                 <input type="number" id="num1" placeholder="Number 1" required name="num1">
                 <input type="number" id="num2" placeholder="Number 2" required name="num2">
                 <button type="submit">Add</button>
           </form>
        </div>
    </body>
</html>