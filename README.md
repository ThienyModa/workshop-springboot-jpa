# Workshop Spring Boot + JPA  
  
API REST desenvolvida durante o curso de Java do prof. Nelio Alves.  
  
## Tecnologias  
- Java 17 / Spring Boot  
- Spring Data JPA / Hibernate  
- H2 Database (perfil de teste)  
- Maven  
  
## Funcionalidades  
- CRUD completo de usuários  
- Consulta de pedidos, produtos e categorias  
- Modelagem com chave composta (OrderItem) e associações JPA (@OneToMany, @ManyToMany, @OneToOne)  
- Tratamento de exceções personalizado (ResourceExceptionHandler)  
  
## Como executar  
git clone ...  
./mvnw spring-boot:run  
# H2 console: http://localhost:8080/h2-console  
  
## Endpoints  
| Método | Endpoint | Descrição |  
|--------|----------|-----------|  
| GET | /users | Lista usuários |  
| GET | /users/{id} | Busca por ID |  
| POST | /users | Cria usuário |  
| ...
