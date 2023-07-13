# PCCWAssessment


### Assessment Service
#### Contains Crud functionalities including soft delete.

* go to assessment root
* docker build -t [markstevennonato/assessment] 
* docker run -d -p 8080:8080 --name assessment markstevennonato/assessment:latest

### Email Service
#### Contains SMTP configuration and a service for sending email notification

* go to email service root
* docker build -t [markstevennonato/emailservice]
* docker run -d -p 8081:8081 --name emailservice markstevennonato/emailservice:latest