# Java Slips Completion Summary

This document provides an overview of all 30 Java Slips completed. All files are located in:  
`c:\Tomcat\apache-tomcat-9.0.115-windows-x64\apache-tomcat-9.0.115\webapps\JavaSlips\`

## Database Configuration

All database-related programs use the following credentials:

- **DB Name:** `testdb`
- **Username:** `postgres`
- **Password:** `root`
- **Driver:** `org.postgresql.Driver` (PostgreSQL JDBC Driver)

---

## Slip Index

| Slip   | Q1: Core / CLI / Collections | File                    | Q2: Swing / JDBC / Web            | File                    |
| :----- | :--------------------------- | :---------------------- | :-------------------------------- | :---------------------- |
| **1**  | Alphabet delay (A-Z)         | `s1_1.java`          | Employee Database Entry           | `s1_2.java`          |
| **2**  | HashSet friend names         | `s2_1.java`          | Request/Server Info Servlet       | `s2_2.java`          |
| **3**  | Patient details JSP          | `s3_1.jsp`           | LinkedList operations             | `s3_2.java`          |
| **4**  | Blinking text Thread         | `s4_1.java`          | City STD codes HashMap            | `s4_2.java`          |
| **5**  | Student Hashtable            | `s5_1.java`          | Random MCQ Quiz JSP               | `s5_2.jsp`           |
| **6**  | TreeSet search               | `s6_1.java`          | Traffic Signal Swing              | `s6_2.java`          |
| **7**  | Square/Cube Thread           | `s7_1.java`          | Product Table JDBC                | `s7_2.java`          |
| **8**  | Print text N times Thread    | `s8_1.java`          | Prime number check JSP            | `s8_2.jsp`           |
| **9**  | Moving Ball Swing            | `s9_1.java`          | Spring Message Bean               | `s9_2.java`          |
| **10** | Spring Date Bean             | `s10_1.java`         | Student Record Swing              | `s10_2.java`         |
| **11** | Customer Search Servlet      | `s11_1_Servlet.java` | Donor Table Metadata              | `s11_2.java`         |
| **12** | Perfect number @include      | `s12_1.jsp`          | Project Table JTable              | `s12_2.java`         |
| **13** | Database Metadata List       | `s13_1.java`         | Thread Lifecycle                  | `s13_2.java`         |
| **14** | Multi-threaded Search        | `s14_1.java`         | First/Last Digit Sum JSP          | `s14_2.jsp`          |
| **15** | Thread Name/Priority         | `s15_1.java`         | Visit Counter Cookie              | `s15_2.java`         |
| **16** | TreeSet Colors               | `s16_1.java`         | Teacher Table PreparedStatement   | `s16_2.java`         |
| **17** | Unique Sorted Integers       | `s17_1.java`         | Count 1-100 TextField             | `s17_2.java`         |
| **18** | Thread Priority Set          | `s18_1.java`         | Student Result Servlet            | `s18_2_Servlet.java` |
| **19** | Negative Ints LinkedList     | `s19_1.java`         | Database Login Servlet            | `s19_2_Servlet.java` |
| **20** | Number to Words JSP          | `s20_1.jsp`          | Blinking Image Swing              | `s20_2.java`         |
| **21** | Subjects Iterator            | `s21_1.java`         | Producer-Consumer Synchronization | `s21_2.java`         |
| **22** | Employee Menu JDBC           | `s22_1.java`         | Greeting Time JSP                 | `s22_2.jsp`          |
| **23** | Vowels delay 3s              | `s23_1.java`         | CLI Names ListIterator            | `s23_2.java`         |
| **24** | Scrolling Text Swing         | `s24_1.java`         | Redirect Login Logic              | `s24_2.jsp`          |
| **25** | Voter Eligibility JSP        | `s25_1.jsp`          | DDL Query Executor Swing          | `s25_2.java`         |
| **26** | Delete Employee CLI          | `s26_1.java`         | First/Last Digit Sum JSP          | `s26_2.jsp`          |
| **27** | Table Metadata Servlet       | `s27_1_Servlet.java` | Reverse LinkedList ListIterator   | `s27_2.java`         |
| **28** | Current Thread Name          | `s28_1.java`         | Multiplication Table JSP          | `s28_2.jsp`          |
| **29** | Table Meta Standalone        | `s29_1.java`         | Sum/Average LinkedList            | `s29_2.java`         |
| **30** | Deadlock Demonstration       | `s30_1.java`         | Teacher List Statement            | `s30_2.java`         |

---

## Execution Instructions

### 1. Core Java & Swing Programs

To compile and run standalone Java files (like `s13_1` or `s25_2`):

```cmd
javac -cp ".;postgresql-42.x.x.jar" FileName.java
java -cp ".;postgresql-42.x.x.jar" FileName
```

### 2. Servlets

1. Compile the Servlet file (`javac -cp ".;C:\path\to\servlet-api.jar" ServletName.java`).
2. Move the `.class` file to `WEB-INF/classes/`.
3. Configure the mapping in `WEB-INF/web.xml`.
4. Run Tomcat and access via: `http://localhost:8080/JavaSlips/ServletName`

### 3. JSP Pages

Simply place the `.jsp` files in the `JavaSlips` directory and access them via browser:
`http://localhost:8080/JavaSlips/SlipNumber.jsp`

### 4. Spring Programs

Ensure the Spring JARs are in the classpath during compilation and runtime. Use the corresponding `Beans.xml` files provided in the directory.

---

**Summary Completed Successfully.**
