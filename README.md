# Administrador de Propiedades

## Resumen del Proyecto

Este sistema permite la gestión de propiedades inmobiliarias, proporcionando una API REST que facilita la creación, lectura, actualización y eliminación (CRUD) de propiedades. El sistema está compuesto por un backend en Java con Spring Boot, una base de datos MySQL y un frontend desarrollado en HTML, CSS y JavaScript, utilizando fetch para las peticiones HTTP.

## Arquitectura del Sistema

El sistema está compuesto por los siguientes componentes:

- **Frontend**: Desarrollado con HTML, CSS y JavaScript. Utiliza fetch para comunicarse con el backend mediante peticiones HTTP.
- **Backend**: Implementado en Java con Spring Boot, proporcionando servicios REST para la gestión de propiedades.
- **Base de Datos**: Se usa MySQL como base de datos relacional para almacenar la información de las propiedades.
- **Docker**: Se utiliza para contenerizar la aplicación y facilitar su despliegue en diferentes entornos, incluyendo AWS EC2.


![diagramaqDespliegueTaller5AREP](https://github.com/user-attachments/assets/075c37b4-4a00-4fe5-9069-a44bda4dab8e)


## Diseño de Clases

Las principales clases del sistema son:

1. **Property**: Representa una propiedad inmobiliaria con atributos como dirección, descripción, precio y tamaño.
2. **PropertyService**: Contiene la lógica de negocio para la manipulación de las propiedades.
3. **PropertyController**: Expone los endpoints REST para interactuar con la API.
4. **PropertyRepository**: Interface que extiende JpaRepository para interactuar con la base de datos.

### Diagrama de Clases
![DiagramaClasesTaller5AREP](https://github.com/user-attachments/assets/64d8637a-da99-4609-a04b-d5a780f88f8d)

## Instrucciones de Despliegue

### 1. Generación y Construcción de la Imagen Docker

```sh
mvn clean package
```

```sh
docker build -t properties .
```

### 2. Subida a Docker Hub

```sh
docker tag properties usuario_dockerhub/properties
```

```sh
docker login 
```

```sh
docker push usuario_dockerhub/properties
```

### 3. Despliegue en AWS EC2

- Conectar a la instancia EC2:
```sh
ssh -i "mi-clave.pem" ubuntu@mi-ip-publica
```
- Instalar Docker (si no está instalado):
```sh
sudo yum update -y
```
```sh
sudo yum install docker
```
```sh
sudo service docker start
```
```sh
sudo usermod -a -G docker ec2-user
```

- Desconectarse y volverse a conectar a la EC2.
  
- Descargar la imagen desde Docker Hub y ejecutar el contenedor:
```sh
docker run -d -p 8080:8080 --name properties usuario_dockerhub/properties
```
## Video de despliegue

https://www.youtube.com/watch?v=aNLoXSf5eNw


## Capturas de Pantalla

### 1. Creación de una Propiedad
![image](https://github.com/user-attachments/assets/1c4a56fc-1dbe-4571-b704-3fc244e75ef3)
![image](https://github.com/user-attachments/assets/ef75c7e5-c719-4d70-b131-ba8f905cb19f)
![image](https://github.com/user-attachments/assets/2f6e0f8c-0c3c-4bd8-b4dc-1ce50cd59cdb)


### 2. Obtención de todas las Propiedades
![image](https://github.com/user-attachments/assets/59628ee0-9437-4e99-ad74-2c3029d2a497)


### 3. Actualización de una Propiedad
![image](https://github.com/user-attachments/assets/38459610-fb04-4133-aeaf-9b81fc19c6ac)
![image](https://github.com/user-attachments/assets/a07b5575-2f73-40c2-bee0-9c54f32534cf)
![Captura de pantalla 2025-03-06 212741](https://github.com/user-attachments/assets/228061e2-83d8-4928-9a1d-ac2ee406f790)


### 4. Eliminación de una Propiedad
![image](https://github.com/user-attachments/assets/993f7d0e-b198-4bec-8161-c8e7e1157f22)
![image](https://github.com/user-attachments/assets/d2ca5cc3-6a16-4e2c-ac93-95e6f41eed5a)
![image](https://github.com/user-attachments/assets/60543143-0189-4b68-b3ec-4d1203fd5e56)


### 5. Pruebas
![image](https://github.com/user-attachments/assets/c4c37955-62dc-4dc9-95f6-7d0cd6c4eedd)

