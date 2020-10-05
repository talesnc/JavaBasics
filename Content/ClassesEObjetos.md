# Classes e Objetos

 - RAM: random access memory (memória serve para armazenar valores);
 
 - Para executar variaveis é alocado um espaço de memória;
 
 - Em java é possível agrupar um conjunto de variaveis em um objeto;
 
 - Atributo é uma variavel, é uma caracteristica;
 
    - Você pode colocar valor, atribuir valor, a um atributo.

## Classe
 - É a especificação de uma entidade viva ou inanimada;
 
 - A classe especifica atributos de uma entidade;
 
 - Cada classe pode ter funções que só fazem sentido para aquela entidade;
 
 - Ao criar uma classe você vai dividindo as coisas em componentes pequenos e vai especificando eles;
 
 - Classe é a especificação, com os atributos a pessoa vai especificando como a entidade é;
 
 - Classe é a especificação, vai dizendo as caracteristicas de um objeto;
 
 - Em analogia a classe é uma planta baixa;
 
 - Existem sem que o programa precise estar executando;
 
 - A partir de uma classe é possível criar varios objetos;
 
 - Em sua especificação pode ter atributos (caracteristicas da entidade representada) e pode ter funções/metodos (são as capacidades/habilidades daquela classe/entidade).

## Objeto
 - É a instanciação/criação de uma entidade;
 
 - É a realização, a concretização de uma classe;
 
 - É criado a partir de uma classe;
 
 - Só existe com o programa em execução;
 
 - O que dispara a criação de um novo objeto no JAVA é a palavra NEW;
 
 - A palavra reservada do JAVA "new" é o que instancia um objeto;
 
 - Só é possível ser criado a partir de um construtor;
 
 - O *new* executa um construtor.

## Construtor
 - Construtor é um metodo responsavel por inicializar o objeto;
 
 - Não tem nome da função, apenas tipo de retorno;
 
 - Toda classe tem um construtor (mesmo que você não tenha especificado um construtor; nesse caso, a JVM injeta um, construtor default (construtor sem argumentos, vazio);
 
 - Construtor é um cara que serve para construir objetos;
 
 - Se não tiver construtor especificado o JAVA injeta um construtor default (sem argumentos) no nosso código;
 
 - Quando existe um construtor na classe, a JVM não injeta o construtor default;
 
 - Toda classe precisa de um construtor;
 
 - O construtor é como se fosse uma função que não tem nome, e que o tipo de retorno dela é tipo da classe;
 
 - Pode colocar um construtor com argumentos (o que está dentro do parenteses);
 
 - Construtores com argumentos podem ter os argumentos com mesmos nomes das variaveis globais, mas para isto precisa usar o this para remover a ambiguidade (this referencia a variável global);

```java
char sexo (variavel global)
this.sexo (variavel global) = sexo (variavel do argumento, local)
```

 - Sobrecarga de construtores: pode haver vários construtores dentro da classe (podemos ter vários construtores com diferentes quantidades e tipos de argumentos);
   - Reuso de construtor com this(...);
   
 - Evitar duplicação de código;
 
 - Podem existir diversos construtores em uma classe, no entanto estes tem de ser de tipos diferentes;

```java
Pessoa (String nome){
  this.nome = nome;
}
Pessoa (String cpf){
  this.cpf = cpf;
}
```

 - O exemplo acima da erro;
 
 - O this() com parenteses indica que está chamando um construtor.

### Como se instancia um objeto:
 - Geralmente se tem uma classe para a entidade e uma outra classe para disparar o programa;
 
 - Cria a função main que é o ponto de partida do JAVA, onde o programa começa a executar;
 
 - toString é uma função que retorna em String os valores do objeto

```java
public String toString() {	
  String output //(é uma variavel) = ""; (começa com uma string vazia e vai concatenando)
  output += ; //adiciona o que você quer que sai na string
  return output;
}
```
