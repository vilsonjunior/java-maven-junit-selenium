# Conhecendo o JUnit 5

## Projeto para atualização do JUnit 5

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.java.com/pt-BR/)
- [JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/)
- [Maven](https://maven.apache.org/)

### Dependências utilizadas e configuradas ao pom.xml:

<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/selenium-jupiter -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>selenium-jupiter</artifactId>
      <version>3.3.5</version>
      <scope>test</scope>
    </dependency>

<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-params</artifactId>
      <version>5.7.0</version>
      <scope>test</scope>
    </dependency>

<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.7.0</version>
      <scope>test</scope>
    </dependency> 


### 🎲 Rodando o Back End (servidor)

```bash
# Clone este repositório
$ git clone <https://github.com/vilsonjunior/java-maven-junit-selenium.git>

# Acesse a pasta do projeto no terminal/cmd
$ cd .\com.poc.automacao\

# Execute a aplicação
$ mvn test
```

### 🔗 Referências
- https://bonigarcia.github.io/selenium-jupiter/
