# 📚 Criaçao de uma aplicaçao gerenciadora de usuários (CRUD) 

## 📝 Sobre o projeto

Nesse repositório você irá encontrar o codigo fonte de uma aplicaçao com interface gráfica desenvolvida 100% em Java e com integraçao com um banco de dados relacional (MySQL) além tambem de utilizar o Swing para criação das interfaces gráficas

> [!NOTE]
> Objetivo: Oferecer ao cliente final um melhor manejo de usarios de seu serviço

## 🤔 Mas afinal de contas oque é um CRUD?

CRUD é um acrônimo que representa as quatro operações básicas realizadas em bancos de dados e sistemas de gerenciamento de dados: Create, Read, Update e Delete. Aqui está um breve resumo de cada operação:

- Create (Criar): Adiciona novos registros a um banco de dados ou sistema de gerenciamento de dados. Esta operação insere dados novos e únicos em uma tabela ou coleção.

- Read (Ler): Recupera ou consulta dados existentes de um banco de dados. Esta operação é utilizada para buscar e visualizar registros, permitindo a visualização de dados específicos ou conjuntos de dados.

- Update (Atualizar): Modifica registros existentes no banco de dados. Esta operação é usada para alterar valores de dados já armazenados, atualizando campos específicos de um registro.

- Delete (Excluir): Remove registros do banco de dados. Esta operação exclui dados que não são mais necessários, apagando completamente os registros selecionados.

Ou seja essas operações permitem que os usuários interajam com os dados armazenados em um sistema, podendo criar novos registros, ler informações existentes, atualizar registros existentes e excluir registros que não são mais necessários.

##  Arquitetura e Design Patterns utilizados

- `Connection` : Tem como objetivo estabelecer uma conexao com o banco de dados, nesse projeto foi utilizado o driver JDBC
- `DAO` : Ou Data Acess Object é o objeto que abstrai tudo que for referente ao acesso a dados da aplicaçõa. Por exemplo, é onde ficam o acesso JDBC em uma aplicação que use Banco de Dados.
- `DTO` : Ou Data Transfer objects são objetos apenas com atributos e seus métodos acessores (gets e sets)
- `Utils` : É onde está os utilitários do projeto como por exemplo a validação de login e a busca por usuário
- `VIEW` : É onde está o codigo fonte da inteface do projeto juntamente com a ação e funcionalidade de seus componentes

##  <img align="center" alt="Gb-Sql" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/azuresqldatabase/azuresqldatabase-original.svg"> SQL Banco de dados relacional

Neste Projeto foi escolhido o MySQL como banco de dados nao relacional por conta de sua integraçao com o servidor LocalHost utilizado: o "*WampServer*" e facilidade de manuseio utilizando o "*phpMyadmin*".
A aplicação conta com uma tabela de 3 colunas, sendo:

- `user_id` : Armazeno o ID **único** de cada usuário, sendo assim uma PRIMARY KEY, além também de se autoincrementar a cada criaçao de um novo usuário
- `user_name` : Armazena o nome do usuário
- `user_password` : Armazena a senha do usuário

### A seguinte Query a seguir foi utilizada para a criaçao da tabela

```sql
CREATE TABLE user (
     user_id INT AUTO_INCREMENT PRIMARY KEY,
     user_name VARCHAR(45),
     user_password  VARCHAR(45)
);
```

### ❗ Vale ressaltar as seguintes funções e querys SQL utilizadas:

- Registrar um usuário: `INSERT INTO user (user_name, user_password) values (?, ?)`
- Validaçao de Login:  `SELECT * FROM USER WHERE user_name = ? AND user_password = ?`
- Atualizar um usuário já existente: `UPDATE user SET user_name = ? ,user_password = ? WHERE user_id = ?`
- Excluir um usuário já existente: `DELETE FROM user WHERE user_id = ?`
- Uma caixa de busca, para encontrar um usuário mais facilmente: `"SELECT * FROM user WHERE user_name LIKE ?"`
- Um botão de "Back" para voltar a visualizaçao completa da tabela
- Um botao de "Clear fields" caso algo tenha sido digitado incorretamente otimizando assim a produtividade ao invés de pressionar a tecla backspace do teclado

