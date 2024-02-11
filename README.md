# Spring Boot Actuator

This repository contains a Spring Boot application with Actuator enabled. Spring Boot Actuator provides a set of production-ready features to help you monitor and manage your application.

## Features

- **Health Check:** Actuator provides health indicators to check the status of your application.
- **Metrics:** Monitor application metrics like memory usage, CPU usage, etc.
- **Environment:** View application properties and environment variables.
- **Endpoints:** Access various endpoints to interact with the application.
- **Auditing:** Keep track of application activity and events.

## Technologies Used

- Java
- Spring Boot
- Spring Boot Actuator

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/Paras2322/SpringBootActuator.git
    cd SpringBootActuator
    ```

2. **Build and run the application:**

    You can build and run the application using Maven:

    ```bash
    mvn spring-boot:run
    ```

3. **Access Actuator endpoints:**

    Once the application is running, you can access Actuator endpoints at `http://localhost:8080/actuator`.

## Usage

- Check the health of your application: `http://localhost:8080/actuator/health`
- View application metrics: `http://localhost:8080/actuator/metrics`
- Explore other Actuator endpoints for monitoring and managing your application.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvements, please open an issue or create a pull request.
