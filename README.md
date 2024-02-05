# JavaProjectRestaurant


<h2>JavaProjectRestaurant</h2>

<h4>Overview</h4>
<p>
This application serves as a Restaurant Management System, allowing users to manage information about menu items, their details, and orders.
</p>

<h4>Entities</h4>
<ul>
  <li>
    Customer.
    <ul>
      <li>Id, Name, Email </li>
    </ul>
  </li>
  <li>
    Customer Order 
    <ul>
      <li>Id, customer, items</li>
    </ul>
  </li>

<li>
   Customer Table 
    <ul>
      <li>Date</li>
    </ul>
  </li>
<li>
   Menu Item 
    <ul>
      <li>id, name, price</li>
    </ul>
  </li>
<li>
  Review - Managed by GeneratedValue
    <ul>
      <li>id, customer, review</li>
    </ul>
  </li>
</ul>

<h4>Functionality</h4>
<ul>
  <li>CRUD operations </li>
  <li>Search Customer by Name, Created Date, Expiry Date,Category,Manufacturer</li>

</ul>

<hr>

### Setup

<h4>Requirements</h4>
<h4>Install these software first:</h4>
<ul>
<li>InteliJ IDEA.</li>
<li>Java SE Development Kit.</li>
<li>Insomnia (For testing apis)</li>
<li>XAMPP (Apache server - that contains MariaDB, PHP)</li>
</ul>

<hr>
<h3>Programming Languages used</h3>

![Java](https://img.shields.io/badge/Language-Java-red)
![SQL](https://img.shields.io/badge/Language-SQL-red)

<hr>

### Installations

Once you clone this project from GitHub or download it in zip, then you need to unzip and open it, in your editor IntelliJ IDEA (make sure
you click on TrustProject also after that let IntelliJ IDEA to install dependencies that we need
to open and run.
<hr>

### Technologies and APIs

![Insomnia](https://img.shields.io/badge/Insomnia-2b0d63?style=for-the-badge&logo=insomnia&logoColor=white)   <p>Insomnia is an API platform for building and using APIs. Insomnia simplifies each step of the API lifecycle and streamlines collaboration so you can create better APIs—faster.</p>  <br>  
![XAMPP](https://img.shields.io/badge/Xampp-F37623?style=for-the-badge&logo=xampp&logoColor=white)  <p>XAMPP is an abbreviation for cross-platform, and it allows you to build projects with API's offline, on a local web server on your computer. </p>

<hr>

## Starting the aplication

1.First thing you have to do for running the project is to turn on APACHE SERVER AND MYSQL on XAMPP, then they will take ports that they need.

2.javaproject.sql => this is the file of database, this one you need to import on your database. ('localhost/phpmyadmin').

3.Also you need to check 'application.properties', for example ...
java
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/javapharmadb
spring.datasource.username=root

#Add password as environment variable
#SPRING_DATASOURCE_PASSWORD=<your-password>
#or
#spring.datasource.password=Mysql@123

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true



### Dependencies

``` java
plugins {
	id 'java'
	id 'org.springframework.boot' version '3.2.2'
	id 'io.spring.dependency-management' version '1.1.4'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'

java {
	sourceCompatibility = '17'
}

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	runtimeOnly 'com.mysql:mysql-connector-j'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.named('test') {
	useJUnitPlatform()
}
``` 
