<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="styles.css">

    <title>Contact Us - Job Posting Portal</title>
</head>
<body>
     <%@ include file="components/navbar.jsp"%>
    <main>
        <section>
            <h2>Get in Touch</h2>
            <p>If you have any questions, suggestions, or feedback, feel free to reach out to us using the form below:</p>
            <form action="submitContact.jsp" method="post">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>

                <label for="message">Message:</label>
                <textarea id="message" name="message" rows="4" required></textarea>

                <input type="submit" value="Send Message">
            </form>
        </section>
        <section>
            <h2>Our Address</h2>
            <p>123 Job Lane,<br>Career City, CA 12345</p>
            <p>Email: <a href="mailto:info@jobportal.com">info@jobportal.com</a></p>
            <p>Phone: +1 (555) 123-4567</p>
        </section>
    </main>
    <footer>
        <p>&copy; 2024 Job Posting Portal. All rights reserved.</p>
    </footer>
</body>
</html>
