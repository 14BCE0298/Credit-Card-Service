**Credit-Card-Service**

**About**:

This service would act as an REST backend service to mimic the basic functionalities required for Storing, Accessing and Updating details required by User and Supporting services.

**Technologies Used**:
1. Java 8
2. Spring-Boot 2.1.12.RELEASE
3. Swagger 2.9.2
4. YAML config files

**APIs**:
1. /ccs/v1/cardType : Gets details of all or queried type of credit-card 

**Features**:
1. YAML file is being used to provide details of all types of card
2. Swagger is integrated to get details and use all created REST endpoints

**Running Locally**:
1. Clone the project
2. Run Application.java 
3. Hit swagger endpoint http://localhost:8080/swagger-ui.html#/ to ensure service is running