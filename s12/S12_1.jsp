<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Perfect Number Checker</title>
</head>
<body>
    <h2>Check if a Number is Perfect</h2>
    <form method="get">
        Enter a Number: <input type="number" name="num" required>
        <input type="submit" value="Check">
    </form>

    <%@ include file="perfect_logic.jsp" %>

    <%
        if (numStr != null) {
            String resultText = isPerfect ? "is a Perfect Number" : "is NOT a Perfect Number";
            out.println("<h3>Result: " + n + " " + resultText + "</h3>");
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP program checks for a "Perfect Number" (a number equal to the sum of its divisors).
1. @include Directive: The program uses the '@include' static directive to incorporate 
   'perfect_logic.jsp' at translation time. This allows us to keep the logic and 
   presentation separate while treating them as one joined file.
2. Logic (perfect_logic.jsp): It calculates the sum of all divisors of the input 'n' 
   and sets a boolean flag 'isPerfect'.
3. Display: Results are conditionally displayed based on the calculation done in the 
   included file.
-->
