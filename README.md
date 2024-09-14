# Projeto Desafio: Operações Bancárias

Este projeto foi desenvolvido como parte do curso da Alura, 
com o objetivo de aplicar os conceitos aprendidos sobre 
estrutura de controle de fluxo em Java. O programa simula 
operações bancárias simples, permitindo ao usuário consultar o 
saldo, receber valores e transferir dinheiro entre contas.

## Funcionalidades

O sistema permite realizar as seguintes operações:
- Consultar o saldo atual.
- Receber um valor e adicionar ao saldo.
- Transferir um valor do saldo, verificando se há saldo suficiente.
- Encerrar a aplicação.

## Tecnologias Utilizadas

- Linguagem: **Java**
- Entrada e Saída: **Scanner** para interagir com o usuário.

## Como Executar o Projeto

### Pré-requisitos
- Ter o [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado na sua máquina.
- Um ambiente de desenvolvimento ou IDE como o [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou [Eclipse](https://www.eclipse.org/downloads/).

### Executando Localmente

1. Clone o repositório ou baixe os arquivos.
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
2. Abra o projeto na sua IDE ou compile diretamente no terminal.
   ```bash
   javac Challenge.java
   java Challenge
3. Siga as instruções no terminal para interagir com o menu de operações bancárias.

### Exemplo de Uso
```plaintext
-----Operações-----

1 - Consultar saldos
2 - Receber valor
3 - Transferir valor
4 - Sair

Escolha uma opção: 1
O saldo atual é R$ 2500.0

Escolha uma opção: 2
Informe o valor a receber: 500
Saldo atualizado R$ 3000.0
```
### Melhorias Futuras
Algumas melhorias que poderiam ser feitas no projeto:
* Implementar validações mais robustas para entradas inválidas.
* Adicionar suporte para múltiplos tipos de contas.
* Implementar operações de saque com limites.
### Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request se desejar colaborar com o projeto.
### Autor
Projeto desenvolvido por **Christopher Barros** durante o curso da [Alura](https://www.alura.com.br/).