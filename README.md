# Urban Living Backend

Production-grade Spring Boot backend for rental property management platform.

## Tech Stack

- Java 17
- Spring Boot 3.x
- PostgreSQL
- Docker & Docker Compose
- JPA/Hibernate
- Maven

## Features

- User management with role-based access control (RBAC)
- Property listings
- Secure environment configuration
- Clean architecture with separation of concerns

## Getting Started

### Prerequisites

- Java 17+
- Docker & Docker Compose
- Maven

### Setup

1. Clone the repository
```bash
git clone https://github.com/YOUR_USERNAME/urbanliving-backend.git
cd urbanliving-backend
```

2. Create `.env` file from template
```bash
cp .env.example .env
# Edit .env with your credentials
```

3. Start PostgreSQL
```bash
docker compose up -d
```

4. Run the application
```bash
mvn spring-boot:run
```

Application will start on `http://localhost:8080`

## Project Structure
```
src/main/java/com/haseeb/urbanliving/
├── config/          # Configuration classes
├── controller/      # REST API endpoints
├── service/         # Business logic
├── repository/      # Database access layer
├── domain/          # Entity models
├── dto/             # Request/Response objects
└── exception/       # Exception handling
```

## Development

Currently implementing core features. More updates coming soon.