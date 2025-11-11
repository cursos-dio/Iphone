# Iphone

# 📱 Desafio POO - Modelagem e Diagramação de um Componente iPhone

Este repositório contém a solução para o desafio de Programação Orientada a Objetos (POO) da trilha Java Básico da DIO, que consiste em modelar e implementar o componente iPhone com suas três funcionalidades principais.

## ⚙️ Funcionalidades Modeladas (Interfaces)

1.  **ReprodutorMusical**
2.  **AparelhoTelefonico**
3.  **NavegadorInternet**

##  UML - Diagrama de Classes e Interfaces

O diagrama abaixo representa a classe `IPhone` implementando as três interfaces, seguindo o princípio da segregação de interfaces.

```mermaid
classDiagram
    direction RL

    class IPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    interface ReprodutorMusical {
        <<Interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        <<Interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        <<Interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet
    ```
