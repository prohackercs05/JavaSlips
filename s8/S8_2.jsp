<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Prime Number Checker</title>
</head>
<body>
    <h2>Check if a Number is Prime</h2>
    <form method="post">
        Enter a Number: <input type="number" name="num" required>
        <input type="submit" value="Check Prime">
    </form>

    <%
        String input = request.getParameter("num");
        if (input != null) {
            int n = Integer.parseInt(input);
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                out.println("<h3 style='color:red'>" + n + " is a Prime Number.</h3>");
            } else {
                out.println("<h3 style='color:red'>" + n + " is NOT a Prime Number.</h3>");
            }
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP page accepts a number from the user via an HTML form.
The logic for checking if the number is prime is written inside a Java scriptlet.
A number is prime if it is greater than 1 and has no divisors other than 1 and itself.
The program loops from 2 up to the square root of the number (Math.sqrt(n)) to check for divisibility.
If any divisor is found, the 'isPrime' flag is set to false.
The result is then dynamically displayed on the page inside an <h3> tag with a red color style.
-->
