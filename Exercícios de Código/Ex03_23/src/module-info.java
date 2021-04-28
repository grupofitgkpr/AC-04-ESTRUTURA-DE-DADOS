/* Giovanni Assis Lopes RA: 1903604

Kaique Mantoanelli Silva RA: 1903168

Pedro Henrique Oliveira Dantas Lopes RA: 1904007

Rafael Serino Kiss RA: 1903107 
   
   
  !!! O EXERC�CIO 1A,B,C,D / EXERC�CIO 2A / EXERC�CIO 22, EST�O NO GITHUB EM PASTAS SEPARADAS !!!!
   
   -------------
   
Exerc�cio 3: Um aeroporto quer simular o tr�fego a�reo com eventos como decolagens e pousos.
Os eventos t�m um time-stamp com a hora em que o evento acontece. O simulador
deve realizar eficientemente as duas opera��es fundamentais a seguir:
a) inserir um evento com um dado time-stamp (ou seja, inserir um evento
futuro);
b) extrair o evento com menor time-stamp (ou seja, determinar o pr�ximo
evento a processar);
Que estrutura de dados voc� usaria para suportar essas opera��es? Justifique sua
resposta. 

Resposta: A estrutra � a Fila de Prioridades, os eventos s�o uma simula��o logo ele ira tirar o Voo com menor time-stamp
   
   -------------
   
Exerc�cio 4: Onde pode estar armazenado o elemento com a maior chave em um heap?

Resposta: Na Raiz
   
   -------------
   
Exerc�cio 5: Seja T uma �rvore bin�ria completa em que v armazena a entrada (p(v),0), onde p(v) �
o n�mero do n�vel de v. A �rvore T � um heap? Justifique sua resposta.

Resposta: Sim a �rvore � uma binaria completa, logo ela � considerada um heap.

   -------------
   
Exerc�cio 6: Explique por que n�o se considera o caso do filho direito de r ser interno e o filho
esquerdo ser externo quando se descreve o processo do down-heap bubbling.

Resposta: O item acaba sendo movido do final para o come�o ja que n�o possui filho com chave maior que sua.

   -------------
   
Exerc�cio 7: Existe um heap T armazenando sete elementos diferentes de forma que um
caminhamento prefixado de T apresente os elementos de T em ordem crescente ou
decrescente? E se for um caminhamento interfixado? E p�s -fixado? Se sim, apresente
um exemplo; caso contr�rio, justifique.

Resposta: N�s utilizamos os seguintes n�meros >
1|8
2|18
3|14
4|17
5|12
6|13
7|11 
Est� em ordem crescente, n�o est� em Interfixado por que come�amos da raiz e n�o pela esquerda/ n�o esta em p�s-fixado pois come�amos pela raiz e n�o pela direita.

   -------------
   
Exerc�cio 8: Considere H um heap que armazena 15 elementos usando uma representa��o de
arranjo de uma �rvore bin�ria completa. Qual � a sequ�ncia de �ndices da lista de
arranjo que s�o visitados no caminhamento prefixado de H? E qual � a sequ�ncia em
um caminhamento interfixado? E em um caminhamento p�s-fixado?

Resposta: N�s utlizamos os seguintes n�meros >
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
A sequ�ncia s�o 4 arranjos/n�o esta em Interfixado por que come�amos da raiz e n�o pela esquerda/ n�o esta em p�s-fixado pois come�amos pela raiz e n�o pela direita.

  -------------
   
Exerc�cio 9: Bill afirma que um caminhamento prefixado em um heap listar� as chaves em ordem
n�o-decrescente. Apresente um exemplo de um heap que prove que ele est� errado.

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
  
Exec�cio 10: Hillary afirma que um caminhamento p�s-fixado em um heap listar� as chaves em
ordem n�o-crescente. Apresente um exemplo de um heap que prove que ela est�
errada.

Exerc�cio: 
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
  
Exec�cio 11: Apresente todos os passos do algoritmo para remover a chave 16 do heap abaixo:

Resposta: O heap original �:
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
Com a altera��o na chave 8|16 ele ficar� da seguinte maneira:
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
como o 16X n�o tem nenhum filho ele pode ser retirado da �rvore sem problema algum.

   -------------
  
Exerc�cio 12: Mostre como implementar o TAD pilha usando apenas uma fila de prioridade e uma
vari�vel inteira adicional.

Resposta: ?

   -------------
   
Exerc�cio 13: Mostre como implementar o TAD fila (padr�o) usando apenas uma fila de prioridade e
uma vari�vel inteira adicional.

Resposta: ?

   -------------
   
Exec�cio 14: Qual dos esquemas de tratamento de colis�o de tabela hash consegue tolerar um fator
de carga superior a 1 e qual n�o consegue?

Resposta: O �nico capaz de tolerar � o Hashing Duplo, e o que n�o tolera � o endere�amento aberto.

   -------------
   
Exerc�cio 15: Qual seria um bom c�digo hash para um n�mero de identifica��o de ve�culo que �
uma cadeia de caracteres representando n�meros e letras no formato
�9X9XX99X9XX999999,� onde um �9� representa um d�gito e um �X� representa uma
letra?

Resposta: ?

   -------------

Exerc�cio 16: Desenhe a tabela hash com 11 elementos, que resulta a partir do uso da fun��o de
hash, h(i) = (3i + 5) mod 11, para colocar as chaves 12, 44, 13, 88, 23, 94, 11, 39, 20, 16
e 5, assumindo que as colis�es ser�o tratadas por encadeamento.

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

Exerc�cio 17: Qual ser� o resultado do exerc�cio 3 se assumirmos que as colis�es ser�o tratadas por
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

Exerc�cio 18: Mostre o resultado do exerc�cio 3 assumindo que as colis�es s�o tratadas por teste
quadr�tico, at� o ponto em que o m�todo falha.

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
Falhou em armazenas a chave 5 (�ltima chave).

    -------------
    
Exerc�cio 19: Qual � o resultado do exerc�cio 3 assumindo que as colis�es s�o tratadas por hashing
duplo usando uma fun��o hash secund�ria h�(k)=7 (k mod 7)?

Resposta: ?

    -------------
    
Exerc�cio 20: Forne�a uma descri��o em pseudoc�digo da inser��o em uma tabela hash que usa
teste quadr�tico para resolver colis�es, assumindo que se usa o truque de substituir
elementos deletados com um objeto indicando �item desativado�.

Resposta: ?

    -------------
    
Exec�cio 21: Pesquise sobre o TAD Dicion�rio e descreva a principal diferen�a desse TAD com o TAD
Mapa.

Respostas: A principal diferen�a entre TAD Mapa e o TAD Dicion�rio, � a capacidade do Dicion�rio poder adicionar m�ltiplas entradas para uma mesma chave, que no TAD Mapa s� � poss�vel ter chaves com entradas �nicas.
    
    -------------

Exerc�cio 23: Desafio:
a) Escreva uma classe de verifica��o ortogr�fica que armazena conjuntos de palavras,
W, em uma tabela hash e implementa o m�todo spellCheck(s) que executa uma
verifica��o ortogr�fica sobre a string s relativa ao conjunto de palavras, W.
b) Se s est� em W, ent�o a chamada para spellCheck(s) retorna uma cole��o iter�vel
que cont�m apenas s, assumindo-se que tenha sido grafada corretamente neste
caso.
c) Por outro lado, se s n�o est� em W, ent�o a chamada para spellCheck retona a
cole��o iter�vel de todas as palavras de W que podem corresponder � grafia
correta de s.
d) O programa pode ser capaz de tratar todas as formas normais que s pode omitir
uma palavra em W, incluindo trocar caracteres adjacentes de uma palavra,
inser��o de um �nico caractere entre outros dois, remo��o de um �nico caractere
de uma palavra e substitui��o de um caractere em uma palavra por outro.

Resposta: ? */

