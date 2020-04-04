# quickster
## A movie recommendation engine using Spring Boot and NLP.
A movie recommendation engine and ratings generator using **Spring Boot** and **[StanfordCoreNLP](https://stanfordnlp.github.io/CoreNLP/)** library.

### Core Components of the Application (src/main/java)
- *Pipeline.java* : A pipeline class created to fetch different properties for Natural Language Processing.
- *QuicksterApplication.java* : Main Spring Boot Application class
- *RatingsController.java* : It is the controller class that has the main business logic. It fetches property from the pipeline and renders    it to provide CoreNLP functionalities. It reads the movie reviews, analyses the text and rates the movie accordingly.

### View Templates (src/main/webapp)
- *index.jsp* : Landing page of the Spring Boot Application.
- *result.js* : A template to view the recommendations and ratings.

### Maven Dependency File (pom.xml):
```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.2.5.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.saty</groupId>
	<artifactId>quickster</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>quickster</name>
	<description>Game Application</description>

	<properties>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

			<dependency>
    	<groupId>org.apache.tomcat</groupId>
    	<artifactId>tomcat-jasper</artifactId>
    	<version>9.0.31</version>
	</dependency>
			
			
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
```

This looks awesome :wink: 


