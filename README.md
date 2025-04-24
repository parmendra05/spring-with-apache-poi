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
- Get All Customers
<pre> http://localhost:8080/api/v1/list </pre>

### Access H2 Console
<pre> http://localhost:8080/h2 </pre>
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (no password)

### API Response via Postman
- Upload Excel File
![post-api-upload](https://github.com/user-attachments/assets/207ad4d8-486d-4c8e-a8b0-d815983d5426)
- Get All Customers
![get-List](https://github.com/user-attachments/assets/f89d7135-ef7b-4e7e-ab48-51244f3860e4)



  
