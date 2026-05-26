<<<<<<< HEAD
# Loja Virtual - E-commerce
O sistema é um **projeto de estudo** desenvolvido do inicio para montar uma loja virtual de exemplo.

- Desenvolvimento de APIs REST com **Spring Boot**
- Mapeamento objeto-relacional (ORM) com **JPA / Hibernate**
- Boas práticas de camadas de **serviço e repositório**
- Tratamento de **relacionamentos entre entidades** no contexto do Spring
- Construção de um backend robusto que pode ser consumido por aplicações web ou mobile

---

## Tecnologias para Implementação

- Backend: **Java + Spring Boot**
- Banco de Dados: **H2 / MySQL / Flyway**
- Frontend: **Angular**
- Segurança: **Spring Security + JWT**
- Ferramentas de Build: **Maven**
- Containerização: **Docker**

---

## Objetivo
O projeto tem como objetivo fornecer uma plataforma completa de e-commerce contendo:

#### 🔹 cadastro de usuários  
#### 🔹 autenticação e autorização  
#### 🔹 catálogo de produtos 
#### 🔹 categorias e marcas 
#### 🔹 carrinho de compras 
#### 🔹 pedidos 
#### 🔹 contas a pagar/receber 
#### 🔹 controle financeiro 
#### 🔹 painel administrativo 

---

## Estrutura do Projeto  
````
backend/
 ├── src/main/java
 ├── src/main/resources
 │    ├── application.properties
 │    └── db/migration
 └── pom.xml
frontend/
 ├── src/
 ├── angular.json
 └── package.json
````

---

## Segurança

O sistema utiliza:
- Spring Security 
- JWT Authentication 
- BCrypt Password Encoder 
- Controle de acesso por perfil 

---

## Configuração do Backend
### Clonar o projeto
```
git clone https://github.com/seu-usuario/loja-virtual.git
```
### Configurar banco MySQL
Criar o banco
```sql
CREATE DATABASE loja_virtual;
````
### Configurar application.properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/loja_virtual
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
````

## Configuração do Frontend
### Instalar dependências
```
npm install
```
### Executar Angular
```
ng serve
```
Frontend disponível em: ```` http://localhost:4200 ````

---

## Melhorias Futuras

- Integração com gateway de pagamento 
- Dashboard administrativo 
- Relatórios financeiros 
- Integração com serviços de entrega 
- Notificações por e-mail 
- Deploy em nuvem 

---

## Contato
Caso queira trocar ideias ou sugerir melhorias:  
**Paulo Flau**
- 💼 [LinkedIn](https://www.linkedin.com/in/pauloflau/)

---


=======
"# lojavirtual" 
>>>>>>> c0778fe (criado as entidades)
