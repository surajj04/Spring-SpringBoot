<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Portal</title>
    <link rel="stylesheet" href="styles.css">
</head>

<body>
    <%@ include file="components/navbar.jsp" %>

    <main>
        <div class="container">
            <section class="welcome-section">
                <h2>Welcome to the Job Portal</h2>
                <p>Are you looking to post a job or find your next career opportunity?</p>
            </section>

            <section class="options-section">
                <div class="option">
                    <h3>Post a Job</h3>
                    <p>Looking for the right candidate? Post a job and connect with talented professionals.</p>
                    <a href="/jobpost" class="btn btn-post-job">Post a Job</a>
                </div>
                <div class="option">
                    <h3>Explore Jobs</h3>
                    <p>Browse thousands of job opportunities and apply to your dream job today.</p>
                    <a href="/jobs" class="btn btn-explore-jobs">Explore Jobs</a>
                </div>
            </section>
        </div>
    </main>

    <footer>
        <div class="container">
            <p>&copy; 2024 Job Portal. All rights reserved.</p>
        </div>
    </footer>

</body>

</html>
