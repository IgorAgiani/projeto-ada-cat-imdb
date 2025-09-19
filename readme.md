# Projeto POO - Ada Tech - Catálogo de Filmes IMDB

Este projeto é um sistema em Java para gerenciamento de um catálogo de filmes, similar ao popular IMDB. Desenvolvido como parte de um trabalho em grupo, a aplicação permite o cadastro e a pesquisa de filmes, diretores e atores, aplicando conceitos fundamentais de Programação Orientada a Objetos (POO).

## 🚀 Funcionalidades

O sistema oferece as seguintes funcionalidades por meio de um menu interativo:

### Gerenciamento de Pessoas (Diretores e Atores)
-   **Cadastrar** novos diretores, incluindo nome, biografia e avaliação.
-   **Cadastrar** novos atores, incluindo nome, biografia e prêmios.
-   **Pesquisar** diretores e atores por nome.
-   **Excluir** diretores e atores.
-   **Listar** todos os diretores e atores cadastrados.

### Gerenciamento de Filmes
-   **Cadastrar** novos filmes, com atributos como nome, data de lançamento, orçamento, descrição e a associação com um diretor e uma lista de atores já cadastrados.
-   **Pesquisar** filmes por nome (a pesquisa não diferencia letras maiúsculas e minúsculas).
-   **Excluir** filmes.
-   **Listar** todos os filmes do catálogo.

## 🏛️ Estrutura do Projeto

O projeto foi estruturado utilizando os princípios da Programação Orientada a Objetos, conforme solicitado no enunciado, com as seguintes classes principais:

-   `Pessoa` (classe abstrata): Representa uma entidade genérica com atributos em comum, como nome e miniBiografia. Esta classe serve de base para as classes `Diretor` e `Ator`.
-   `Diretor` e `Ator`: Classes que herdam de `Pessoa`, adicionando atributos específicos (`avaliacao` para Diretor e `premio` para Ator). O uso de herança demonstra a relação "é um" (Diretor é uma Pessoa).
-   `Filme`: Representa um filme com seus atributos. A classe encapsula a lógica de associação, contendo referências a um `Diretor` e uma `List<Ator>`, implementando o conceito de composição (Filme "tem um" Diretor e uma lista de Atores).
-   `Catalogo`: Uma classe de serviço que gerencia as listas de `Filme`, `Diretor` e `Ator`. Ela contém os métodos para adicionar, remover, listar e buscar as entidades, centralizando a lógica de negócio do sistema.
-   `Menu`: Responsável pela interação com o usuário, exibindo as opções e recebendo as entradas.
-   `Main`: A classe principal que inicia a aplicação, criando uma instância do `Catalogo` e do `Menu` para dar acesso ao sistema.

O menu interativo será exibido no console, permitindo que você utilize todas as funcionalidades do sistema.

## 🛠️ Tecnologias Utilizadas
* *Linguagem:* Java
* *JDK:* 21
* *IDE:* IntelliJ IDEA

## 🚀 Como Executar o Projeto
1.  Clone o repositório: git clone https://github.com/IgorAgiani/projeto-ada-cat-imdb.git
2.  Navegue até o diretório do projeto.
3.  Compile os arquivos Java: javac *.java (ou compile pela sua IDE).
4.  Execute a classe principal que contém o método main.

## 🤝 Contribuições

Este projeto foi um esforço colaborativo, com cada membro do grupo contribuindo para o desenvolvimento das diferentes classes e funcionalidades. As contribuições individuais podem ser visualizadas através do histórico de commits do repositório.
