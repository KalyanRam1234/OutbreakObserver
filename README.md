# Outbreak Observer 

This is a project that was implemented as part of the Database Lab course at IIIT-B. The domain given to us is covid-19 and we made the application `Outbreak Observer` , which helps colleges manage the Covid-19 related information of students present in the college. To get more details about the project click on the link [here](https://docs.google.com/document/d/1bO80Hu7HmiaWw8PZTwYsgPzeTPwTaU9taKHBFwcOjNY/edit?usp=sharing).

## Teck Stack and Tools

- Java v11
-  MySQL
- JDBC
- VS Code

## Steps to run the program

1) Make sure that java and mysql is installed in you local system. Create a java project in VS code and clone the repository in it.

2) Open Mysql as root and create a database named `outbreakObserverDB`. Run the sql files present in the sql folder, i.e run `source OO_create.sql`, followed by `source OO_alter.sql` and `source OO_insert.sql`.

3) Open the java project in VS code , go to the `DAO_Factory.java` file and change the password in the `PASS` variable.

4) Run the `DAO_Main.java` file to start the application. Use the login option and enter `Admin` as username and password for admin privileges. For Client privileges, enter `IMT2021001` or a valid username present in the student table as username and password.

5) Then choose the option of choice to get the desired results.

## Features

Based on the type of user, there are different views/features displayed. 

### Admin

* Enter RTPCR details of a student.
* Get RTPCR details of students:
    * Get details of all the RTPCRs of a student, by Id.
    * Get RTPCR details of a student, by Id, on a given Date.
    * Get RTPCR details of all students in institute on a given Date.
    * Get RTPCR details of all students of a batch.
* Update Vaccination details of a student
* Get Vaccination details of students:
    * Get details of all the doses of a student, by Id.
    * Get dose details of all students.
    * Get vaccination details of all students in institute.
    * Get vaccination details of all students of a batch.
* Get list of infected students and details.
    * Get all infected students details list.
    * Get infected students details list batch-wise
* Update infected students data.
* Get list of students who are roommates of Infected students.
* Get Data about hostel & qurantine facilities.
    * Get Hostel Room details based on RoomNo
    * Get Hostel Room details of all rooms
    * Get All Quarantine Room details
    * Get Empty Quarantine Room details
* Quit

### Client

* Get RTPCR details.
* Get Vaccination details.
* Quit

## Team

- Munagala Kalyan Ram (IMT2021023)
- Mayank Chamarthi (IMT2021073)
- Kadaru Jashwanth (IMT2021095)

