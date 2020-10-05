# Encapsulamento

**Encapsulamento** é proteger as informações do objeto
  - proteger quem vai acessar as informações, as quais informações vai ter acesso e vão ser visiveis as outras classes.
  
  Possui três objetivos:
  - 1. **Esconder** aspectos de funcionamento de uma classe que, por alguma razão, não precisa ser acessível por outra classe.
  - 2. Criar uma **abstração** que proveja **baixo acoplamento** entre diferentes classes de um programa.
  - 3. **Proteger** o acesso a informações confidenciais e sensíveis.

O que nos permite implementar encapsulamento nos programas são os **modificadores de acesso**:

| Modificador  | Descrição |
| ------------------- | ------------------- |
| **public** | acesso global, a partir de qualquer outra classe |
| **protected** | acesso permitido à todas as classes do mesmo pacote, e às suas sub-classes (herança) |
| sem modificador explícito (default ou package-private) | acesso permitido à todas as classes do mesmo pacote |
| **private** | acesso restrito aos membros da classe |

Criar funções públicas para acesso (getter) e modificação (setter) não deve ser praticado de forma indiscriminada para todo tipo de variável

Encapsulamento é um conceito fundamental na criação de programas com o paradigma de Orientação a Objetos. Vai além de simplesmente "tornar atributos privados e criar funções públicas setters e getters". Se trata de omitir o que deve ser omitido, tornar público o que precisa ser acessado por outras entidades, e com isto, criar uma abstração que diminua o acoplamento entre as classes.
