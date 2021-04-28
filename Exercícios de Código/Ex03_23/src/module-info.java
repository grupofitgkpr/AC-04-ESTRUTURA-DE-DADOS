/* Giovanni Assis Lopes RA: 1903604

Kaique Mantoanelli Silva RA: 1903168

Pedro Henrique Oliveira Dantas Lopes RA: 1904007

Rafael Serino Kiss RA: 1903107 
   
   
  !!! O EXERCÍCIO 1A,B,C,D / EXERCÍCIO 2A / EXERCÍCIO 22, ESTÃO NO GITHUB EM PASTAS SEPARADAS !!!!
   
   -------------
   
Exercício 3: Um aeroporto quer simular o tráfego aéreo com eventos como decolagens e pousos.
Os eventos têm um time-stamp com a hora em que o evento acontece. O simulador
deve realizar eficientemente as duas operações fundamentais a seguir:
a) inserir um evento com um dado time-stamp (ou seja, inserir um evento
futuro);
b) extrair o evento com menor time-stamp (ou seja, determinar o próximo
evento a processar);
Que estrutura de dados você usaria para suportar essas operações? Justifique sua
resposta. 

Resposta: A estrutra é a Fila de Prioridades, os eventos são uma simulação logo ele ira tirar o Voo com menor time-stamp
   
   -------------
   
Exercício 4: Onde pode estar armazenado o elemento com a maior chave em um heap?

Resposta: Na Raiz
   
   -------------
   
Exercício 5: Seja T uma árvore binária completa em que v armazena a entrada (p(v),0), onde p(v) é
o número do nível de v. A árvore T é um heap? Justifique sua resposta.

Resposta: Sim a árvore é uma binaria completa, logo ela é considerada um heap.

   -------------
   
Exercício 6: Explique por que não se considera o caso do filho direito de r ser interno e o filho
esquerdo ser externo quando se descreve o processo do down-heap bubbling.

Resposta: O item acaba sendo movido do final para o começo ja que não possui filho com chave maior que sua.

   -------------
   
Exercício 7: Existe um heap T armazenando sete elementos diferentes de forma que um
caminhamento prefixado de T apresente os elementos de T em ordem crescente ou
decrescente? E se for um caminhamento interfixado? E pós -fixado? Se sim, apresente
um exemplo; caso contrário, justifique.

Resposta: Nós utilizamos os seguintes números >
1|8
2|18
3|14
4|17
5|12
6|13
7|11 
Está em ordem crescente, não está em Interfixado por que começamos da raiz e não pela esquerda/ não esta em pós-fixado pois começamos pela raiz e não pela direita.

   -------------
   
Exercício 8: Considere H um heap que armazena 15 elementos usando uma representação de
arranjo de uma árvore binária completa. Qual é a sequência de índices da lista de
arranjo que são visitados no caminhamento prefixado de H? E qual é a sequência em
um caminhamento interfixado? E em um caminhamento pós-fixado?

Resposta: Nós utlizamos os seguintes números >
1|9
2|14
3|12
4|19
5|21
6|23
7|17
8|57
9|67
10|54
11|82
12|94
13|76
14|72
15|50
A sequência são 4 arranjos/não esta em Interfixado por que começamos da raiz e não pela esquerda/ não esta em pós-fixado pois começamos pela raiz e não pela direita.

  -------------
   
Exercício 9: Bill afirma que um caminhamento prefixado em um heap listará as chaves em ordem
não-decrescente. Apresente um exemplo de um heap que prove que ele está errado.

Resposta: 
1|27
2|18
3|14
4|17
5|12
6|13
7|11
8|15
9|16

  -------------
  
Execício 10: Hillary afirma que um caminhamento pós-fixado em um heap listará as chaves em
ordem não-crescente. Apresente um exemplo de um heap que prove que ela está
errada.

Exercício: 
1|16
2|15
3|17
4|12
5|13
6|11
7|18
8|14
9|27

   -------------
  
Execício 11: Apresente todos os passos do algoritmo para remover a chave 16 do heap abaixo:

Resposta: O heap original é:
1|4C
2|5A
3|6Z
4|15K
5|9F
6|7Q
7|20B
8|16X
9|25J
10|14E
11|12H
12|11S
13|8W
Com a alteração na chave 8|16 ele ficará da seguinte maneira:
1|4C
2|5A
3|6Z
4|15K
5|9F
6|7Q
7|20B
8|25J
9|14E
10|12H
11|11S
12|8W
como o 16X não tem nenhum filho ele pode ser retirado da árvore sem problema algum.

   -------------
  
Exercício 12: Mostre como implementar o TAD pilha usando apenas uma fila de prioridade e uma
variável inteira adicional.

Resposta: ?

   -------------
   
Exercício 13: Mostre como implementar o TAD fila (padrão) usando apenas uma fila de prioridade e
uma variável inteira adicional.

Resposta: ?

   -------------
   
Execício 14: Qual dos esquemas de tratamento de colisão de tabela hash consegue tolerar um fator
de carga superior a 1 e qual não consegue?

Resposta: O único capaz de tolerar é o Hashing Duplo, e o que não tolera é o endereçamento aberto.

   -------------
   
Exercício 15: Qual seria um bom código hash para um número de identificação de veículo que é
uma cadeia de caracteres representando números e letras no formato
“9X9XX99X9XX999999,” onde um “9” representa um dígito e um “X” representa uma
letra?

Resposta: ?

   -------------

Exercício 16: Desenhe a tabela hash com 11 elementos, que resulta a partir do uso da função de
hash, h(i) = (3i + 5) mod 11, para colocar as chaves 12, 44, 13, 88, 23, 94, 11, 39, 20, 16
e 5, assumindo que as colisões serão tratadas por encadeamento.

Respostas: 
x|Chave 1| Chave 2| Chave 3|
0|   13  |        |        |
1|   94  |   39   |        |
2|       |        |        |
3|       |        |        |
4|       |        |        |
5|   44  |   88   |   11   |
6|       |        |        |
7|       |        |        |
8|   12  |   23   |        |
9|   16  |    5   |        |
10|  20  |        |        |
 
    -------------

Exercício 17: Qual será o resultado do exercício 3 se assumirmos que as colisões serão tratadas por
teste linear?
  
Resposta:
0|13
1|94 
2|39     
3|16      
4|5   
6|44
5|88    
7|11       
8|12    
9|23    
10|20

    -------------

Exercício 18: Mostre o resultado do exercício 3 assumindo que as colisões são tratadas por teste
quadrático, até o ponto em que o método falha.

Resposta:
0|13
1|94 
2|39       
3|16      
4|20     
6|44
5|88    
7|       
8|12    
9|23   
10|11
Falhou em armazenas a chave 5 (Última chave).

    -------------
    
Exercício 19: Qual é o resultado do exercício 3 assumindo que as colisões são tratadas por hashing
duplo usando uma função hash secundária h’(k)=7 (k mod 7)?

Resposta: ?

    -------------
    
Exercício 20: Forneça uma descrição em pseudocódigo da inserção em uma tabela hash que usa
teste quadrático para resolver colisões, assumindo que se usa o truque de substituir
elementos deletados com um objeto indicando “item desativado”.

Resposta: ?

    -------------
    
Execício 21: Pesquise sobre o TAD Dicionário e descreva a principal diferença desse TAD com o TAD
Mapa.

Respostas: A principal diferença entre TAD Mapa e o TAD Dicionário, é a capacidade do Dicionário poder adicionar múltiplas entradas para uma mesma chave, que no TAD Mapa só é possível ter chaves com entradas únicas.
    
    -------------

Exercício 23: Desafio:
a) Escreva uma classe de verificação ortográfica que armazena conjuntos de palavras,
W, em uma tabela hash e implementa o método spellCheck(s) que executa uma
verificação ortográfica sobre a string s relativa ao conjunto de palavras, W.
b) Se s está em W, então a chamada para spellCheck(s) retorna uma coleção iterável
que contém apenas s, assumindo-se que tenha sido grafada corretamente neste
caso.
c) Por outro lado, se s não está em W, então a chamada para spellCheck retona a
coleção iterável de todas as palavras de W que podem corresponder à grafia
correta de s.
d) O programa pode ser capaz de tratar todas as formas normais que s pode omitir
uma palavra em W, incluindo trocar caracteres adjacentes de uma palavra,
inserção de um único caractere entre outros dois, remoção de um único caractere
de uma palavra e substituição de um caractere em uma palavra por outro.

Resposta: ? */

