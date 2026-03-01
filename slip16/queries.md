# Database Setup for Slip 16

Run these queries in your MySQL terminal to prepare the database:

```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

CREATE TABLE Teacher (
    TNo INT PRIMARY KEY,
    TName VARCHAR(50),
    Subject VARCHAR(50),
    Salary DOUBLE
);
```
