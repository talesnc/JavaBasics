# Listas

Listas têm a mesma finalidade de arrays: armazenar elementos de um mesmo tipo.
No entanto, um aspecto interessante é que listas podem mudar de tamanho.
Elas podem crescer seus tamanhos de acordo com nossa conveniência.
Enquanto arrays jamais podem crescer ou diminuir em sua capacidade, as listas fazem isso de forma transparente.
Uma característica comum é que listas e arrays só armazenam um tipo de objeto por vez.

## Principais Métodos

Os principais métodos são:
- add(Object o): permite adicionar um objeto ao fim da lista
- size(): retorna o tamanho da lista
- contains(Object o): verifica se a lista contém o objeto especificado
- indexOf(Object o): retorna o índice do objeto especificado
- get(int index): retorna o objeto no índice especificado
- remove(int index): remove o objeto no índice especificado
- remove(Object o): remove o objeto especificado (usando a função equals do objeto em questão)
- clear(): remove todos os objetos da lista

## Listas só Armazenam Objetos

O segundo aspecto das listas é que elas não armazenam tipos primitivos.
Listas só guardam objetos.
Mas isso não é um problema, pois todos os tipos primitivos básicos podem ser instanciados na forma de objeto.
É o que chamamos de *wrappers* (podemos traduzir para *empacotadores*).

## Autoboxing e Unboxing

**Boxing** significa encaixotar, ou envolver.
Quando fazemos um boxing? Quando pegamos um tipo primitivo e o envolvemos dentro de um *wrapper*.
Em algumas situações isso é feito de forma automática, daí o nome **autoboxing**.

Autoboxing é aplicado pelo compilador do Java nas seguintes condições:
1. Quando um valor primitivo é passado como um parâmetro para um método que espera um objeto. (o caso do exemplo anterior)
2. Quando um valor primitivo é atribuído a um wrapper.

Neste sentido, o **unboxing** representa o processo inverso. É quando pegamos um objeto wrapper e atribuímos a uma variável de tipo primitivo.

## Performance: ArrayList e LinkedList

Podemos usar dois tipos de lista: o **ArrayList** e a **LinkedList**.

O ArrayList é implementado com arrays para armazenar os objetos.
O LinkedList usa uma lista ligada, ou seja, objetos apontando para outros objetos.

Por ArrayLists se utilizarem de array, eles alocam blocos contíguos de memória.
Por um lado, isso traz uma eficiência no acesso e mudança de valores dos elementos do array.
Por outro, pode causar desperdício de memória.
 
LinkedList, por outro lado, usam listas ligadas.
Listas ligadas não armazenam blocos contíguos de memórias, como arrays.
 
Em uma situação em que tenhamos uma LinkedList e um ArrayList ambos com capacidade *n* e totalmente preenchidas, a lista ligada ocupará o dobro de espaço de memória do ArrayList.
Em contrapartida, há situações em que a LinkedList pode economizar mais memória do que o ArrayList.
Para finalizar, vale salientar que por ArrayLists serem implementados com arrays, eles se valem dos benefícios dos arrays: conseguem chegar ao elemento desejado de forma instantânea, enquanto que no LinkedList é preciso percorrer toda a lista para chegar a um elemento específico.
