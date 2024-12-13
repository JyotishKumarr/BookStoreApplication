# Bookstore Application

This is a **Bookstore Application** developed using **Spring Boot**, connected to a **MySQL database** through **phpMyAdmin**. It performs **CRUD operations** for managing books in the store.

## Features

- Add new books to the inventory
- View all books
- Update book details
- Delete books from the inventory
- Adding books to my cart
- Delete books from my cart

## Tech Stack

### Back-End
- **Spring Boot**
- **Java**

### Database
- **MySQL**
- Managed using **phpMyAdmin**

### Tools
- **Maven** for dependency management

## Prerequisites

1. **Java JDK 8 or higher**
2. **Spring Boot**
3. **MySQL** and **phpMyAdmin**
4. **Maven**
5. **IDE** (Eclipse)


### Build and Run the Application

- Build the application using Maven:
  ```bash
  mvn clean install
  ```
- Run the Spring Boot application:
  ```bash
  mvn spring-boot:run
  ```


## Project Structure

# Bookstore Application

This is a **Bookstore Application** developed using **Spring Boot**, connected to a **MySQL database** through **phpMyAdmin**. It performs **CRUD operations** for managing books in the store.

## Features

- Add new books to the inventory
- View all books
- Update book details
- Delete books from the inventory

## Tech Stack

### Back-End
- **Spring Boot**
- **Java**

### Database
- **MySQL**
- Managed using **phpMyAdmin**

### Tools
- **Maven** for dependency management
- **Postman** for API testing (optional)

## Prerequisites

1. **Java JDK 8 or higher**
2. **Spring Boot**
3. **MySQL** and **phpMyAdmin**
4. **Maven**
5. **IDE** (e.g., IntelliJ IDEA, Eclipse, etc.)

## Setup Instructions

### 1. Clone the Repository
```bash
git clone <repository-url>
cd bookstore-application
```

### 2. Configure MySQL Database

- Create a database named `bookstore` in **phpMyAdmin**:
  ```sql
  CREATE DATABASE bookstore;
  ```
- Update the `application.properties` file located in `src/main/resources` with your MySQL credentials:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
  spring.datasource.username=<your-mysql-username>
  spring.datasource.password=<your-mysql-password>
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  ```

### 3. Build and Run the Application

- Build the application using Maven:
  ```bash
  mvn clean install
  ```
- Run the Spring Boot application:
  ```bash
  mvn spring-boot:run
  ```

### 4. Test the API Endpoints

You can use **Postman** or any REST client to test the following endpoints:

#### Base URL
`http://localhost:8080/api/books`

#### Endpoints

| Method   | Endpoint          | Description                  |
|----------|-------------------|------------------------------|
| `POST`   | `/`               | Add a new book              |
| `GET`    | `/`               | Get all books               |
| `GET`    | `/{id}`           | Get a book by its ID        |
| `PUT`    | `/{id}`           | Update book details by ID   |
| `DELETE` | `/{id}`           | Delete a book by ID         |

### Example Request/Response

#### Add a New Book (`POST /api/books`)

**Request Body:**
```json
{
  "title": "Spring Boot Essentials",
  "author": "John Doe",
  "price": 29.99
}
```

**Response:**
```json
{
  "id": 1,
  "title": "Spring Boot Essentials",
  "author": "John Doe",
  "price": 29.99
}
```

#### Get All Books (`GET /api/books`)

**Response:**
```json
[
  {
    "id": 1,
    "title": "Spring Boot Essentials",
    "author": "John Doe",
    "price": 29.99
  }
]
```

## Project Structure

```
bookstore-application
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.bookstore
│   │   │       ├── controller
│   │   │       │   ├── BookController.java
│   │   │       │   ├── MyBookController.java
│   │   │       ├── model
│   │   │       │   ├── Book.java
│   │   │       │   ├── MyBook.java
│   │   │       ├── repository
│   │   │       │   ├── BookRepository.java
│   │   │       │   ├── MyBookRepository.java
│   │   │       ├── service
│   │   │       │   ├── BookService.java
│   │   │       │   ├── MyBookService.java
│   │   │       └── BookstoreApplication.java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │   ├── html pages
│   │   │   ├── application.properties
│   │   └── static
│   └── test
├── pom.xml
└── README.md
```

## Future Enhancements

1. Implement user authentication and authorization.
2. Add advanced filtering and sorting capabilities.
3. Create a front-end interface using Angular or React.

