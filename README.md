## Employee Management System

This is a simple Employee Management System built using Spring Boot, Gradle, and H2 database.

### Features
- Add new employees to the system.
- Retrieve a list of all employees.

### Setup
1. **Clone Repository:**
   ```
   git clone <repository-url>
   ```

2. **Build Project:**
   ```
   ./gradlew build
   ```

3. **Run Application:**
   ```
   java -jar build/libs/employee-management.jar
   ```

4. **Access Application:**
   - Open your web browser and go to `http://localhost:3000`

### API Endpoints
- **GET** `/employee/hello`: Test endpoint to check if the server is running.
- **POST** `/employee/save`: Add a new employee to the system.
  - Request Body: JSON object with `id` and `name` fields.
- **GET** `/employee/all`: Retrieve a list of all employees.

### Technologies Used
- Java
- Spring Boot
- H2 Database
- HTML/CSS/JavaScript (for frontend)

### Configuration
- The server runs on port `3000`.
- H2 in-memory database is used with the following credentials:
  - Username: `admin`
  - Password: `admin`

### Frontend
- The frontend is a simple HTML page with JavaScript for interaction.

