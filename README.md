# java-maven-junit-selenium
Projeto/estudo para atualização do JUnit 5

Utilizando Java, JUnit 5, Selenium WebDriver e Maven

Dependências utilizadas e configuradas ao pom.xml:

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


Usando o terminal para executar o teste:

* Ao abrir o terminal, se tiver na mesma estrutura do projeto devemos avançar mais uma pasta e então executar o teste, neste caso:
  Pré comando:
  - cd .\com.poc.automacao\

  Executando de fato o teste:
  mvn test


