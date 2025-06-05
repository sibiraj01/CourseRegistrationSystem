# CourseRegistrationSystem
A basic Spring Boot application for managing course registrations. This system provides simple features to register a new course, view available courses, and enroll in a course.

## 🚀 Features

- 📘 **Register a Course**  
  Add new courses with details like course name and description.

- 📋 **Available Courses**  
  View a list of all registered courses.

- 🧑‍🎓 **Enroll a Course**  
  Enroll a student into a selected course.

  ## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 / MySQL Database
- Maven

📂 Project Structure

src/
└── main/
├── java/
│ └── com.example.course/
│ ├── controller/ # REST APIs
│ ├── model/ # Entity classes
│ ├── repository/ # JPA Repositories
│ ├── service/ # Business logic
│ └── CourseRegistrationApplication.java
└── resources/
└── application.properties


## 🧪 API Endpoints

| Method | Endpoint           | Description           |
|--------|--------------------|-----------------------|
| POST   | `/courses`         | Register a new course |
| GET    | `/courses`         | Get all courses       |
| POST   | `/enroll`          | Enroll in a course    |

2. Configure application.properties (for MySQL).
3. Run the app:
      mvn spring-boot:run
4.Test the APIs using Postman or any REST client.

🙋‍♂️ Author
Sibiraj
📍 Kanchipuram, Tamil Nadu
Passionate about building simple and useful backend systems with Java and Spring Boot.
   


