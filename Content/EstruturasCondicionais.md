# Estruturas Condicionais

## If - else if - else

Usamos **if - else if - else** quando precisamos fazer várias comparações. 
No exemplo abaixo, queremos saber se pela idade digitada no teclado o indivíduo é bebê, criança, pré-adolescente, adolescente, adulto, ou idoso.

Obs: se o comando que fica depois de condição tiver apenas uma linha as chaves '{', '}', não são necessárias. Se o comando contiver múltiplas linhas, as chaves são obrigatórias.

```java
Scanner scanner = new Scanner(System.in);
int idade = scanner.nextInt();      //recebe a idade a partir do teclado

if(idade < 2)
  System.out.println("Indivíduo é um bebê");
else if(idade < 12)
  System.out.println("Indivíduo é uma criança");
else if(idade < 13)
  System.out.println("Indivíduo é um pré-adolescente");
else if(idade < 18)
  System.out.println("Indivíduo é um adolescente");
else if(idade < 60)
  System.out.println("Indivíduo é um adulto");
else
  System.out.println("Indivíduo é um idoso");
```

## Switch - case

O switch case é um pouco mais restrito do que comandos if else. 
Ele serve apenas para comparar (==) valorer primitivos inteiros ou String (não pode ser usado com double ou float).
Também não pode ser usado para comparações mais elaboradas, envolvendo por exemplo >=, <=, e combinações de comparações mais complexas usando operadores lógicos (&&, ||).
No entanto, é notório que os programadores os utilizam com mais frequência para comparar uma variável que pode assumir níveis/categorias com valores bem definidos.
Note que a palavra chave ''default'' funciona de forma parecida a um ''else''.
Observem o exemplo a seguir:

```java

Scanner scanner = new Scanner(System.in);

int dia = scanner.nextInt();      //recebe dia a partir do teclado
switch (dia) {
  case 1:
    System.out.println("Segunda-feira");
    break;
  case 2:
    System.out.println("Terca-feira");
    break;
  case 3:
    System.out.println("Quarta-feira");
    break;
  case 4:
    System.out.println("Quinta-feira");
    break;
  case 5:
    System.out.println("Sexta-feira");
    break;
  case 6:
    System.out.println("Sabado");
    break;
  case 7:
    System.out.println("Domingo");
    break;
  default:
    System.out.println("O valor de dia não está entre 1 e 7.");
}
```
