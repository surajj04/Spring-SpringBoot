<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Input Form</title>
</head>
<body>
    <h2>Input Form</h2>
    <form action="addAlien" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required>
        <br><br>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
