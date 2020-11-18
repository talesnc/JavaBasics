# Reúso

A escrita de código duplicado é malquista pelos programadores.
Código duplicado é ruim porque sempre que houver alguma mudança em um determinado algoritmo, o programador deverá procurar ocorrências daquele algoritmo em seu programa e realizar a mudança.
No mundo do desenvolvimento de software, **mudança é quase uma certeza**.
Os programadores têm alguma resistência em realizar mudanças em seu programa, por causa do retrabalho.
Mas a mudança do código do programa vai acontecer com certa frequência.
Programas mudam porque:

1. o programador implementou uma funcionalidade errada (entendeu mal os requisitos listados pelos clientes)
2. O programador encontrou um bug no programa que precisa ser corrigido
3. O cliente mudou de ideia a respeito de uma funcionalidade que havia solicitado
4. O gerente do projeto pressionou a equipe para entregar funcionalidades do programa e, diante da pressão, a equipe não respondeu bem e implementou as funcionalidades com más práticas de design
5. Dentre outras situações.

No paradigma de programação orientada a objetos existem duas formas de promover o  reúso de código: **composição e herança.**

## Composição

Sempre que uma determinada classe A tiver uma variável de referência cujo tipo é de uma outra classe B, dizemos que **A tem B**.
Quando **A tem B**, a classe A tem acesso a todas as variáveis e funções públicas de B.
Por essa razão, A reusa o código de B.
Nesse caso, A reusa B através da *composição*.

Suponha que você esteja criando um aplicativo como o Uber.
Poderíamos ter as seguintes classes, por exemplo: Motorista, Passageiro, Corrida.
Imagine que Motorista e Passageiro possuam variáveis para armazenar a data de ingresso no Uber.
Também considere que a classe Corrida deve ter variáveis para armazenar a data de acontecimento daquele serviço.

## Herança

Na herança, podemos estabelecer relações hierárquicas entre classes.
Teremos uma classe mãe (ou pai) e várias classes filhas, que são as classes que herdam.
A saber, todas as classes de Java são filhas de Object, ou netas de Object, ou tataranetas de Object, etc.
Resumindo, todas as classes tem algum relacionamento direto ou indireto com Object.

A herança é estabelecida através da palavra-chave **extends**.
Se uma determinada classe não declara explicitamente que herda de outra classe, então aquela classe herda da classe Object.

A herança permite apenas um relacionamento **1 para 1** (1 classe pode reusar apenas o código de 1 outra classe).
Portanto, a representação da classe Corrida com duas datas não seria possível de alcançar apenas com herança.
Diz-se que em Java temos apenas herança simples, ou seja, um classe não pode herdar de mais de uma classe (enquanto na composição, isto é possível).

### Sobrescrita

Na herança, uma classe herda atributos e métodos de outra classe (a depender da visibilidade).
Os métodos herdados podem ser utilizados livremente pelas sub-classes.

Sempre que houver herança, e métodos de uma superclasse ficarem disponíveis para sub-classes, é possível haver **sobrescrita**.
A sobrescrita (ou reescrita) acontece quando uma sub-classe especializa um método herdado.
Especializar quer dizer prover um funcionamento mais específico para aquele método (na sub-classe).
Isto é feito codificando um método na sub-classe que contenha a mesma assinatura (tipo de modificador, tipo de retorno, nome de método, e mesma quantidade e mesmos tipos de argumentos).

#### Regras da Sobrescrita

As regras da sobrescrita dizem respeito à assinatura da função.
Por assinatura, considere: modificador de acessor, tipo de retorno, nome da função, quantidade de argumentos, e tipos dos argumentos (a ordem dos argumentos importa)

 - Opção 1: assinatura exatamente igual.

 - Opção 2: assinatura não é exatamente igual, embora seja parecida.

   - &nbsp;  &nbsp; 2.1. nome de função igual

   - &nbsp;  &nbsp; 2.2. tipo de retorno pode ser diferente, contanto que o tipo da função sobrescrita respeite o relacionamento *É-UM* com o tipo de retorno da função na superclasse (lembrar que a palavra reservada *instanceof* é usada para o teste)

   - &nbsp;  &nbsp; 2.3. modificador de acesso menos restritivo (ex: se na superclasse tivermos protected, na sub-classe podemos ter public)

Para haver sobrescrita deve haver herança!
