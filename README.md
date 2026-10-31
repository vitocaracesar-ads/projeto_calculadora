
## 1. Descrição do projeto


As tecnologias e ferramentas utilizadas no desenvolvimento foram:

- **Java:** linguagem de programação utilizada na implementação da calculadora.
- **JDK 11:** ambiente de desenvolvimento Java.
- **Visual Studio Code:** editor de código utilizado no desenvolvimento.
- **Git:** ferramenta de controle de versão.
- **GitHub:** plataforma para hospedagem e compartilhamento do código-fonte.
- **JavaDoc:** ferramenta utilizada para gerar a documentação HTML do código.

## 4. Explicação das operações

A calculadora realiza quatro operações matemáticas básicas:

| Operador | Operação | Descrição |
|---|---|---|
| `+` | Adição | Soma dois números inteiros. |
| `-` | Subtração | Subtrai o segundo número do primeiro. |
| `*` | Multiplicação | Multiplica dois números inteiros. |
| `/` | Divisão | Divide o primeiro número pelo segundo. |

### Tratamento de erros

O código também possui verificações para situações inválidas:

- **Divisão por zero:** apresenta uma mensagem de erro e retorna 0.
- **Operador inválido:** apresenta uma mensagem informando que a operação é inválida e retorna 0.

O método principal utilizado para realizar os cálculos é `calc(int a, int b, String op)`.

## 5. Estrutura do projeto

```text
projeto_calculadora-Refatoracao/
│
├── src/
│   └── calculadora/
│       └── Calculadora.java
│
├── test/
│   └── calculadora/
│       └── TesteCalculadora.java
│
├── docs/
│   └── Documentação JavaDoc
│
├── images/
│   └── Imagens do projeto
│
├── bin/
│   └── Arquivos compilados
│
└── README.md
```

## 6. Prints da execução dos testes

Nesta seção serão apresentados os registros da execução dos testes da calculadora, demonstrando o funcionamento das operações matemáticas e o tratamento de situações inválidas.

### Execução dos testes

![Print dos resultados após a refatoração do codigo de teste](image1.png)  


## 7. Prints da documentação JavaDoc

A documentação do projeto foi gerada utilizando a ferramenta JavaDoc, responsável por transformar os comentários presentes no código-fonte em páginas HTML.

A documentação permite visualizar informações sobre a classe, seus atributos e métodos.

### Documentação da classe Calculadora

![Print da documentação JavaDoc](images/javadocimg1.png)
![Print da documentação JavaDoc](images/javadocimg2.png)


## 8. Link do repositório

O código-fonte do projeto está disponível no GitHub:

[ Acesse aqui o repositório do projeto ](https://github.com/vitocaracesar-ads/projeto_calculadora.git)

---

**Projeto desenvolvido para fins acadêmicos.**
