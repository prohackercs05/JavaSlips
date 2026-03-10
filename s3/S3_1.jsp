<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Patient Details</title>
    <style>
        table { border-collapse: collapse; width: 100%; border: 1px solid black; }
        th, td { border: 1px solid black; padding: 10px; text-align: left; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>
    <h2>Patient Information Table</h2>
    <table>
        <tr>
            <th>PNo</th>
            <th>PName</th>
            <th>Address</th>
            <th>Age</th>
            <th>Disease</th>
        </tr>
        <% 
            // Sample data - usually this would come from a database or list
            String[][] patients = {
                {"101", "John Doe", "New York", "45", "Flu"},
                {"102", "Jane Smith", "London", "30", "Fever"},
                {"103", "Robert Clark", "Paris", "55", "Asthma"},
                {"104", "Alice Bond", "Berlin", "22", "Cold"}
            };

            for (int i = 0; i < patients.length; i++) {
        %>
        <tr>
            <td><%= patients[i][0] %></td>
            <td><%= patients[i][1] %></td>
            <td><%= patients[i][2] %></td>
            <td><%= patients[i][3] %></td>
            <td><%= patients[i][4] %></td>
        </tr>
        <% 
            } 
        %>
    </table>
</body>
</html>

<!--
Explanation:
This is a Java Server Page (JSP) that displays patient details in an HTML table.
The patient data is stored in a 2D String array for demonstration.
A Java 'for' loop is used inside scriptlet (<% ... %>) to iterate through the data.
Expression tags (<%= ... %>) are used to dynamically output the values into <td> elements.
CSS styling is used to make the table look clean and proportional.
-->
