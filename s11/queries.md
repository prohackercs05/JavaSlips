# Database Setup for Slip 11

Run these queries in your MySQL terminal to prepare the database:

```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

CREATE TABLE DONAR (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    blood_group VARCHAR(10),
    last_donation_date DATE
);
```
