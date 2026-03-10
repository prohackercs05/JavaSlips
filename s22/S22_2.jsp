<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Greeting Page</title>
</head>
<body>
    <form method="get">
        Enter Your Name: <input type="text" name="uname" required>
        <input type="submit" value="Greet Me">
    </form>

    <%
        String name = request.getParameter("uname");
        if (name != null && !name.isEmpty()) {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            String greeting = "";

            if (hour >= 0 && hour < 12) {
                greeting = "Good Morning";
            } else if (hour >= 12 && hour < 17) {
                greeting = "Good Afternoon";
            } else {
                greeting = "Good Evening";
            }

            out.println("<h2>" + greeting + ", " + name + "!</h2>");
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP program provides a time-based greeting to the user.
1. Form Input: The user enters their name which is sent via a GET request.
2. Logic: The program uses the java.util.Calendar class to get the current hour 
   of the day from the server (calendar.get(Calendar.HOUR_OF_DAY)).
3. Conditional Check: Based on the hour (0-23):
   - Morning: 0 to 11
   - Afternoon: 12 to 16
   - Evening: 17 to 23
4. Dynamic Output: The combined string of greeting and name is displayed as an H2 header.
-->
