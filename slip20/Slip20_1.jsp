<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Number to Words</title>
</head>
<body>
    <h2>Enter a Number</h2>
    <form method="get">
        Number: <input type="number" name="num" required>
        <input type="submit" value="Convert">
    </form>

    <%
        String input = request.getParameter("num");
        if (input != null && !input.isEmpty()) {
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            StringBuilder result = new StringBuilder();
            
            // Handle negative numbers if necessary
            String numStr = input;
            if (input.startsWith("-")) {
                result.append("Minus ");
                numStr = input.substring(1);
            }

            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                if (digit >= 0 && digit <= 9) {
                    result.append(words[digit]).append(" ");
                }
            }

            out.println("<h3 style='color:red;'>Result: " + result.toString().trim() + "</h3>");
        }
    %>
</body>
</html>

<!--
Explanation:
This JSP program converts a numeric input into its word representation digit by digit.
1. Logic: An array of Strings ('words') stores the mapping from 0 to 9.
2. Iteration: The program treats the input as a String and loops through each character.
3. Conversion: It converts each character back to a numeric value using Character.getNumericValue()
   and uses that as an index for the 'words' array.
4. Formatting: The result is displayed inside an <h3> tag with a inline style 'color:red' 
   to meet the requirement.
-->
