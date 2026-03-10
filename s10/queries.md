# Database Setup for Slip 10

Run these queries in your MySQL terminal to prepare the database:

```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

CREATE TABLE student (
    rno INT PRIMARY KEY,
    sname VARCHAR(50),
    per DOUBLE
);
```
