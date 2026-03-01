# PostgreSQL Setup for Slip 11

To run this on your Ubuntu terminal:

1. Open terminal and login: `sudo -u postgres psql`
2. Run these commands:

```sql
CREATE DATABASE testdb;
\c testdb

CREATE TABLE DONAR (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    blood_group VARCHAR(10),
    last_donation_date DATE
);
```