### 🖼️ Segue abaixo imagens da aplicação funcionando
##### Link para o video da aplicaçao funcionando: https://www.linkedin.com/feed/update/urn:li:activity:7206447205447065600/

![Imagem do WhatsApp de 2024-06-11 à(s) 20 14 01_ca4bf976](https://github.com/Gabriel2893/CRUD-Project/assets/146888502/1d9c0f99-13e6-46e6-8877-946aa1681edd)

![Imagem do WhatsApp de 2024-06-11 à(s) 20 14 26_d56033ca](https://github.com/Gabriel2893/CRUD-Project/assets/146888502/c2ffc35b-2684-4949-8f53-dd91d0b204c1)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 📚 Creation of a user management application (CRUD) 

## 📝 About the project

In this repository you will find the source code for an application with a graphical interface developed 100% in Java and with integration with a relational database (MySQL) as well as using Swing to create the graphical interfaces.

> NOTE
> Objective: To offer the end customer better user management of their service

## 🤔 But what is a CRUD anyway?

CRUD is an acronym that stands for the four basic operations performed in databases and data management systems: Create, Read, Update and Delete. Here's a brief summary of each operation:

- Create: Adds new records to a database or data management system. This operation inserts new and unique data into a table or collection.

- Read: Retrieves or queries existing data from a database. This operation is used to search for and view records, allowing specific data or data sets to be viewed.

- Update: Modifies existing records in the database. This operation is used to change already stored data values by updating specific fields in a record.

- Delete: Removes records from the database. This operation deletes data that is no longer needed, completely erasing the selected records.

In other words, these operations allow users to interact with the data stored in a system, being able to create new records, read existing information, update existing records and delete records that are no longer needed.

## Architecture and Design Patterns used

- `Connection` : Aimed at establishing a connection with the database, in this project the JDBC driver was used
- `DAO` : Or Data Access Object is the object that abstracts everything related to the application's data access. For example, it is where JDBC access is located in an application that uses a database.
- `DTO` : Data Transfer objects are objects with only attributes and their accessor methods (gets and sets).
- `Utils` : This is where the project's utilities are located, such as login validation and user search.
- `VIEW` : This is the source code for the project's interface, along with the actions and functionality of its components.

##  <img align="center" alt="Gb-Sql" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/azuresqldatabase/azuresqldatabase-original.svg"> SQL Relational Database

In this project, MySQL was chosen as the non-relational database because of its integration with the LocalHost server used: "*WampServer*" and ease of handling using "*phpMyadmin*".
The application has a 3-column table:

- `user_id` : Stores the **unique** ID of each user, thus being a PRIMARY KEY, as well as being auto-incremented each time a new user is created.
- `user_name` : Stores the user's name
- `user_password` : Stores the user's password

### The following Query was used to create the table

```sql
CREATE TABLE user (
     user_id INT AUTO_INCREMENT PRIMARY KEY,
     user_name VARCHAR(45),
     user_password  VARCHAR(45)
);
```
### ❗ It is worth highlighting the following SQL functions and queries used:

- Registering a user: `INSERT INTO user (user_name, user_password) values (?, ?)`
- Login validation: `SELECT * FROM USER WHERE user_name = ? AND user_password = ?`
- Update an existing user: `UPDATE user SET user_name = ? ,user_password = ? WHERE user_id = ?`
- Delete an existing user: `DELETE FROM user WHERE user_id = ?`
- A search box, to find a user more easily: `"SELECT * FROM user WHERE user_name LIKE ?"`
- A "Back" button to return to the full table view
- A "Clear fields" button if something has been typed incorrectly, thus optimizing productivity instead of pressing the backspace key on the keyboard.

### 🖼️ Below are images of the application working
##### Link to the video of the application working:https://www.linkedin.com/feed/update/urn:li:activity:7206447205447065600/

![Imagem do WhatsApp de 2024-06-11 à(s) 20 14 01_ca4bf976](https://github.com/Gabriel2893/CRUD-Project/assets/146888502/1d9c0f99-13e6-46e6-8877-946aa1681edd)

![Imagem do WhatsApp de 2024-06-11 à(s) 20 14 26_d56033ca](https://github.com/Gabriel2893/CRUD-Project/assets/146888502/c2ffc35b-2684-4949-8f53-dd91d0b204c1)





