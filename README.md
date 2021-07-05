# Exercício: Testes de Unidade

Professor: João Eduardo Montandon

**Objetivo: Nesta lista, você irá experimentar o uso da ferarmenta jUnit para implementação de testes de unidade em Java.**

## 01: Classe Stack

Nosso projeto contem a implementação de uma pilha no arquivo `Stack.java`.
Ao se analisar internamente, observamos que essa pilha se utiliza de uma `List` para armazenar os dados da pilha; ainda o atributo `topo` é responsável por identificar a posição do topo da pilha e que, portanto, será o elemento a ser desempilhado.

Essa classe possui implementado os seguintes métodos:
* `empilhar(x)`: responsável por empilhar um item na pilha.
* `desempilhar()`: responsável por desempilhar um item da pilha.
* `estaVazia()`: verificar se a pilha está realmente vazia.
* `tamanho()`: retorna o número de elementos da pilha.

O projeto também apresenta uma classe responsável por testar os métodos dessa pilha, presente no arquivo `StackTest.java`.
Contudo, a classe está sem nenhum teste implementado.


### Implementando testes para a classe `Stack` 

Você deverá implementar testes de unidade para verificar a funcionalidade dos métodos presentes na classe `Stack`. 
Para isso você utilizará a biblioteca **jUnity**, já devidamente configurada para este projeto.
Seus testes deverão verificar o funcionamento dos seguintes cenários:

* Verificar se a pilha está vazia
* Verificar se a pilha não está vazia
* Os elementos estão sendo empilhados corretamente
* Os elementos estão sendo desempilhados corretamente
* Se é retornado uma exceção do tipo `Exception` durante uma tentativa de desempilhar uma pilha vazia

*OBS: Durante a implementação dos testes é possível que um ou outro método esteja implementado incorretamente. Você deverá corrigir os erros que encontrar.*

## 02: Aplicando TDD na implementação da classe `Queue`

Nosso projeto também deverá prover uma classe `Queue` que implemente o funcionamento de filas.
Contudo, ao abrir seu arquivo, observamos que nada foi implementado para essa classe.
Certamente obra de um desenvolvedor muito desatento! :thinking:

Por outro lado, esse mesmo desenvolvedor deixou os testes da classe devidamente implementados no aruqivo `QueueTest.java`.

Baseado nas informações presentes nos métodos de teste, aplique a técnica de desenvolvimento orientado a testes para implementar as funcionalidades da classe `Queue`.