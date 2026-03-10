# Database Setup for Slip 22

Run these queries in your MySQL terminal to prepare the database:

```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

CREATE TABLE employee (
    eno INT PRIMARY KEY,
    ename VARCHAR(50),
    salary DOUBLE
);
```
