## Do - while

Quando queremos que um código execute pelo menos uma vez, e posteriormente continue executando somente se uma condição for verdadeira, usamos o *do-while*.

O programa abaixo recebe várias notas referentes a um aluno, até que um número negativo seja recebido. 
Em seguida, calcula a média e exibe um resultado.
```java
Scanner scanner = new Scanner(System.in);
int notaAluno = 0;
double media = 0;
int contador = 0;
do{		  
  notaAluno = scanner.nextInt();      //recebe a nota a partir do teclado
  if(notaAluno>=0) {
	  media += notaAluno;
	  contador++;
  }
} while(notaAluno>=0); 				  //pára quando a nota for negativa;
if(contador!=0)
	media /= contador;
System.out.println("Media: "+media);
```

## While

A diferença do *while* para o *do-while* é que o while não executa o primeiro comando sem verificar a condição, enquanto o do-while o faz.

O programa abaixo começa com a variável nota com valor -1, para poder entrar no laço de repetição do *while*.
Em seguida, recebe várias notas referentes a um aluno, até que um número negativo seja recebido, calculando, por fim, a média e exibindo um resultado.
```java
Scanner scanner = new Scanner(System.in);
int notaAluno = 0;
double media = 0;
int contador = 0;
while(notaAluno>=0){                  //pára quando a nota for negativa
  notaAluno = scanner.nextInt();      //recebe a nota a partir do teclado
  if(notaAluno>=0) {
	  media += notaAluno;
	  contador++;
  }
} 

if(contador!=0)
	media /= contador;
System.out.println("Média: "+media);
```

## For

Ao estrutura de repetição *for*, é usada geralmente quando se sabe a quantidade de iterações.

O programa abaixo exibe todos os números pares entre 0 e 100.

```java
System.out.println("Pares entre 0 e 100");
for(int i = 0; i <= 100; i++){
	  if(i%2==0)
	    System.out.print(i+", ");
}
```
