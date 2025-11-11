# 📱 Desafio POO - Modelagem e Diagramação de um Componente iPhone

Este repositório contém a solução para o desafio de Programação Orientada a Objetos (POO) da trilha Java Básico da DIO, que consiste em modelar e implementar o componente iPhone com suas três funcionalidades principais.

---

## ⚙️ Funcionalidades Modeladas (Interfaces)

1. **ReprodutorMusical**
2. **AparelhoTelefonico**
3. **NavegadorInternet**

---

## 📝 UML - Diagrama de Classes e Interfaces (Representação Textual)

A classe `IPhone` implementa as três interfaces, estabelecendo um relacionamento de "é um" para cada funcionalidade.

| Elemento | Tipo | Métodos |
| :--- | :--- | :--- |
| **ReprodutorMusical** | Interface | `tocar()`, `pausar()`, `selecionarMusica(String musica)` |
| **AparelhoTelefonico** | Interface | `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()` |
| **NavegadorInternet** | Interface | `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()` |
| **IPhone** | Classe | **Implementa** todas as interfaces acima. |

---

## 💻 Estrutura do Projeto Java

O código foi implementado no pacote `org.dio.desafio.iphone` e contém:

* **Interfaces:** `ReprodutorMusical.java`, `AparelhoTelefonico.java`, `NavegadorInternet.java`
* **Classe de Implementação:** `IPhone.java`
* **Classe de Teste (Main):** `Usuario.java`
