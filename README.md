# shoppingBackend
Full working backend microservices for a shopping cart - currently in development.


# Technologies used 🛠️
```
- [Java : Spring/SpringBoot]
- [Microservices]
- [MongoDB] 
- [MySQL]
- [Apache Kafka]
```
# Architecture diagram
![Design](https://user-images.githubusercontent.com/17013083/235351571-f5911602-d336-45df-81d4-cc802a5d80e9.png)

# Clone and Use 📋

- The website is completely built on `Spring Boot` framework of `Java` and that's why we need `Spring/SpringBoot` setup.
- In case you want to help developing it or simply saving it, you can fork the repository just by clicking the button on the top-right corner of this page
- Clone the repository into your local system using below command:
  ```bash
   git clone https://github.com/abhranil08/shoppingBackend.git
  ```
  This will clone the whole repository in your system.
  
- Now the project is ready to use
- You can start by running the individual services.
- Change PORT number in application.properties file to use your own. Ex : local URL - http://localhost:3000/ , when PORT number : 3000

# Services
```
- product-service : create and view products
- order-service : order products
- inventory-service : for product management
- discovery-service : maintaining server registry
- notification-service : order placed notifications
- api-gateway
```

# Features
```
1. Inter-service communication.
2. Service Discovery using Netflix Eureka.
3. Api gateway.
4. Circuit breaker when inventory service is down.
```
