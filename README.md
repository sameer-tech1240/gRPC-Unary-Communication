**# gRPC-Unary-Communication
Angular frontend app for searching books by ID, connected to Spring Boot backend with gRPC integration.  Fetches and displays book details like title, author, genre, and published year.  Includes error handling and stylish UI.


# Book Search Application

This is a simple Book Search web application built using **Angular** for the frontend and **Spring Boot** for the backend.  
The application allows users to search for books by their ID and view detailed information including title, author, genre, and published year.

## Features

- Search book by ID
- Display detailed book information
- User-friendly and responsive UI with validation
- Integration with a RESTful backend service

## Technologies Used

- Frontend: Angular (Standalone components, HttpClient, FormsModule)
- Backend: Spring Boot (REST API)
- Communication: HTTP REST
- Styling: CSS for clean and modern UI

## Getting Started

### Prerequisites

- Node.js and npm installed
- Angular CLI installed globally (`npm install -g @angular/cli`)
- Java JDK 11+ installed
- Maven or Gradle for backend build

### Installation & Running

git clone https://github.com/your-username/gRPC-Unary-Communication.git
cd book-search-app

Step 2: Run Backend (Spring Boot + gRPC)
cd backend
./mvnw spring-boot:run

Backend gRPC server runs on port 9090

REST API (if applicable) runs on port 8080

Step 3: Run Frontend (Angular)
cd frontend
npm install
ng serve

Open your browser and visit:
http://localhost:4200

🧩 How It Works 
1 : User enters a Book ID in the search field.

2 : Angular frontend sends a request to the Spring Boot backend using gRPC unary call.

3 : Backend queries the data source and returns the Book details.

4 : Frontend displays the book information or an error message if not found.

🔎 Sample Usage
Try searching with the following sample Book ID:
Book ID: 101

👨‍💻 Made By
Sameer Siddiqui
Developer | Java | Spring Boot | Angular | gRPC Enthusiast
