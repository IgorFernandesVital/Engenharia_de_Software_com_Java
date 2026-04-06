# 📂 Etapa 02: Variáveis e Tipos Primitivos

Nesta fase, explorei os conceitos fundamentais do Java: **tipagem estática e forte** e o **custo de memória das variáveis**. Aprendi a importância da eficiência no uso de recursos, evitando desperdícios de memória.

### Navegação rápida: 

- [Desafios](#️-desafios-executados)
- [Refatorações](#️-refatorações-executadas)
- [Pergunta de entrevistas](#-pergunta-de-entrevista)

## 🛠️ Desafios Executados

### 1. Dados do colaborador (`DadosColaborador.java`)
Neste desafio, desenvolvi um sistema simples de inventário de dados pessoal, onde o foco principal foi a escolha consciente de tipos de dados baseada no consumo de memória e na precisão necessária para cada informação.

* **Conceito Chave: Otimização de Memória e Tipagem Primitiva**. Ao contrário de linguagens de tipagem dinâmica, o uso correto de `byte`, `int` ou `double` no Java reflete diretamente na performance e no escalonamento de uma aplicação backend.

* **O que foi aplicado:**
    - Uso de tipos numéricos adequados (ex: float vs double para salários ou byte para idade) para evitar o overhead.

    - Tratamento de strings e caracteres para dados identificadores.

    - Entrada de dados via console, garantindo a integridade da tipagem durante o input.

### 2. Simulador de Estoque (`SimuladorEstoque.java`)
Este desafio foca na escolha consciente de tipos de dados, equilibrando economia de memória com a precisão necessária para sistemas financeiros.

Conceito Chave: Otimização de Recursos e Tipagem Primitiva.

* **O que foi aplicado:**

    - **Precisão de Ponto Fixo:** Uso de `BigDecimal` para cálculos monetários, evitando erros de arredondamento inerentes aos tipos `float` e `double`.

    - **Eficiência de Memória:** Escolha de tipos primitivos reduzidos (como `short`) para valores com limites conhecidos.

    - **Otimização de Objetos:** Uso do método estático `BigDecimal.valueOf()` em vez do construtor, aproveitando o cache interno da classe para reduzir a alocação de objetos e aliviar a carga do Garbage Collector.

    - **Internacionalização:** Formatação de saída utilizando `NumberFormat` com `Locale` específico (PT-BR).

## ♻️ Refatorações executadas

### 1. Venda do produto (`Refatoracao1_VendaProduto.java`)

Nesta refatoração, apliquei melhorias de legibilidade e precisão:

- **Nomenclatura:** Ajustei os nomes de classes e variáveis para padrões mais semânticos e coesos (PascalCase para classes e camelCase para variáveis).

- **Tipagem Financeira:** Substituí o uso de double por BigDecimal para garantir a precisão exata dos cálculos monetários, evitando erros de arredondamento.

- **Internacionalização (i18n):** Implementei a formatação de saída utilizando Locale e NumberFormat para o padrão brasileiro (R$), garantindo uma exibição profissional dos valores.

## 🎤 Pergunta de Entrevista

**P:** Em Java, qual a diferença entre um tipo primitivo (como `int`) e um objeto (como `String`) em termos de como eles são armazenados e tratados pela linguagem?

**R:** Primitivos como o `int` são valores puros armazenados na **Stack** (uma área de memória muito rápida). Eles ocupam pouco espaço e são simples. Já a `String` é um **Objeto** (uma classe). Ela não guarda o valor diretamente, mas sim uma referência (um endereço) para onde o texto está na memória **Heap**. Além disso, Objetos possuem métodos (funções) que podemos chamar (ex: `nome.toUpperCase()`), enquanto primitivos não fazem nada além de guardar o número.
