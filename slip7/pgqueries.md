# PostgreSQL Setup for Slip 7

To run this on your Ubuntu terminal:

1. Open terminal and login: `sudo -u postgres psql`
2. Run these commands:

```sql
CREATE DATABASE testdb;
\c testdb

CREATE TABLE Product (
    pid INT PRIMARY KEY,
    pname VARCHAR(50),
    price DECIMAL
);

-- Sample Data
INSERT INTO Product VALUES (1, 'Laptop', 55000);
INSERT INTO Product VALUES (2, 'Mobile', 15000);
```
