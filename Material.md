# Tipos Primitivos

​	O Java possui um total de 8 tipos primitivos classificados nas famílias: Literais, Inteiros, Reais e Lógicos. Eles são: `boolean`, `char`, `byte`, `short`, `int`, `long`, `float` e `double`. Para esses tipos deve-se notar alguns detalhes: são sempre escritos em caixa baixa, o tipo *char* utiliza aspas simples e só pode armazenar um único caractere, os tipos *float* e *double* utilizam ponto para separar a parte decimal, sendo que o *float* sempre utiliza um **f** no fim. Além dos tipos primitivos, também existem as classes **Invólucro** ou ***Wrapper***, que criam objetos que envolvem os tipos primitivos. Os ***Wrappers*** sempre são escritos com letra inicial maiúscula. Como classes invólucro do tipo *char*, existem a *Character* e a *String*. Esta segunda utiliza aspas duplas e pode armarzenar mais do que um único caractere. As tabelas abaixo listam os tipos primitivos e as classes invólucro:

**Tabela de Tipos Primitivos**

| FAMÍLIA |  TIPO   | TAMANHO |
| :-----: | :-----: | :-----: |
| Lógico  | boolean |  1 bit  |
| Literal |  char   | 1 byte  |
| Inteiro |  byte   | 1 byte  |
| Inteiro |  short  | 2 bytes |
| Inteiro |   int   | 4 bytes |
| Inteiro |  long   | 8 bytes |
|  Real   |  float  | 4 bytes |
|  Real   | double  | 8 bytes |



**Tabelas de Classes Invólucro**

| FAMÍLIA | CLASSE WRAPPER | TIPO PRIMITIVO |
| :-----: | :------------: | :------------: |
| Lógico  |    Boolean     |    boolean     |
| Literal |   Character    |      char      |
| Literal |     String     |      char      |
| Inteiro |      Byte      |      byte      |
| Inteiro |     Short      |     short      |
| Inteiro |    Interger    |      int       |
| Inteiro |      Long      |      long      |
|  Real   |     Float      |     float      |
|  Real   |     Double     |     double     |



​	Existem basicamente três formas de se declarar uma variável. A primeira é simpesmente declarar uma variável com um tipo primitivo e colocar um valor dentro dela. A segunda maneira é por *casting*. Nessa maneira, colocamos o tipo do valor entre parênteses antes do mesmo. E a terceira maneira é utilizando uma classe invólucro. Nesse modo, coloca-se a classe como o tipo da variável. Exemplo utilizando as três formas:

```java
// Modo 1
char caractere = 'J';
int inteiro = 15;
float flutuante = 18.46f;

// Modo 2
char caractere = (char) 'J';
int inteiro = (int) 15;
float flutuante = (float) 18.46;

// Modo 3
Character caractere = 'J';
String linguagem = "Java";
Integer inteiro = 15;
Float flutuante = 18.46f;
```



## Conflitos entre Tipos

​	Quando uma variável de um determinado tipo recebe um valor de um tipo diferente, é necessário que haja uma conversão de tipo do valor. Em determinados casos, essa conversão pode ser feita facilmente pela própria linguagem. Em outros, é preciso o use de um método que faça essa conversão.

​	Quando o próprio Java faz essa conversão, chamamos de **promoção de tipo**. Existem algumas regras para que essa conversão aconteça. Veja abaixo:

1. Se dois valores tiverem tipos de dados diferentes, o Java promoverá automaticamente o menor tipo de dados para o maior.

2. Se um dos valores é inteiro e o outro é ponto flutuante, o Java automaticamente promove o valor inteiro para o tipo de dados do valor de ponto flutuante.

4. Após toda a promoção ter ocorrido e os operandos tiverem o mesmo tipo de dados, o valor resultante terá o mesmo tipo de dados da ultima promoção.

