<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sum of First and Last Digits</title>
</head>
<body>
    <h2>Calculate Sum of First and Last Digit (Red/18px)</h2>
    <form method="post">
        Enter a Number: <input type="number" name="num" required>
        <input type="submit" value="Calculate Sum">
    </form>

    <%
        String input = request.getParameter("num");
        if (input != null && !input.isEmpty()) {
            // Remove negative sign if exists
            String numStr = input.startsWith("-") ? input.substring(1) : input;

            if (numStr.length() > 0) {
                // Extract digits as numeric values
                int firstDigit = Character.getNumericValue(numStr.charAt(0));
                int lastDigit = Character.getNumericValue(numStr.charAt(numStr.length() - 1));
                int sum = firstDigit + lastDigit;

                // Output with required styling: Red and font-size 18
                out.println("<p style='color:red; font-size:18px;'>");
                out.println("First Digit: " + firstDigit + "<br>");
                out.println("Last Digit: " + lastDigit + "<br>");
                out.println("<b>Sum: " + sum + "</b>");
                out.println("</p>");
            }
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP page computes and displays the sum of the first and last digits of an integer.
1. Logic: Treats the numeric input as a string to easily index the first (0) and 
   last (length-1) characters.
2. Conversion: Character.getNumericValue() converts the numeric character into its 
   integer value for arithmetic summation.
3. Styling: The result is wrapped in a <p> tag with inline CSS: 
   'color:red' and 'font-size:18px' to meet the requirement.
-->
