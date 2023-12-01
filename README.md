# Parkometer App - Advanced Parking Management System

Welcome to the Parkometer App, an advanced Spring Boot project showcasing expertise in REST API design, Hibernate ORM, Lombok for code conciseness, Docker for seamless deployment, and MySQL for robust data storage. This cutting-edge application streamlines parking management, allowing users to register vehicles, specify parking durations, and seamlessly retrieve real-time parking information.

## 🚀 Features

- **Efficient Parking Entry Creation**: Utilize the RESTful API to create parking entries effortlessly. Users provide vehicle registration numbers and parking durations, and the system seamlessly handles the rest.

- **Dynamic Parking Information Retrieval**: Access real-time information about remaining parking time for a specific vehicle. The API responds with accurate details, ensuring a smooth user experience.

- **JSON Data Parsing and Presentation**: The application excels in parsing database records into JSON format, delivering a user-friendly response for enhanced accessibility and compatibility.

## 🛠️ Technologies Used

- **Spring Boot**: Leverage the power of Spring Boot for building robust, scalable, and easily maintainable applications.

- **Hibernate**: Employ Hibernate for efficient data handling, ensuring a seamless interaction between the application and the underlying MySQL database.

- **Lombok**: Enhance code readability and conciseness using Lombok annotations, promoting clean and maintainable code.

- **Docker**: Achieve containerized deployment for the application, ensuring consistency across different environments and facilitating easy scaling.

- **MySQL Database**: Employ MySQL for secure and reliable data storage, catering to the demands of a production-grade application.

## 📦 Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/bartoszryfa/ParkSystemApp.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd ParkSystemApp
   ```

3. **Build and Run with Maven**:
   ```bash
   mvn clean install
   java -jar target/ParkSystemApp.jar
   ```

4. **Explore the API**:
   Open your preferred API client and interact with the application at `http://localhost:8080`.

## 🐳 Docker Deployment

Run the application as a Docker container for seamless deployment and scalability:

```bash
docker build -t ParkSystemApp .
docker run -p 8080:8080 -t ParkSystemApp
```

## 🛠️ Database Configuration

Configure your MySQL database connection in `src/main/resources/application.properties` to seamlessly integrate with the application.



## 📄 License

Explore the codebase, delve into the architecture, and experience the sophistication of the ParkSyetemApp 
