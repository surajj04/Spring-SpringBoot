<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Post a Job - Job Posting Portal</title>
    <link rel="stylesheet" href="styles.css">

</head>
<body>

    <%@ include file="components/navbar.jsp" %>

    <main>
        <div class="container">
            <h2>Post a Job</h2>
            <form action="submitJobPost" method="post">
                <label for="jobTitle">Job Title:</label>
                <input type="text" id="title" name="title" required>


                <label for="location">Location:</label>
                <input type="text" id="location" name="location" required>

                <label for="experience">Experience: </label>
                <input type="text" id="experience" name="exp" required>

                <label for="description">Job Description:</label>
                <textarea id="description" name="description" rows="6" required></textarea>

                <input type="submit" value="Post Job" class="btn">
            </form>
        </div>
    </main>

    <footer>
        <div class="container">
            <p>&copy; 2024 Job Posting Portal. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>
