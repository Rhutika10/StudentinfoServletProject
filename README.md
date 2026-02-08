# User Information Servlet Project

This is a simple Java Web Application built using **Jakarta Servlets** and **Apache Tomcat 10**.  
It demonstrates **form handling, server-side processing**, and **displaying user input**.

---

## Features

- User information form
- Accepts Name, Email, and Age
- Displays submitted data on a separate page
- Uses Servlet annotations (no web.xml required)

---

## Technologies Used

- Java (JDK 17 or above)
- Jakarta Servlet API
- Apache Tomcat 10.x
- HTML generated via Servlets

---

## Project Structure
UserInfoServletProject/
│
├── src/
│ └── main/
│ └── java/
│ ├── UserInformation.java
│ └── DisplayInformation.java
└── README.md


---

## Application Flow

1. Open `/userinfo` page in the browser
2. Fill the user information form (Name, Email, Age)
3. Submit the form
4. The form data is sent to `/displayinfo`
5. `/displayinfo` servlet displays the user details

---

## How to Run

1. Clone this repository:

```bash
git clone https://github.com/your-username/userinfo-servlet.git
Import into Eclipse / IntelliJ as Dynamic Web Project or Maven Web Project

Configure Apache Tomcat 10 server

Run the project

Open browser and visit:

http://localhost:8080/YourProjectName/userinfo
