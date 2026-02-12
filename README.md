# 🏦 Banco Digital em Java

Simulação de um Banco Digital desenvolvida em **Java**, aplicando os principais conceitos de **Programação Orientada a Objetos (POO)** e geração de **Extrato em PDF** com OpenPDF.

---

## 📌 Sobre o Projeto

Este projeto foi criado com o objetivo de consolidar fundamentos sólidos de back-end em Java, aplicando conceitos utilizados em sistemas reais do mercado financeiro.

A aplicação permite simular operações bancárias via console e gerar um extrato completo em PDF.

---

## 🚀 Funcionalidades

- ✔ Criação de Conta Corrente
- ✔ Criação de Conta Poupança
- ✔ Depósito
- ✔ Saque com taxa (Conta Corrente)
- ✔ Aplicação de rendimento (Conta Poupança)
- ✔ Histórico de movimentações
- ✔ Geração de Extrato em PDF

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos
- Encapsulamento
- Herança
- Polimorfismo
- Classes Abstratas
- Separação por camadas (model / service)
- Maven
- Geração de documentos PDF

---

## 🛠 Tecnologias Utilizadas

- Java 17
- Maven
- OpenPDF

---

## 📂 Estrutura do Projeto

banco-digital
│
├── pom.xml
│
└── src/main/java/com/joaovictor
├── Main.java
├── model
│ ├── Cliente.java
│ ├── Conta.java
│ ├── ContaCorrente.java
│ ├── ContaPoupanca.java
│ └── Banco.java
│
└── service
└── ExtratoPdfService.java


---


O sistema gera automaticamente um arquivo PDF com:

- Nome do cliente
- Número da conta
- Data
- Saldo atual
- Histórico completo de movimentações

O arquivo é salvo na raiz do projeto:

extrato_conta_1.pdf


---

## 🎯 Objetivo

Evoluir constantemente em desenvolvimento back-end Java, aplicando boas práticas e aproximando projetos acadêmicos de cenários reais do mercado.
## 📂 Estrutura do Projeto

