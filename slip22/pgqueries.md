# PostgreSQL Setup for Slip 22

To run this on your Ubuntu terminal:

1. Open terminal and login: `sudo -u postgres psql`
2. Run these commands:

```sql
CREATE DATABASE testdb;
\c testdb

CREATE TABLE employee (
    eno INT PRIMARY KEY,
    ename VARCHAR(50),
    salary DECIMAL
);
```
