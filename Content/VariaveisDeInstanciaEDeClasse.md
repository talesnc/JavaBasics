# Variáveis e Metódos de Instância e de Classe

Na programação orientada a objetos, podem existir dois tipos de variáveis: as **variáveis de classe** e as **variáveis de instância**

## Variáveis de classe (ou estáticas) 
  - Variáveis que não pertencem ao objeto, mas pertencem a classe (não nascem junto do objeto, elas ficam junto da classe); 
  
  - Variáveis de classe independem da existência de objetos;
  
  - Para criar uma variável de clssse, basta declará-la como static;
  
  - Posso atribuir valores à variáveis de classe sem que exista objeto algum.

## Variáveis de instância
  - São as variáveis que pertencem ao objeto;
  
  - Toda vez que se cria um objeto, este carrega variáveis de instância;
  
  - As variáveis de instância são, portanto, os atributos que cada objeto traz consigo; 
  
  - Toda variável que é declarada *sem usar a palavra reservada static* é uma variável de instância;
	- Variáveis de tipos primitivos iniciam com um valor default; geralmente 0;
	- Variáveis de referência à objetos (como é o caso de String) inicializam com null;
	
  - Só vou poder atribuir valores à variáveis de instânbcia (objeto) depois que criar o objeto.

## Métodos de instância e de classe
 - Os métodos funcionam do mesmo modo que as variáveis, ou seja, *métodos de instância* pertencem aos objetos e *métodos de classe* pertencem a classe.

### Métodos de instância
  - Só podem ser executados sobre um objeto, depois que ele for criado;
  
  - Ex.: o toString() para imprimir os objetos.

### Métodos de classe (ou estáticos)
  - Pertencem à classe, ou seja, não dependem de um obejto para serem executados;
  
  - Se coloca static antes do método.
