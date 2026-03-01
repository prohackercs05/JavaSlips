# PostgreSQL Setup for Slip 12

To run this on your Ubuntu terminal:

1. Open terminal and login: `sudo -u postgres psql`
2. Run these commands:

```sql
CREATE DATABASE testdb;
\c testdb

CREATE TABLE Project (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(100),
    project_description TEXT,
    project_status VARCHAR(20)
);

-- Sample Data
INSERT INTO Project VALUES (101, 'E-Commerce', 'Online shopping portal', 'In Progress');
INSERT INTO Project VALUES (102, 'LMS', 'Learning Management System', 'Completed');
```
