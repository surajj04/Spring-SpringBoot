<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ page import="java.util.List" %>
        <%@ page import="java.util.ArrayList" %>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- JSTL Core library import -->
                <!DOCTYPE html>
                <html lang="en">

                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>View All Job Posts</title>
                    <link rel="stylesheet" href="styles.css">
                </head>

                <body>

                    <%@ include file="components/navbar.jsp" %>

                        <main>
                            <div class="container">
                                <h2>All Job Posts</h2>
                            </div>

                           
                            <div class="card-container">
                                <c:forEach var="job" items="${jobs}">
                                    <div class="card">
                                        <h3>${job.title}</h3>
                                        <p>Location: ${job.location}</p>
                                        <p>Experience: ${job.exp}</p>
                                        <p>Description: ${job.description}</p>
                                        <a href="#" class="btn">View Details</a>
                                    </div>
                                </c:forEach>
                            </div>
                        </main>

                        <footer>
                            <div class="container">
                                <p>&copy; 2024 Job Posting Portal. All rights reserved.</p>
                            </div>
                        </footer>
                </body>

                </html>