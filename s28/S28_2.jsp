<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Multiplication Table Generator</title>
</head>
<body>
    <h2>Multiplication Table Generator</h2>
    <form method="post">
        Enter a Number: <input type="number" name="num" required>
        <input type="submit" value="Generate Table">
    </form>

    <%
        String input = request.getParameter("num");
        if (input != null && !input.isEmpty()) {
            try {
                int n = Integer.parseInt(input);
                out.println("<h3>Multiplication Table for " + n + ":</h3>");
                out.println("<table border='1' cellpadding='5'>");
                out.println("<tr><th>Expression</th><th>Result</th></tr>");

                for (int i = 1; i <= 10; i++) {
                    out.println("<tr>");
                    out.println("<td>" + n + " x " + i + "</td>");
                    out.println("<td>" + (n * i) + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Invalid input: Please enter a valid integer.</p>");
            }
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP program generates a mathematical multiplication table based on user input.
1. HTTP Request: The program retrieves the numeric value from the client's POST submission.
2. Multiplication Logic: A standard for loop (from 1 to 10) calculates the value 
   of 'n * i' for each iteration.
3. Tabular Output: The result is dynamically formatted within an HTML <table> structure 
   for a clear, organized display.
4. Robustness: A try-catch block for NumberFormatException ensures the page 
   handles non-numeric strings gracefully if they bypass the client-side type check.
-->
