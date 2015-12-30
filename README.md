# Dashery Product Ingestor [![Build Status](https://travis-ci.org/Cowbacca/dashery-product-ingestor.svg)](https://travis-ci.org/Cowbacca/dashery-product-ingestor) [![codecov.io](https://codecov.io/github/Cowbacca/dashery-product-ingestor/coverage.svg?branch=master)](https://codecov.io/github/Cowbacca/dashery-product-ingestor?branch=master)

Ingests product information for Dashery.

## Developer Setup
This project uses Lombok.  To add support for your IDE of choice, see this link: https://projectlombok.org/download.html

## Deployment

Standard Spring Boot deployment.  Requires the following properties to be present in the environment, whether via yml/properties file or environment variable:

```
spring:
  cloud:
    config:
      profile: #e.g. will get values from the dashery-autocomplete-{profile}.properties file from the config server.
      uri: #the uri of the config server, e.g.  http://dashery-config-server.herokuapp.com 
      username: #username to access the config server.
      password: #password to access the config server.
```

