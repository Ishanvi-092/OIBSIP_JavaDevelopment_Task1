# Online Reservation System – Task 1

## Objective

The objective of this project is to develop a **simple Online Reservation System using Java** that allows users to book and cancel reservations efficiently. The system is designed to store reservation data in a centralized database so that authorized users can easily access and manage booking information.

The project aims to simulate a real-world reservation process by implementing key functionalities such as **user authentication, reservation entry, and ticket cancellation using a unique PNR number**.

---

## Tools & Technologies Used

* **Java** – Core programming language used to implement the application logic
* **Java Swing** – Used to design the graphical user interface (GUI) including forms and buttons
* **MySQL** – Database used to store reservation data
* **JDBC (Java Database Connectivity)** – Used to connect the Java application with the MySQL database
* **VS Code / IntelliJ IDEA** – Development environment used for coding and testing the project

---

## Steps Performed

1. **Designed the System Modules**

   * Identified the main components of the system: Login Form, Reservation Form, and Cancellation Form.

2. **Created the Database**

   * Developed a MySQL database to store reservation information such as passenger details, train details, journey date, and PNR number.

3. **Implemented the Login Module**

   * Created a login interface where users must enter a valid user ID and password to access the system.

4. **Developed the Reservation Module**

   * Designed a form that allows users to enter travel details such as name, train number, class type, date of journey, and source and destination locations.
   * Generated a **unique PNR number** for every reservation.

5. **Implemented the Cancellation Module**

   * Enabled users to cancel their reservation by entering the PNR number.
   * The system retrieves the reservation details and confirms cancellation before deleting the record.

6. **Connected Java with MySQL**

   * Used JDBC to establish a connection between the application and the database for inserting, retrieving, and deleting records.

7. **Tested the System**

   * Verified the login functionality, reservation process, and cancellation process to ensure correct data storage and retrieval.

---

## Outcome

The project successfully demonstrates a **basic online reservation system** that allows users to log in, book reservations, and cancel tickets using a PNR number. The system stores all booking information in a database, making the process more organized and efficient.

Through this project, practical experience was gained in **Java GUI development, database connectivity using JDBC, and implementing real-world reservation workflows**.

