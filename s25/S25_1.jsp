<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Voter Eligibility Checker</title>
</head>
<body>
    <h2>Check Voting Eligibility</h2>
    <form method="post">
        Name: <input type="text" name="name" required><br><br>
        Age: <input type="number" name="age" required><br><br>
        <input type="submit" value="Check Eligibility">
    </form>

    <%
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        if (name != null && ageStr != null) {
            int age = Integer.parseInt(ageStr);
            out.println("<h3>Hello, " + name + "!</h3>");
            
            if (age >= 18) {
                out.println("<h3 style='color:green;'>You are ELIGIBLE for voting.</h3>");
            } else {
                int yearsLeft = 18 - age;
                out.println("<h3 style='color:red;'>You are NOT ELIGIBLE for voting.</h3>");
                out.println("<p>Please wait " + yearsLeft + " more year(s).</p>");
            }
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP page determines if a user can vote based on their age input.
1. Scriptlet: Java code inside <% ... %> processes the 'age' parameter.
2. Logic: The program checks if age is greater than or equal to 18.
3. Feedback: It generates a personalized greeting and use color-coded messages 
   (Green for Eligible, Red for Not Eligible).
-->
