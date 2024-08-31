#Product Catalog REST API
This project is a Spring Boot application designed to manage a simple product catalog. It provides a RESTful API for managing products and includes features such as authentication, integration with an external API, and performance optimization.

#Features
CRUD Operations: Create, Read, Update, and Delete products.
Security: Basic authentication and role-based access control.
External API Integration: Fetch and update product prices.
Performance Optimization: Pagination, indexing, and caching.
Testing: Unit and integration tests with high coverage.
Documentation: API documentation using Swagger.
#Technologies Used
Java 17
Spring Boot 2.x
Spring Data JPA (for MySQL)
Spring Security
MySQL 
JUnit and Mockito for testing
Getting Started
Prerequisites
Postman or similar tool for testing API endpoints
#Setup Instructions
1. Clone the Repository
bash
Copy code
git clone https://github.com/kranthi-rekha/product-catalog-api.git
cd product-catalog-api
2. Configure the Database
For MySQL
Create a MySQL Database

sql
Copy code
CREATE DATABASE product;
Update application.properties

#properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/product
spring.datasource.username=root
spring.datasource.password=Root@12
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



#3. Set Up Security
Create Users

Users are stored in the database. You need to create an ADMIN user and possibly other roles depending on your needs. Example for MySQL:

INSERT INTO users (username, password, roles) VALUES ('admin', '{bcrypt}$2a$10$...', 'ROLE_ADMIN');
Configure Password Encryption

Ensure that passwords are encoded using BCryptPasswordEncoder. The configuration for encryption is already included in SecurityConfig.

#4. Build and Run the Application
Build the Project
Run the Application


#5. Testing the API
Open Postman or any other API testing tool.

Test Endpoints

GET /products: Retrieve a list of products.
GET /products/{id}: Retrieve a specific product by ID.
POST /products: Create a new product.
PUT /products/{id}: Update an existing product by ID.
DELETE /products/{id}: Delete a product by ID.
Authentication

Use Basic Authentication with the credentials you set up in the database.

Scheduled Task
The application includes a scheduled task that updates product prices every 24 hours. Ensure your application is running to trigger the task.

Caching
The application uses caching to optimize product price retrieval. Adjust the caching configuration in application.properties if needed.

Testing
Unit Tests

Run unit tests with:
Integration Tests

Integration tests are included in the project. Ensure they are run as part of the build process.



To deploy the application to a cloud environment, follow the specific deployment instructions for the chosen cloud provider. Ensure to update the database connection settings accordingly.

Troubleshooting
Database Connection Issues: Verify your database credentials and URL in application.properties.
Application Errors: Check application logs for detailed error messages.
Testing Failures: Ensure that the test database is correctly set up and that all necessary data is seeded.
Contributing
Feel free to contribute by submitting issues, pull requests, or suggesting improvements.

This README.md file provides a comprehensive guide for setting up, running, and testing the application. Adjust the configuration details according to your environment and
