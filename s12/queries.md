# Database Setup for Slip 12

Run these queries in your MySQL terminal to prepare the database:

```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

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
