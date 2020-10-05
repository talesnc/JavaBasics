# Operadores

## Operadores básicos

### Aritiméticos

Através dos operadores básicos aritiméticos são realizadas as operações fundamentais da matemática.

  - São eles: +, -, *, /, %

```java
int a = 5 + 5;      //o valor de a será 10
a = a - 5;          //o valor de a será 5
a = a * 10;         //o valor de a será 50
a = a / 2;          //o valor de a será 25
a = a / 2;          //o valor de a será 12 (o inteiro armazena apenas a parte inteira, desprezando a decimal

int resto = 10 % 3; //o valor de resto será 1
```

### Incremento e decremento

  - **++** para incremento
 
  - **--** para decremento

Se declarado antes da variável, o incremento/decremento é feito antes do valor ser lido; Se declarado depois, a variável será incrementada/decrementada depois do valor ser lido.

```java
int a = 10;      

//primeiro examinemos os pós-fixados
int b = a++;          //a é atribuído para b (10), e depois a é incrementado (11)
int c = a--;          //a é atribuído para c (11), e depois a é dencrementado (10)

//depois examinemos os pré-fixados
int d = ++a;          //a é incrementado (11), e depois a é atribuído para d (11)
int e = --a;          //a é decrementado (10), e depois a é atribuído para d (10)
```

### Relacionais de comparação e igualdade

Os operadores relacionais e de igualdade avaliam dois operandos e retornam um valor booleano.

  - São eles: <, >, <=, >=, ==, !=

```java
int a = 10, b = 15, c = 5, d = 10;

boolean res1 = a > b;     //res1 é false
res1 = a >= b;            //res1 é false
res1 = a < b;             //res1 é true
res1 = a <= b;            //res1 é true

boolean res2 = a > c;     //res2 é true
res2 = a >= c;            //res2 é true
res2 = a < c;             //res2 é false
res2 = a <= c;            //res2 é false

boolean res3 = a > d;     //res3 é false 
res3 = a >= d;            //res3 é true
res3 = a < d;             //res3 é false
res3 = a <= d;            //res3 é true

boolean res4 = a==5;      //res4 é false
res4 = a==10;             //res4 é true
```

### Lógicos

Os operadores lógicos permitem a criação de expressões lógicas mais complexas.

  - São eles: **&&, ||**

```java
boolean v1 = true;
boolean v2 = false;

boolean v3 = v1 && v2;    //v3 é false
v3 = v1 || v2;            //v3 é true
```

### Ternários

Tem o mesmo efeito de um comando condicional if-else

  - Representado por: **?  :**

```java
int altura = 180;
String classificacao = altura > 160 ? "alto" : "baixo";  //classificacao é "alto"

//equivale ao seguinte comando if-else
String classificacao = "";
if(altura > 160)
  classificacao = "alto";
else
  classificacao = "baixo";
```

### Atribuição

Os operadores de atribuição são utilizados para definir o valor inicial ou sobrescrever o valor de uma variável.

  - São eles: =, +=, -=, *=, /=, %=, &=, ^=, |=

```java
int idade = 18;   
idade += 20;      //idade é 38
idade -= 8;       //idade é 30
idade *= 2;       //idade é 60
idade /= 2;       //idade é 30
idade %= 28;      //idade é 2
idade ^= 2;       //idade é 4
```
