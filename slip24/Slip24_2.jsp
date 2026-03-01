<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Portal</title>
</head>
<body>
    <h2>User Login</h2>
    <form method="post">
        Username: <input type="text" name="uname" required><br><br>
        Password: <input type="password" name="pass" required><br><br>
        <input type="submit" value="Login">
    </form>

    <%
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        // Simple check: if username and password are same
        if (uname != null && pass != null) {
            if (uname.equals(pass)) {
                // Pass to success file
                response.sendRedirect("Login.html");
            } else {
                // Pass to error file
                response.sendRedirect("Error.html");
            }
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP application handles user login by comparing credentials through 
redirection logic.
1. Scriptlet Logic: The program retrieves the 'uname' and 'pass' parameters 
   from the request object.
2. Comparison: It uses equals() to check if the username and password are 
   identical as per the slip's requirement.
3. Redirection: 
   - response.sendRedirect("Login.html"): Automatically sends the browser 
     to the success page if they match.
   - response.sendRedirect("Error.html"): Automatically sends the browser 
     to the failure page if they do not match.
-->
