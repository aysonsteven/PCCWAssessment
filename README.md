# PCCWAssessment

##### for this I have 2 service [Assessment Service, Email Service] to show microservice like architecture.

### Assessment Service
#### Contains Crud functionalities including soft delete.

#### for the data base i decided to use H2 in memory database for simplicity.

* go to assessment root
* docker build -t [markstevennonato/assessment] 
* docker run -d -p 8080:8080 --name assessment markstevennonato/assessment:latest

### Email Service
#### Contains SMTP configuration and a service for sending email notification

* go to email service root
* docker build -t [markstevennonato/emailservice]
* docker run -d -p 8081:8081 --name emailservice markstevennonato/emailservice:latest