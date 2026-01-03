# GraphQL Spring Boot Demo

## Overview
This is a Spring Boot application that demonstrates the use of GraphQL. It provides APIs to fetch book details.

## Prerequisites
- Java 17+
- Maven
- Postman

## Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/ImJavaDeveloper/GraphQL-SpringBoot-Demo.git
   cd GraphQL-SpringBoot-Demo
   
## Testing the Application
2. Build and run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
3. Open Postman and create a new POST request to:
   ```http://localhost:8080/graphql```
4. In the request body, select "raw" and "JSON" format, then enter the following GraphQL query to fetch all books:
5. Use the following JSON payload in the body:
6. 
```json
{
  "query": "{ allBooks { id title author } }"
}
```
7. Click "Send" to execute the query. You should receive a response with the list of books.
8. You can also fetch a book by its ID using the following query:
```json
{
  "query": "{ bookById(id: 1) { id title author } }"
}
```