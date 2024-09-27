<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success! Your Job Post is Live!</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <%@ include file="components/navbar.jsp" %>

    <!-- Main Content -->
    <main>
        <div class="success-message">
            <h2>Your job post has been successfully added!</h2>
            <p>It’s now live on our job board and can be viewed by potential candidates.</p>
        </div>

        <div class="job-summary">
            <h3>Job Post Summary</h3>
            <p><strong>Title:</strong> ${job.title}</p>
            <p><strong>Company:</strong>${job.location}</p>
            <p><strong>Location:</strong> ${job.description}</p>
            <p><strong>Posted On:</strong> ${job.exp}</p>
        </div>

        <div class="next-steps">
            <h3>What would you like to do next?</h3>
            <a href="/jobpost" class="btn">Post Another Job</a>
            <a href="/jobs" class="btn">View My Job Posts</a>
        </div>
    </main>

</body>
</html>
