# Desafio De Projeto DIO - BackEnd Em Java
Resolução do desafio de projeto sobre modelagem e diagramação de um componente iPhone, conforme as funcionalidades descritas no enunciado do exercício.
Contém uma representação em diagrama de classes e uma em Java.

## Diagrama UML
```mermaid
classDiagram
        ReprodutorMusical <|.. Iphone
        AparelhoTelefonico <|.. Iphone
        NavegadorInternet <|.. Iphone
        class ReprodutorMusical {
            <<interface>>
            +tocar()
            +pausar()
            +selecionarMusica(String musica)
        }
        class AparelhoTelefonico {
            <<interface>>
            +ligar(String numero)
            +atender()
            +iniciarCorreioVoz()
        }
        class NavegadorInternet {
            <<interface>>
            +exibirPagina(String url)
            +adicionarNovaAba()
            +atualizarPagina()
        }
```
