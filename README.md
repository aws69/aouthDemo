# Authentication and Posting Web Application

## Overview

This web application is designed to provide user authentication and posting capabilities. It is built using the Spring Boot framework and Thymeleaf for rendering dynamic HTML templates. Users can register, log in, create posts, view their posts, and log out.

## Features

### User Authentication

- **Sign Up**: Users can create an account by providing a unique username and password. Passwords are securely hashed using BCrypt before being stored in the database.

- **Log In**: Registered users can log in by entering their username and password. The system validates their credentials, and upon successful login, they gain access to their account.

- **Log Out**: Users can securely log out of their accounts, terminating their session.

### Posting Functionality

- **Create Posts**: Authenticated users can create new posts by entering text in a provided form. These posts are associated with their accounts.

- **View Posts**: Upon logging in, users are directed to their home page, where they can view a list of their posts. Each post is displayed in a user-friendly format.


## Getting Started

To run this project locally, follow these steps:

1. Clone the repository to your local machine.
2. Set up a MySQL database and configure the database connection in the application.properties file.
3. Build and run the Spring Boot application.
4. Access the application in your web browser using the provided URL (e.g., http://localhost:8080).

## Technologies Used

- **Java**: The backend of the application is developed in Java using the Spring Boot framework.

- **Spring Data JPA**: For database access and management.

- **Thymeleaf**: Used for server-side HTML rendering.

- **BCrypt**: Used for secure password hashing.

- **HTML and CSS**: Used for the user interface.

## Usage

1. Register a new account by clicking "Sign Up."
2. Log in with your credentials.
3. Create posts, view them on your home page, and log out when done.

#

