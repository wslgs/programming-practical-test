# Programming Practical Test

Olá, meu nome é Weslley Gomes Dantas. Este projeto foi desenvolvido para a empresa Prothera, como parte de um teste prático de programação em Java. O objetivo é gerenciar uma lista de funcionários, realizando diversas operações conforme especificado.

## Estrutura do Projeto

O projeto está dividido em três classes principais:

1. **Pessoa**: Representa uma pessoa com nome e data de nascimento.
2. **Funcionario**: Extende a classe Pessoa e adiciona os atributos de salário e função.
3. **Principal**: Contém o método `main` e executa as operações solicitadas no teste prático.

## Classes

### Pessoa

A classe `Pessoa` possui os seguintes atributos:
- `nome` (String): Nome da pessoa.
- `dataNascimento` (LocalDate): Data de nascimento da pessoa.

### Funcionario

A classe `Funcionario` extende `Pessoa` e adiciona os seguintes atributos:
- `salario` (BigDecimal): Salário do funcionário.
- `funcao` (String): Função do funcionário.

O método `toString` formata a data de nascimento para `dd/MM/yyyy` e o salário com separador de milhar como ponto e decimal como vírgula.

### Principal

A classe `Principal` executa as seguintes ações:

1. **Inserir todos os funcionários na lista**:
    - Os funcionários são adicionados na ordem e com as informações fornecidas na tabela.

2. **Remover o funcionário "João" da lista**:
    - Utilizei `removeIf` para remover o funcionário com o nome "João".

3. **Imprimir todos os funcionários com todas suas informações**:
    - Utilizei `forEach` para imprimir todos os funcionários.

4. **Aplicar um aumento de 10% no salário dos funcionários**:
    - Utilizei `forEach` para atualizar o salário de cada funcionário.

5. **Agrupar os funcionários por função em um MAP**:
    - Utilizei `Collectors.groupingBy` para agrupar os funcionários por função.

6. **Imprimir os funcionários, agrupados por função**:
    - Utilizei `forEach` para imprimir os grupos de funcionários.

7. **Imprimir os funcionários que fazem aniversário nos meses 10 e 12**:
    - Utilizei `filter` para selecionar os funcionários com aniversário nos meses 10 e 12 e `forEach` para imprimir.

8. **Imprimir o funcionário com a maior idade**:
    - Utilizei `min` para encontrar o funcionário com a maior idade e imprimir seus detalhes.

9. **Imprimir a lista de funcionários por ordem alfabética**:
    - Utilizei `sorted` para ordenar os funcionários por nome e `forEach` para imprimir.

10. **Imprimir o total dos salários dos funcionários**:
    - Utilizei `map` e `reduce` para calcular o total dos salários e imprimir o resultado.

11. **Imprimir quantos salários mínimos cada funcionário ganha**:
    - Dividi o salário de cada funcionário pelo valor do salário mínimo e imprimi o resultado.

## Como Executar

1. Clone o repositório para sua máquina local.
2. Importe o projeto no IntelliJ IDEA (ou sua IDE de preferência).
3. Certifique-se de que o JDK está configurado corretamente.
    - Versão do JDK: openjdk-22.0.1
4. Execute a classe `Principal` para ver os resultados no console.
    - Versão do IntelliJ IDEA: 2023.3.4

## Exemplo de Uso

Ao executar a classe `Principal`, o programa realizará todas as operações descritas acima e imprimirá os resultados no console.

## Dependências

- Java 11 ou superior

## Contato

- LinkedIn: https://www.linkedin.com/in/wslgs/
- GitHub: https://github.com/wslgs