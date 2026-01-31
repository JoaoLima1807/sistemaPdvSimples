# Simulador de Sistema de Pagamentos -  PDV (Java 25) 💳

Este repositório contém um projeto simples desenvolvido como parte dos estudos de Engenharia de Software, focado em lógica de negócios, validação de dados e conceitos iniciais de Clean Code utilizando as features modernas do **Java Development Kit (JDK) 25**.

## 🚀 Features Implementadas

*   **Fluxo de Pagamento Interativo:** Interface via console para entrada de dados (valor, modo de pagamento e senha).
*   **Lógica Condicional:** Separação do fluxo para Crédito (com parcelamento até 3x) e Débito.
*   **Validação de Segurança:** Autenticação de senha simples com loop de retorno em caso de falha.
*   **Emissão de Via:** Geração de um recibo formatado com data e hora da transação.
*   **APIs Modernas:** Utilização de `java.time` (`LocalDateTime` e `DateTimeFormatter`) para manipulação de datas.

## ⚙️ Tecnologias

*   **Linguagem:** Java (JDK 25+)
*   **Paradigma:** Orientado a Procedimentos (neste script simples)
*   **Ferramentas:** `Scanner` (input), `while` (loop), `if/else` (controle de fluxo).
