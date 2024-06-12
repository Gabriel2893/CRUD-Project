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