​	Nos outros casos, precisamos utilizar um método para fazer essa conversão. Existem uma lista vasta de métodos que podem ser usados. Para saber mais sobres elas, [clique aqui](https://www.devmedia.com.br/conversoes-em-java/2695) para ter uma ideia.

# Saída de dados

​	Fazer depois...

# Operadores Aritméticos

## Operadores Aritméticos

​	Os operadores aritméticos servem para fazer cálculos aritméticos da matemática básica. Uma coisa importante de se notar é sobre o tipo do resultado dos operadores. Tipos de dados menores como *byte*, *short* e *char*, são promovidos primeiramente a qualquer momento para *int* no momento em que forem usados com um destes operadores Java, mesmo que nenhum dos operandos seja *int*. Uma tabela de todos os operadores aritiméticos com uma descrição

| OPERADOR |     DESCRIÇÃO     |  EXEMPLO   |
| :------: | :---------------: | :--------: |
|    +     |       soma        | 5 + 3 = 7  |
|    -     |     subtração     | 7 - 4 = 3  |
|    *     |   multiplicação   | 6 * 3 = 18 |
|    /     | divisão (inteira) | 5 / 2 = 2  |
|    %     | resto da divisão  | 10 % 4 = 2 |



## Operadores Unários

​	Existem dois operadores unários, o `++` incremento e o `--` decremento. Abaixo uma tabela dos operadores e um exemplo.

> Existem duas formas de se utilizar estes operadores: **pós** e **pré**. Na primeira forma, se utiliza o valor e depois o incrementa ou decrementa. Na segunda, primeiro se faz a operação e depois se utiliza o valor. Por exemplo, se definido `int a = 5;`, e depois for aplicado `int b = a++;`, então `b` será igual a `5` e `a` será incrementado para 6. Mas se for feito `int b = ++a;`, então `b` receberá o valor `6`.

| OPERADOR | DESCRIÇÃO  | EXEMPLO |
| :------: | :--------: | :-----: |
|    ++    | incremento |   a++   |
|    --    | decremento |   a--   |



## Operadores de Atribuição

​	Os operadores de atribuição realizam operações aritméticas sobre uma variável com um outro valor e colocam o resultado dentro da própria variável. Aqui abaixo a lista deles, um exemplo e o significado.

| OPERADOR | EXEMPLO | SIGNIFICADO |
| :------: | :-----: | :---------: |
|    +=    | a += b  |  a = a + b  |
|    -=    | a -= b  |  a = a - b  |
|    *=    | a *= b  |  a = a * b  |
|    /=    | a /= b  |  a = a / b  |
|    %=    | a %= b  |  a = a % b  |



# Classe Math

​	A classe Math é uma classe que já vem no próprio *java.lang* e nos permite fazer várias operações matemáticas mais complexas. 

## Operações aritméticas

​	Ela nos traz algumas funções para trabalhar com cálculos matemáticos mais complexos. Veja a tabela abaixo

| ELEMENTO |      SIGNIFICADO       |    EXEMPLO     | RESULTADO |
| :------: | :--------------------: | :------------: | :-------: |
|    PI    | constante matemática π |    Math.PI     |  3,1415   |
|   pow    |     exponenciação      | Math.pow(5, 2) |    25     |
|   sqrt   |     raiz quadrada      | Math.sqrt(25)  |     5     |
|   cbrt   |      raiz cúbica       | Math.cbrt(27)  |     3     |



## Operações de Arredondamento

​	Veja aqui, algumas funções para arrendondamento de números

| FUNÇÃO |        SIGNIFICADO        |     EXEMPLO     | RESULTADO |
| :----: | :-----------------------: | :-------------: | :-------: |
|  abs   |      valor absoluto       |  Math.abs(-10)  |    10     |
| floor  |   arredonda para baixo    | Math.floor(3.9) |     3     |
|  ceil  |    arredonda para cima    | Math.ceil(4.2)  |     4     |
| round  | arredonda aritmeticamente | Math.round(5.6) |     6     |



## Geração de Números

​	Para a geração de números aleatórios, existe o método Math.*random*() que retorna um valor *double* entre 0 e 1. Para gerar números aleatórios em um outro range, utilizamos uma fórmula matemática
$$
min + aleatório(max - min)
$$
​	Veja um exemplo de código abaixo:

```java
// Cria um número aleatório entre 10 e 5
double aleatorio = Math.random();
int numero = (int) (10 + aleatorio * (10-5))
```

# Operadores Lógicos e Relacionais

## Operadores Relacionais

​	Estes operadores servem para comparar valores e estabelecer relações entre eles. Abaixo, a tabela de todos eles

| OPERADOR |   SIGNIFICADO    | EXEMPLO | RESULTADO |
| :------: | :--------------: | :-----: | :-------: |
|    >     |    Maior que     |  5 > 2  |   true    |
|    <     |    Menor que     |  4 < 1  |   false   |
|    >=    | Maior ou igual a | 8 >= 3  |   true    |
|    <=    | Menor ou igual a | 6 <= 6  |   true    |
|    ==    |     Igual a      | 9 == 8  |   false   |
|    !=    |    Diferente     | 4 != 5  |   true    |



## Operador Ternário

​	O operador ternário do Java é o `?:`. Este operador recebe três argumentos: uma expressão para verificar, uma expressão pra ser feita caso a primeira seja verdadeira  e outra expressão caso a primeira seja falsa. Um exemplo de uso:

```java
int n1 = 5;
int n2 = 6;
int maior = n1>n2 ? n1 : n2;
System.out.println(maior) // O resultado será "6"
```

​	Neste exemplo foram declaradas duas variáveis: `n1` recebendo o valor `5` e `n2` recebendo o valor `6`. Caso `n1` for maior do que `n2`, então a variável `maior` receberá o valor `5`, senão receberá o valor `6`.



## Comparando Strings

​	Quando declaramos duas Strings diferentes utilizando as *aspas duplas*, podemos comparar se são iguais utilizando o operador relacional **==**. Veja um exemplo:

 ```java
String nome1 = "Carlos";
String nome2 = "Carlos";
boolean res;

res = (nome1 == nome2) ? true : false;
System.out.println(res); // O resultado será "true"
 ```

​	Quando declaramos duas Strings diferentes utilizando uma *aspas duplas* e outra o operador `new` ou as duas utilizando este operador, já não podemos fazer esta comperação utilizando  o **==**. Neste caso, utilizamos um método específico para isso chamado `equals()`. Veja um outro exemplo:

```java
String nome1 = "Carlos";
String nome2 = new String("Carlos");
boolean res;

// Utilizando ==
res = (nome1 == nome2) ? true : false;
System.out.println(res); // O resultado será "false"

// Utilizando .equals()
res = (nome1.equals(nome2)) ? true : false;
System.out.println(res) // o resultado será "true"
```



## Operadores Lógicos

​	Estes operadores servem para fazer operações *booleanas* entre valores. Veja a tabela desses operadores:

| OPERADOR | SIGNIFICADO |     EXEMPLO     | RESULTADO |
| :------: | :---------: | :-------------: | :-------: |
|    &&    |      E      |  true && false  |   false   |
|   \|\|   |     OU      | false \|\| true |   true    |
|    ^     |     XOU     |   true ^ true   |   false   |
|    !     |     NÃO     |     ! false     |   true    |



# Estruturas Condicionais

## Condição Simples

​	As estruturas condicionais são estruturas que nos possibilitam verificar condições e executar operações dependendo dos resultados. A comando mais básico no Java é a palavra reservada `if` seguida da condição entre `()` e depois um bloco entre `{}`. Se a condição for verificada verdadeira, então o bloco será executado, senão, nada será feito. Exemplo:

```java
System.out.print("Digite a primeira nota: ");
float n1 = teclado.nextFloat();
System.out.print("Digite a segunda nota: ");
float n2 = teclado.nextFloat();
float m = (n1 + n2) / 2;

System.out.println("Parabéns!");

if (m > 9) {
    System.out.println("Parabéns!");
}
```



## Condições Compostas

​	Quando a condição de `if` é verificada como falsa, seu bloco **não** será executado. Podemos desejar que, nesse caso, algo a mais seja feito, ao invés de simplesmente nada. Para isso, utilizamos a palavra reservada `else` seguida de um bloco entre `{}` em conjunto, logo após o fim do bloco `if`. O bloco `else` não será executado caso o seu `if` for executado. Exemplo:

```java
System.out.print("Digite sua idade: ");
int nasc = teclado.nextInt();
int idade = 2022 - nasc;

if (idade >= 18) {
    System.out.prinln("Maior de Idade");
} else {
    System.out.println("Menor de Idade");
}
```



## Condições Encadeadas

​	As estruturas condicionais *encadeadas* ou *aninhadas* são formadas juntando várias estruturas compostas, uma dentro da outra. Essas estruturas são usadas para resolver problemas de onde existem mais de duas possibilidades de resultado, ou onde existem mais do que uma condição ser verificada.

​	Para criá-las, colocamos um bloco `if` `else` dentro do bloco de um `else` superior.  Exemplo:

```java
System.out.print("Digite sua idade: ");
int nasc = teclado.nextInt();
int idade = 2022 - nasc;

if (idade < 16) {
    System.out.println("Não vota");
} else {
    if ((idade >= 16 && idade < 18) || idade > 70) {
        System.out.println("Voto opcional");
    } else {
        Sytem.out.println("Voto obrigatório");
    }
}
```

​	Outra forma seria unindo os comandos `else` e `if` na mesma  linha de código, tornando o código menor. Exemplo:

```java
System.out.print("Digite sua idade: ");
int nasc = teclado.nextInt();
int idade = 2022 - nasc;

if (idade < 16) {
    System.out.println("Não vota");
} else if ((idade >= 16 && idade < 18) || idade > 70) {
    System.out.println("Voto opcional");
} else {
    Sytem.out.println("Voto obrigatório");
}
```



## Condições de Múltipla Escolha

​	As estruturas condicionais de *múltipla escolha* servem para verificar vários casos possíveis de resultado para uma única condição de forma simples. Exemplo:

```java
System.out.print("Digite o número de pernas");
int pernas = teclado.nextInt();
String tipo;

switch (pernas) {
    case 1:
        tipo = "Saci";
        break;
    case 2:
        tipo = "Bípede";
        break;
    case 4:
        tipo = "Quadrúpede";
        break;
    case 6, 8:
        tipo = "Aranha";
        break;
    default:
        tipo = "ET";
}
```

# Estruturas de Repetição

​	As **estruturas de repetição**, também conhecidas como **laços** (**_loops_**), são utilizados para executar, repetidamente, uma instrução ou bloco de instruções enquanto determinada condição estiver sendo satisfeita.



## Repetição com Teste no Início

​	Esse tipo de repetição, como o nome diz, ela primeiramente faz o teste de uma condição e depois executa, o bloco de código enquanto o resultado do teste for verdadeiro. Exemplo:

```java
int count = 0;

while (count < 4) { // Testa se count é menor que 4
    System.out.println("Iteração"); // Imprimira "Iteração" 4 vezes
    count++;
}
```



## Modificadores de Fluxo de um Laço

​	São comando que podemos usar para modificar a forma como um laço é executado.

​	Um deles é o comando `continue`. Quando o utilizamos, ele volta diretamente para a condição de verificação sem executar todos os comando que estão abaixo. Exemplo:

```java
int count = 0;

while (count < 10) {
    count++;
    if (count == 5 || count == 7) {
        continue; // Se count for 5 ou 7, ignora o resto do loop
    }
    System.out.println("Iteração " + cc);
}

// Não imprimira "Iteração 5" e "Iteração 7"
```

​	O outro deles é o comando `break`. Quando o utilizamos, ele interrompe imediatamente a execução do laço, pulando para o fim do *loop*. Exemplo:

```java
int count = 0;

while (count < 10) {
    count++;
    if (count == 7) {
        break; // Se count for 7, para o loop
    }
    System.out.println("Iteração " + count);
}

// Imprimirá até "Iteração 7"
```



## Repetição com Teste Lógico no Final

​	Esse tipo de repetição, como o nome diz, ela primeiramente executa um bloco de código e depois faz o teste de uma condição e repete, ou não, o bloco. Diferentemente da *Repetição com Teste Lógico no Início*, esta garante que o bloco será executado no mínimo uma vez. Exemplo:

```java
int count = 0;

do {
    System.out.println("Iteração"); // Imprime "Iteração" primeriamente
    count++;
} while (count < 4); // Depois verifica se count é menor que 4
```



## Repetição com Variável de Controle

​	Neste tipo de estrutura, um bloco de código é executado um número determinado de vezes, de acordo com uma variável de controle. Esta variável começa em um valor inicial e, de tantos em tantos passos, vai até um valor final. Exemplo:

```java
for (int count = 0; count <= 3; count++) { // Inicializa um contador em 0 e o incrementa enquanto for menor que 3
    System.out.println("Iteração"); // Imprime "Iteração" 4 vezes
}
```



## Laços de Repetição Aninhados

​	Os **Laços Aninhados** são um ou mais laços colocados um dentro do outro. Quando isso ocorre, o laço mais interno é executado por completo a cada iteração do laço mais externo. O laço interno será feito várias vezes a cada iteração do laço externo. Exemplo:

```java
for (int count1 = 1; count1 <= 3; count1++) {
    for (int count2 = 0; count2 <= 2; count += 2) {
        System.out.printf("%d %d\n", count1, count2);
    }
}
/* A Saída será:
1 0
1 2
2 0
2 2
3 0
3 2
```

# Vetores

​	Os *Vetores*, ou *Variáveis Compostas*, são variáveis que podem guardar vários valores ao mesmo tempo. Diferente das variáveis simples, os *vetores* possuem mais de um único espaço de armazenamento e são como um grupo de variáveis de **mesmo tipo**. Para acessar cada uma dessas posições, ou *índices*, utilizamos um número. Esse número vai representar-las, começando em 0 para a posição inicial e indo progressivamente até o fim.

​	Em Java, podemos declarar a variável de duas formas: `tipo nome[]` ou `tipo[] nome`. As duas maneiras são válidas. Para inicializar, utilizamos a palavra-chave `new` seguido do tipo com o tamanho entre colchetes `[]`. Para indexar o valores colocamos o nome seguido do índece entre colchetes. Se quisemos inicializar já com todos os valores, os definimos entre chaves `{}` e atruibuímos à variável. Exemplo:

```java
// Declaração
int n[] = new int[4]; // Ou: int[] n

// Atribuição
n[0] = 3;
n[1] = 5;
n[2] = 8;
n[3] = 2;
```

Ou, também,

```java
int n[] = {3, 5, 8, 2};

for (int c = 0; c <= 3; c++) {
    System.out.println(n[c]);
}
```



## Atributo .length dos Vetores

​	Em Java, todos os vetores são objetos, ou seja, possuem métodos e atributos. Um atributo dos vetores é a propriedade `length` que armazena o tamanho do vetor. Utilizando essa informação, podemos iterar de forma mais genérica um vetor qualquer. Exemplo:

```java
int n[] = {3, 5, 8, 4, 7, 2};

for (int c = 0; c < n.length; c++) { // Dessa forma, iteramos o vetor sem a necessidade de sabermos seu tamanho
    System.out.println(n[c]);
}
```



## O laço For - Para cada

​	Quando desejamos iterar sobre um vetor, podemos utilizar qualquer uma das estruturas de repetição: `while`, `do while` ou o `for`. No entanto, existe uma variação do `for` que simplifica esse processo. Podemos defini-la assim: `for (tipo var: vetor) {}`, em que *tipo var* é uma variável do mesmo tipo do *vetor* e que, a cada iteração, irá receber um valor do *vetor*. Exemplo:

```java
int v = {3, 5, 1, 8, 4};

for (int val: v) {
    System.out.println(valor);
}
```



## Métodos dos Vetores

​	Como já dito antes, em Java, todos os vetores também são objetos, ou seja, possuem atributos e métodos.

​	Um deles é o `Arrays.sort(vetor)`. Com ele, é possível ordernar um vetor em ordem crescente. Exemplo:

```java
int v = {3, 5, 1, 8, 4};

Arrays.sort(v);
for (int valor: v) {
    System.out.println(valor); // A saída será: 1 3 4 5 8
}
```

​	Outro método é o `Arrays.binarySearch(vetor, valor)`. Esse trabalha com busca binária para encontrar um dado valor em um certo vetor e retorna o seu índice. Exemplo:

​	**OBS**: Este método, por usar busca binária, só irá funcionar se o vetor estiver ordenado.

```java
int v = {1, 3, 4, 5, 8};
int pos = Arrays.binarySearch(v, 3);

System.out.println(pos); // A saída será: 1
```

​	Quando precisamos definir um *array*, onde todos os valores são iguais, ao invés de colocar o mesmo valor repetido várias vezes dentro das chaves, podemos utilizar o método `Arrays.fill(vetor, valor)`. Este método preenche o vetor com o valor em todas as posições. Exemplo:

```java
int v[] = new int[5];
Arrays.fill(v, 2);
System.out.println(v); // A saída será: 2 2 2 2 2
```

# Métodos

​	Um *Método* é um bloco de código, ou um conjunto de intruções, com um determinado objetivo. Eles podem ou não receber parâmetros, que são valores que o método necessita para alguma operação. Eles também pode retorna um valor. Damos ao método um nome e, sempre que precisamos executar sua operação, somente o chamamos pelo nome. Exemplo:

```java
// Criando um método de soma
void soma(int a, int b) {
    int s = a + b;
    System.out.print(s);
}

// Utilizando o método
soma(5, 3); // Imprime 8
soma(6, 9); // Imprime 15
```

