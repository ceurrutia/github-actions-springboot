# API REST de Prueba

![Build](https://github.com/ceciur/api-rest-image/actions/workflows/cicd-project-flow.yml/badge.svg)
![Docker](https://img.shields.io/badge/Docker-Ready-blue)
![Java](https://img.shields.io/badge/Java-17-orange)

## API REST de prueba desarrollada en Java 17 con Spring Boot.  
El proyecto incluye un flujo CI/CD configurado en GitHub Actions y publicación automática de la imagen en Docker Hub.

## Características

- Proyecto de ejemplo para flujos CI/CD
- Tres endpoints REST funcionales
- Build y push automático a Docker Hub

## Tecnologías

- Java 17  
- Spring Boot  
- Maven  
- Docker  
- GitHub Actions  

## Endpoints de ejemplo

| Método | Endpoint      | Descripción              |
|---------|---------------|--------------------------|
| GET     | `/api/welcome`  | Devuelve un mensaje simple |
| GET     | `/api/status` | Muestra el estado del servicio |
| POST    | `/api/data`   | Recibe y procesa datos |

## Imagen Docker

Para descargar la imagen:

```bash
docker pull ceciur/api-rest-image:latest
```
Ejecutar el contenedor:

```bash
docker run -p 8080:8080 ceciur/api-rest-image
```

## CI/CD

1. Cada vez que se hace un push a la rama main, el workflow realiza los siguientes pasos:
2. Compila el proyecto con Maven
3. Construye la imagen Docker
4. Publica la imagen en Docker Hub automáticamente

