<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sum of First and Last Digits</title>
</head>
<body>
    <h2>Calculate Sum of First and Last Digit</h2>
    <form method="post">
        Enter a Number: <input type="number" name="num" required>
        <input type="submit" value="Calculate">
    </form>

    <%
        String input = request.getParameter("num");
        if (input != null && !input.isEmpty()) {
            // Remove negative sign for processing if present
            String numStr = input.startsWith("-") ? input.substring(1) : input;

            if (numStr.length() > 0) {
                int firstDigit = Character.getNumericValue(numStr.charAt(0));
                int lastDigit = Character.getNumericValue(numStr.charAt(numStr.length() - 1));
                int sum = firstDigit + lastDigit;

                out.println("<p style='color:red; font-size:18px;'>");
                out.println("First Digit: " + firstDigit + "<br>");
                out.println("Last Digit: " + lastDigit + "<br>");
                out.println("Sum: " + sum);
                out.println("</p>");
            }
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP program calculates the sum of the first and last digits of a user-provided integer.
1. Logic: The program retrieves the input number and converts it into a string (numStr). 
   It then identifies the value at index 0 (first digit) and the index 'length - 1' 
   (last digit).
2. Processing: Character.getNumericValue() converts the numeric characters into 
   mathematical integers for summation.
3. Display: Results are outputted using a style attribute to meet requirements of 
   red color and 18px font size.
-->
