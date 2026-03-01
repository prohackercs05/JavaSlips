# PostgreSQL Setup for Slip 16

To run this on your Ubuntu terminal:

1. Open terminal and login: `sudo -u postgres psql`
2. Run these commands:

```sql
CREATE DATABASE testdb;
\c testdb

CREATE TABLE Teacher (
    TNo INT PRIMARY KEY,
    TName VARCHAR(50),
    Subject VARCHAR(50),
    Salary DECIMAL
);
```
