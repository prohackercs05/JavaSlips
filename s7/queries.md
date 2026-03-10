# Database Setup for Slip 7

Run these queries in your MySQL terminal to prepare the database:

```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

CREATE TABLE Product (
    pid INT PRIMARY KEY,
    pname VARCHAR(50),
    price DOUBLE
);

-- Sample Data
INSERT INTO Product VALUES (1, 'Laptop', 55000);
INSERT INTO Product VALUES (2, 'Mobile', 15000);
```
