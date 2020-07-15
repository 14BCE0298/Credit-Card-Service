**Credit-Card-Service**

**About**:

This service would act as an REST backend service to mimic the basic functionalities required for Storing, Accessing and Updating details required by User and Supporting services.

**Technologies Used**:
1. Java 8
2. Maven
3. Spring-Boot 2.1.12.RELEASE
4. Swagger 2.9.2
5. YAML config files
6. Docker
7. MongoRepository

**APIs**:
1. GET /ccs/v1/card-type/details: Gets details of all or queried type of credit-card 
2. POST /ccs/v1/customer/new : Creates a new Customer entity and stores it in a Mongo collection, and the created mongo DB _id is returned back.
3. GET /ccs/v1/customer/customer-details : Get Customer details from DB based on provided custId, which is generated when saving user data to MongoDb 

**Features**:
1. YAML file is being used to provide details of all types of card
2. Swagger is integrated to get details and use all created REST endpoints
3. Running Mongo DB inside a docker container
4. Using custom exceptions and mapping them using @ControllerAdvice and ResponseEntityExceptionHandler at application level

**Running Locally**:
1. Clone the project
2. Run docker container to get Mongo DB up: docker run -d -p 27017-27019:27017-27019 --name mongodb mongo
3. Run Application.java 
4. Hit swagger endpoint http://localhost:8080/swagger-ui.html#/ to ensure service is running