# Strings

**String não é um tipo primitivo**

Strings são classes que podem ser instanciadas. Logo, Strings também carregam funções que podem ser executadas sobre o objeto criado

Como toda classe em Java, começa com letra maiúscula

Quando se cria uma String, na verdade está se instanciando um objeto da classe String

No Java para se criar um novo objeto é necessário o uso da palavra **new**, no entanto para String mesmo omitindo esta palavra, o Java entende que está se chamando um construtor por debaixo dos panos e cria um novo objeto.

```java
String nome = "Tales";
String sobrenome = new String("Noberto");
```

Portanto as duas formas acima funcionam de maneira similares e instanciam um objeto da classe String.

Principais métodos de String: 

```java
//chama um construtor por debaixo dos panos
String nome = "Tales Noberto";

//charAt(int index)
System.out.println("Iniciais: "+nome.charAt(0)+"."+nome.charAt(6));

//contains(String subString)
//tem como retorno um boolean
System.out.println(nome.contains("Tales"));
System.out.println(nome.contains(" "));
System.out.println(nome.contains("x"));

//indexOf(String subString)
//retorna o primeiro indice de uma determinada String
System.out.println(nome.indexOf("Noberto"));
System.out.println(nome.indexOf("Tales"));
System.out.println(nome.indexOf(" "));

//lastIndexOf(String subString)
//retorna o indice da última ocorrência de uma determinada String
System.out.println(nome.lastIndexOf("s"));
System.out.println(nome.lastIndexOf("o"));

//isEmpty
//retorna um boolean
System.out.println(nome.isEmpty());
//String nome2 = null;
//System.out.println(nome2.isEmpty());
//Da um erro de NullPointException
//Tentou rodar uma função mas sem existir o objeto

//replace(String oldString, String newString)
System.out.println(nome.replace("Tales","TALES"));
System.out.println(nome);
System.out.println(nome.replace(" ","."));
System.out.println(nome);

//substring(int beginIndex, int endIndex)
//retorna uma nova String que é uma subString da inicial
System.out.println(nome.substring(0,4));

//toLowerCase
//transformar tudo em minúsculo
System.out.println(nome.toLowerCase());

//toUpperCase
//transformar tudo em maiúsculo
System.out.println(nome.toUpperCase());
```

**Cada operação executada gera um novo objeto.**
  - As alterações feitas na String nome não se acumula;
  - Se quiser que se acumule é necessário reatribuir o resultado da operação à variável.

```java
String nome = "Tales Noberto";

//Substituição da String original por uma
//com todos os caracteres minúsculos
nome = nome.toLowerCase();

System.out.println(nome);
```

Isto ocorre pois a classe String é criada com <public **final** class String>, e este final faz com que o objeto criado seja inalterado.

## Objetos, == e equals

Quando se utiliza == com tipos primitivos, se está comparando o valor das variáveis;

O mesmo ocorre quando se utiliza == com objetos, no entanto **o valor das variáveis nos objetos são endereços de memória;**
  - Logo uma comparação deste tipo só retorna true se as duas variáveis estiverem se referindo ao mesmo objeto

O método *equals* compara o conteúdo dos objetos

```java
//As três Strings possuem o mesmo conteúdo,
//porém são objetos diferentes
String nome1 = "Tales";			//criado na String Pool
String nome2 = "Tales";			//reusou um objeto previamente criado na String Pool
String nome3 = new String("Tales");	//criado fora da String Pool

//== compara o endereço de memória
System.out.println(nome1==nome2);	 //true
System.out.println(nome1==nome3);	 //false

//Equals serve para comparar o conteúdo do objeto
//Com Strings, é provável que 99.99% das vezes deve se usar o equals
System.out.println(nome1.equals(nome2)); //true
System.out.println(nome1.equals(nome3)); //true
```

No Java existe uma coisa chamada "String pool". Se uma String for instanciada **sem a palavra reservada new**, o Java tentará economizar memória, verificando se já existe um objeto com aquele mesmo conteúdo criado. Em caso positivo, ele reaproveita aquele objeto, atribuindo seu endereço de memória à variável. Por outro lado, sempre que uma String for **criada usando explicitamente a palavra reservada new**, então independente de já haver um objeto String com aquele conteúdo criado, a JVM criará um novo objeto.

## Imutabilidade de Strings

Strings são objetos imutáveis em Java
  - toda vez que se altera uma String, na verdade, está se criando um novo objeto String e o anterior ficará ocupando espaço na memória
  - os objetos anteriores ficam numa ilha de objetos e não são usados pois não são referenciados por ninguém

```java
String nome = "Tales";
nome += " Noberto";

System.out.println(nome);
```

## String Builder

Se for preciso economizar espaço na memória, é utilizado o StringBuilder

Objetos de StringBuilder são mutáveis, logo sempre que se altera um StringBuilder, nenhum objeto adicional precisa ser criado e nenhuma memória é "desperdiçada"

```java
StringBuilder nomeCompleto = new StringBuilder("Tales");
nomeCompleto.append(" Noberto");

System.out.println(nomeCompleto);
```

Ainda assim é muito comum usar String nas classes, sendo o StringBuilder recomendado em uma situação em que muitas operações são executadas nas Strings em pouco intervalo de tempo. Isto é feito quando é necessário economizar espaço na memória e tornar o programa mais eficiente.
