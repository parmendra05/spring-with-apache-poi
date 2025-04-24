# Excel to H2 Database using Spring Boot

## Features
- Upload Excel (.xlsx) file via REST API
- Parse Excel data using Apache POI
- Save data to H2 in-memory database
- Retrieve stored data using a GET API
- H2 Console enabled for direct DB access

## Tech Stack
- Java 17
- Maven
- Spring Boot
- Spring Web
- Spring Data JPA
- Apache POI
- H2 Database

### API Endpoints
- Upload Excel File 
<pre> http://localhost:8080/api/v1/upload </pre>
- Get All Users
<pre> http://localhost:8080/api/v1/list </pre>

### Access H2 Console
<pre> http://localhost:8080/h2 </pre>
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (no password)
