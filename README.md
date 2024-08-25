# Projeto: Sistema de Gestão de Biblioteca

## 1. Classes e Interfaces

### 1.1. `Livro`
Uma classe para representar os livros na biblioteca, com os seguintes atributos:
- `título`: String - O título do livro.
- `autor`: String - O autor do livro.
- `numeroDePaginas`: int - O número de páginas do livro.
- `statusDisponibilidade`: boolean - Indica se o livro está disponível ou emprestado.

### 1.2. `Usuário`
Uma classe para representar os usuários da biblioteca (clientes), com os seguintes atributos:
- `nome`: String - O nome do usuário.
- `CPF`: String - O CPF do usuário.
- `livrosEmprestados`: ArrayList<Livro> - Uma lista de livros atualmente emprestados pelo usuário.

### 1.3. `Empréstimo`
Uma classe para representar o empréstimo de um livro por um usuário, com os seguintes atributos:
- `dataEmprestimo`: LocalDate - A data em que o livro foi emprestado.
- `dataDevolucaoPrevista`: LocalDate - A data prevista para a devolução do livro.
- `statusDevolucao`: boolean - Indica se o livro já foi devolvido.

### 1.4. `Interface Multavel`
Uma interface que define métodos para cálculo de multa por atraso na devolução de livros. Métodos possíveis:
- `calcularMulta(LocalDate dataDevolucaoPrevista, LocalDate dataDevolucaoReal)`: Calcula a multa com base na diferença entre as datas de devolução prevista e real.

## 2. Funcionalidades do Sistema

### 2.1. Gerenciamento de Livros
- Adicionar novos livros ao acervo.
- Remover livros do acervo.
- Atualizar o status de disponibilidade dos livros (emprestado ou disponível).

### 2.2. Cadastro de Usuários
- Registrar novos usuários.
- Atualizar informações dos usuários.
- Listar os livros atualmente emprestados por cada usuário.

### 2.3. Empréstimo e Devolução de Livros
- Registrar o empréstimo de livros por usuários.
- Verificar a disponibilidade de livros.
- Calcular a data de devolução prevista.
- Registrar a devolução de livros.

### 2.4. Cálculo de Multa
- Implementar o método `calcularMulta()` na interface `Multavel` e nas classes necessárias (por exemplo, na classe `Livro`) para calcular a multa de acordo com regras específicas (por exemplo, valor fixo por dia de atraso).

## 3. Implementação e Teste

- Implemente as classes e interfaces conforme descrito acima.
- Crie um programa principal (classe `Main`) para testar as funcionalidades do sistema, como cadastro de livros e usuários, empréstimos, devoluções, e cálculo de multa.
- Certifique-se de que o sistema lida corretamente com casos de empréstimos simultâneos, devoluções antecipadas, e cálculo preciso de multa por atraso.

## 4. Considerações Adicionais

- Utilize conceitos de encapsulamento, herança, polimorfismo e interface para garantir um design eficiente e modular.
- Implemente tratamento de exceções para lidar com situações como livros não encontrados, usuários não cadastrados, etc.
- Utilize coleções como `ArrayList` para armazenar e gerenciar os livros emprestados por cada usuário.
