
# Photoz 

A spring boot crash course follow along -
[link](https://www.youtube.com/watch?v=QuvS_VLbGko)

- Maven
- Java 17
- JDBC
- H2 DataBase





## Functionalities

- Upload any file as binary and store it in database
- Retrieve list of all files
- Show file (in browser)
- Download file by ```ContentDisposition.builder("attachment")```


## Execute

To run this project

```bash
  ./mvnw clean package
```
```bash
  java -jar ./target/photoz-clone-*.jar
```

