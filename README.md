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

