# 📚 Criaçao de uma aplicaçao gerenciadora de usuários (CRUD) 

## 📝 Sobre o projeto

Nesse repositório você irá encontrar o codigo fonte de uma aplicaçao com interface gráfica desenvolvida 100% em Java e com integraçao com um banco de dados relacional (MySQL)

> [!NOTE]
> Objetivo: Oferecer ao cliente final um melhor manejo de usarios de seu serviço

## 🤔 Mas afinal de contas oque é um CRUD?

CRUD é um acrônimo que representa as quatro operações básicas realizadas em bancos de dados e sistemas de gerenciamento de dados: Create, Read, Update e Delete. Aqui está um breve resumo de cada operação:

- Create (Criar): Adiciona novos registros a um banco de dados ou sistema de gerenciamento de dados. Esta operação insere dados novos e únicos em uma tabela ou coleção.

- Read (Ler): Recupera ou consulta dados existentes de um banco de dados. Esta operação é utilizada para buscar e visualizar registros, permitindo a visualização de dados específicos ou conjuntos de dados.

- Update (Atualizar): Modifica registros existentes no banco de dados. Esta operação é usada para alterar valores de dados já armazenados, atualizando campos específicos de um registro.

- Delete (Excluir): Remove registros do banco de dados. Esta operação exclui dados que não são mais necessários, apagando completamente os registros selecionados.

Ou seja essas operações permitem que os usuários interajam com os dados armazenados em um sistema, podendo criar novos registros, ler informações existentes, atualizar registros existentes e excluir registros que não são mais necessários.

## 🏛️ Arquitetura e Design Patterns utilizados

- `Connection` : Tem como objetivo estabelecer uma conexao com o banco de dados, nesse projeto foi utilizado o driver JDBC
- `DAO` : Ou Data Acess Object é o objeto que abstrai tudo que for referente ao acesso a dados da aplicaçõa. Por exemplo, é onde ficam o acesso JDBC em uma aplicação que use Banco de Dados.
- `DTO` : Ou Data Transfer objects são objetos apenas com atributos e seus métodos acessores (gets e sets)
- `Utils` : É onde está os utilitários do projeto como por exemplo a validação de login e a busca por usuário
- `VIEW` : É onde está o codigo fonte da inteface do projeto juntamente com a ação e funcionalidade de seus componentes
