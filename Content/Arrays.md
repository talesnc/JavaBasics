# Arrays

Arrays são usadas para guardar multiplos valores de uma variável, ao invés de declarar variáveis separadas pra cada valor. Esses valores podem ser de tipos primitivos ou podem ser classes também.

Após sua criação o comprimento de um array fica fixo, sendo este valor estabelecido na sua criação.

Pra declarar uma array se utiliza colchetes

```java
int [] valor; // um array de inteiros
String [] carros;   //um array de Strings
 ```

Acima o array foi apenas declarado, no entanto o mesmo não foi criado. É possível criar um array sem conteúdo, mas tendo definido o tamanho do array e também é possível criar um array com conteúdo.

 ```java
int[] valor = new int [6]; //foi criado um array com tamanho 6
String[] carros = new String[] {"Prisma", "Civic", "Corolla", "Jetta", "Fiesta", "Gol"}; //neste caso o array foi criado com o conteudo definido
 ```

## Percorrendo Arrays

É possível acessar um elemento de um array utilizando o indice deste elemento.

Uma vez que o array *valor* foi inicializado com valores padrão, em algum momento desejaremos alterar esses valores.
De forma semelhante, possa ser que desejemos alterar o nome de algum aluno no array *carros*.

Isto é feito da seguinte forma:
 
 ``` java
valor[0] = 40000;
valor[1] = 80000;
valor[2] = 85000;
valor[3] = 95000;
valor[4] = 50000;
valor[5] = 26000;
    
carros[3] = "Palio"; //alterou o "Jetta" para "Palio"
 ```

Utilizando o for indexado ou um for-each é possível percorrer o array depois de criado, para fazer alguma verificação ou modificação.

For indexado:
``` java
    //imprimindo carros
for(int i = 0; i < 6; i++) {
	System.out.println("Carro: " + carros[i]);			
}
		
    //imprimindo valores
for(int i = 0; i < 6; i++) {
	System.out.println("Preço: " + valor[i]);			
}
 ```

For-each:
``` java
    //imprimindo carros
for(String carro : carros) {
	System.out.println("Carro: " + carro);
}
		
    //imprimindo valores
for(int preco : valor) {
	System.out.println("Preço: " + preco);
}
```
 
Em alguns casos o for-each não é indicado.
Por exemplo, se assumirmos que o valor no índice i é referente ao carro no índice i, poderíamos querer imprimir o nome do carro e seu preço.
O for-each não permite você fazer isto, mas o for indexado permite.
 
Observe:
``` java
    //for indexado
for(int i = 0; i < 6; i++) {
	System.out.println("Carro: " + carros[i]);			
	System.out.println("Preço: " + valor[i]);
}
```

## Arrays Multi-Dimensionais

Um array multidimensional é um array contendo um ou mais arrays.

Quando um array é identificado dessa forma “numero[indiceA][indiceB]”, a variável numero é o array, o indiceA é a linha e o indiceB é identificado como a coluna, fazendo uma identificação de cada elemento no array por número de linha e coluna.

```java
int[][] m1 = new int [][] {{5, 4}, {0, 2}, {1, -1}};
int[][] m2 = new int [][] {{0, -2}, {5, -3}, {-1, 0}};
```

## Arrays também são Objetos

Arrays também **são objetos**, logo:
 1. Arrays tem variáveis (como é comum em objetos)
	Para descobrir quantos elementos existem em um array é possível usar a variável *length*

 2. Arrays tem métodos (como é comum em objetos)
	Três métodos interessantes são o *clone*, *toString* e *equals*.
 	O clone permite criar uma cópia do array com conteúdo idêntido.
 
 	``` java
 	String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
 	String[] alunosClone = alunos.clone();
 		// for-each
 	for (String aluno : alunosClone) {
    	System.out.println("Aluno clone: " + aluno);
 	}
 	```

 3. Se compararmos dois arrays com *==*, os endereços de memória dos arrays são comparados, e não seu conteúdo
	No exemplo acima temos dois arrays: alunos e alunosClone.
	Cada array aponta para um objeto distinto, porém, ambos os objetos possuem mesmo conteúdo.
	Por esta razão, uma comparação entre alunos e alunosClone com *==* retorna *false*, e uma comparação com *equals* também retorna *false* (visto que acabamos de discutir que o equals é herdado de Object, e em Object a comparação é implementada com *==*).
  
	``` java
	String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
	String[] alunosClone = alunos.clone();
 
	System.out.println(alunos.toString());
	System.out.println(alunos==alunosClone);
	System.out.println(alunos.equals(alunosClone));
	```

## A Classe Arrays e alguns de seus métodos Estáticos
 
No Java, existe uma classe utilitária de nome **Arrays** que nos provê alguns métodos estáticos bastante úteis.
Os principais são: Arrays.equals(Object o1, Object o2), Arrays.sort(variavel) e Arrays.toString(variavel).
 
 - Arrays.equals(Object o1, Object o2): compara os conteúdos dos arrays
 - Arrays.sort(variável): ordena o array
 - Arrays.toString(variável): retorna uma representação textual do array

## Exceções
 
As exceções mais comuns quando usamos arrays são: ArrayIndexOutOfBoundsException e NullPointerException.
  - ArrayIndexOutOfBoundsException: quando você tenta acessar um elemento do array em um índice inexistente (ex: índice negativo, ou índice que extrapola o limite do array)
  - NullPointerException: quando você tenta fazer qualquer operação em um objeto (que neste caso é um array) mas o objeto não foi instanciado

``` java
String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
 
System.out.println(alunos[10]);	//ArrayIndexOutOfBoundsException:
int [] arrayNaoInstanciado = null;
System.out.println(arrayNaoInstanciado[0]);	//NullPointerException
```
