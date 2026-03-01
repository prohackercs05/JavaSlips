# PostgreSQL Setup for Slip 10

To run this on your Ubuntu terminal:

1. Open terminal and login: `sudo -u postgres psql`
2. Run these commands:

```sql
CREATE DATABASE testdb;
\c testdb

CREATE TABLE student (
    rno INT PRIMARY KEY,
    sname VARCHAR(50),
    per DECIMAL
);
```
