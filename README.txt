Evidencia de desempeño: GA7-220501096-AA5-EV01
Nombre del aprendiz: Harminsond Alonso Alvarez Guerrero.
Programa de formación: Análisis y Desarrollo de Software (ADSO)

Descripción del Proyecto

Este proyecto consiste en un servicio web de autenticación, el cual permite:

1. Registro de nuevos usuarios con usuario y contraseña.
2. Inicio de sesión validando las credenciales ingresadas.
3. Uso de MySQL para persistencia de datos.
4. Encriptación de contraseñas con BCrypt.
5. Validación de usuario existente y respuesta adecuada.
6. Desarrollado en Java usando Spring Boot.

Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security (para BCrypt)
- MySQL

Estructura del Proyecto

- `/controller`: Controlador REST con los endpoints de registro y login.
- `/entity`: Clase de entidad `Usuario` mapeada a la tabla de MySQL.
- `/repository`: Interfaz JPA para operaciones de base de datos.
- `/service`: Lógica de negocio para registro y login.
- `application.properties`: Configuración de conexión a MySQL.
- `pom.xml`: Archivo de dependencias Maven.

Enlace al repositorio GitHub

https://github.com/GHarminsond/login-api-java.git

Cómo ejecutar el proyecto


1. Crear una base de datos en MySQL:
   CREATE DATABASE login_db;

2. Modificar `application.properties` con tus datos:
   spring.datasource.username=root
   spring.datasource.password=TU_CLAVE

3. Ejecutar con:
   ./mvnw spring-boot:run

4. Endpoints:
   - POST `/api/registro`
   - POST `/api/login`