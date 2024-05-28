# SpringBootKafka

Este proyecto es una aplicación de Spring Boot que utiliza Apache Kafka. Está compuesto por dos módulos principales: `SpringBootProducer` y `SpringBootConsumer`.


## Módulos
El proyecto se divide en dos módulos principales:

### SpringBootProducer 
Este módulo es responsable de producir mensajes y enviarlos a un tópico de Kafka. Utiliza la dependencia spring-boot-starter-web para exponer endpoints REST que permiten la interacción con el servicio.

### SpringBootConsumer
Este módulo es un consumidor de Kafka que lee mensajes de un tópico de Kafka. Al igual que el productor, utiliza Spring Boot y la biblioteca de cliente de Kafka para recibir y procesar mensajes.


## Cómo ejecutar el proyecto
Para ejecutar el proyecto, necesitarás tener instalado Maven y Java 17.

Primero, navega al directorio del proyecto y ejecuta el siguiente comando para construir el proyecto:
`./mvnw clean install`
Luego, para ejecutar los módulos individualmente, navega al directorio de cada módulo y ejecuta el siguiente comando:
`./mvnw spring-boot:run`