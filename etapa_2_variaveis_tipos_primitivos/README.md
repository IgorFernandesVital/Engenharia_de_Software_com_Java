# 📂 Etapa 02: Variáveis e Tipos Primitivos

Nesta fase, explorei os conceitos fundamentais do Java: **tipagem estática e forte** e o **custo de memória das variáveis**. Aprendi a importância da eficiência no uso de recursos, evitando desperdícios de memória.

## 🛠️ Desafios Executados

### 1. Dados do colaborador (`DadosColaborador.java`)
Neste desafio, desenvolvi um sistema simples de inventário de dados pessoal, onde o foco principal foi a escolha consciente de tipos de dados baseada no consumo de memória e na precisão necessária para cada informação.

* **Conceito Chave: Otimização de Memória e Tipagem Primitiva**. Ao contrário de linguagens de tipagem dinâmica, o uso correto de `byte`, `int` ou `double` no Java reflete diretamente na performance e no escalonamento de uma aplicação backend.

* **O que foi aplicado:**
    - Uso de tipos numéricos adequados (ex: float vs double para salários ou byte para idade) para evitar o overhead.

    - Tratamento de strings e caracteres para dados identificadores.

    - Entrada de dados via console, garantindo a integridade da tipagem durante o input.

## ♻️ Refatorações executadas

### 1. Venda do produto (`Refatoracao1_VendaProduto.java`)

Nesta refatoração, apliquei melhorias de legibilidade e precisão:

- **Nomenclatura:** Ajustei os nomes de classes e variáveis para padrões mais semânticos e coesos (PascalCase para classes e camelCase para variáveis).

- **Tipagem Financeira:** Substituí o uso de double por BigDecimal para garantir a precisão exata dos cálculos monetários, evitando erros de arredondamento.

- **Internacionalização (i18n):** Implementei a formatação de saída utilizando Locale e NumberFormat para o padrão brasileiro (R$), garantindo uma exibição profissional dos valores.
