package tad_arvore_binaria_completa;

import java.util.ArrayList;
import java.util.Iterator;

import exceptions.BoundaryViolationException;
import exceptions.EmptyTreeException;
import exceptions.InvalidPositionException;
import commons.CompleteBinaryTree;
import tad_lista_de_nodos.NodePositionList;
import tad_lista_de_nodos.Position;
import tad_lista_de_nodos.PositionList;

//Uma implementa��o veloz da interface CompleteBinaryTree usando um vetor. Dentro do vetor, existe um elemento null
//no rank 0, a raiz no rank 1, e o resto da �rvore est� contida como segue. Se n tem rank i, ent�o o filho esquerdo
//de n ter� rank 2*i, e o filho direito de n ter� rank 2*i + 1. Percorrer o conte�do do vetor em ordem crescente
//de classifica��o resulta em uma travessia de ordem de n�vel.

public class ArrayListCompleteBinaryTree<T> implements CompleteBinaryTree<T> {

	protected ArrayList<BTPos<T>> T; // Lista indexada dos posi��es da �rvore

	// Classe aninhada para um indice para um nodo de �rvore bin�ria
	// completa baseado em lista.
	protected static class BTPos<E> implements Position<E> {
		E element; // elemento armazenado nesta posi��o
		int index; // �ndice desta posi��o na lista de array
		public BTPos(E elt, int i) {
			element = elt;
			index = i;
		}
		public E element() {
			return element;
		}
		public int index() {
			return index;
		}
		public E setElement(E elt) {
			E temp = element;
			element = elt;
			return temp;
		}
		public String toString() {
			return ("[" + element + "," + index + "]");
		}
	}

	public ArrayListCompleteBinaryTree() {
		T = new ArrayList<BTPos<T>>();
		T.add(0, null); // a localiza��o em rank 0 � considerada vazia
	}
	// Retorna o n�mero de nodos da �rvore bin�ria
	public int size() {
		return T.size() - 1;
	}
	// Retorna se a �rvore est� vazia
	public boolean isEmpty() {
		return (size() == 0);
	}
	// Retorna se v � um nodo interno
	public boolean isInternal(Position<T> v) throws InvalidPositionException {
		return hasLeft(v); // Se v tiver um filho esquerdo, ele ser� interno
	}
	// Retorna se v � um nodo externo
	public boolean isExternal(Position<T> v) throws InvalidPositionException {
		return !isInternal(v);
	}
	// Determina se uma dada posi��o � um nodo v�lido
	protected BTPos<T> checkPosition(Position<T> v) throws InvalidPositionException {
		if (v == null || !(v instanceof BTPos))
			throw new InvalidPositionException("Position is invalid");
		return (BTPos<T>) v;
	}
	// Retorna se v � raiz
	public boolean isRoot(Position<T> v) throws InvalidPositionException {
		BTPos<T> vv = checkPosition(v);
		return vv.index() == 1;
	}
	// Retorna se v tem um filho esquerdo
	public boolean hasLeft(Position<T> v) throws InvalidPositionException {
		BTPos<T> vv = checkPosition(v);
		return 2 * vv.index() <= size();
	}
	// Retorna se v tem um filha direito
	public boolean hasRight(Position<T> v) throws InvalidPositionException {
		BTPos<T> vv = checkPosition(v);
		return 2 * vv.index() + 1 <= size();
	}
	/** Returns the root of the tree. */
	public Position<T> root() throws EmptyTreeException {
		if (isEmpty())
			throw new EmptyTreeException("Tree is empty");
		return T.get(1);
	}
	// Retorna o filho esquerdo de v
	public Position<T> left(Position<T> v) throws InvalidPositionException, BoundaryViolationException {
		if (!hasLeft(v))
			throw new BoundaryViolationException("No left child");
		BTPos<T> vv = checkPosition(v);
		return T.get(2 * vv.index());
	}
	// Retorna o filho direito de v
	public Position<T> right(Position<T> v) throws InvalidPositionException {
		if (!hasRight(v))
			throw new BoundaryViolationException("No right child");
		BTPos<T> vv = checkPosition(v);
		return T.get(2 * vv.index() + 1);
	}
	// Retorna o pai de v
	public Position<T> parent(Position<T> v) throws InvalidPositionException, BoundaryViolationException {
		if (isRoot(v))
			throw new BoundaryViolationException("No parent");
		BTPos<T> vv = checkPosition(v);
		return T.get(vv.index() / 2);
	}
	// Retorna a cole��o iter�vel de filhos de v
	public Iterable<Position<T>> children(Position<T> v) throws InvalidPositionException {
		PositionList<Position<T>> children = new NodePositionList<Position<T>>();
		if (hasLeft(v))
			children.addLast(left(v));
		if (hasRight(v))
			children.addLast(right(v));
		return children;
	}
	// Retorna a cole��o iter�vel de todos os nodos da �rvore
	public Iterable<Position<T>> positions() {
		ArrayList<Position<T>> P = new ArrayList<Position<T>>();
		Iterator<BTPos<T>> iter = T.iterator();
		iter.next(); // Pula a primeira posi��o
		while (iter.hasNext())
			P.add(iter.next());
		return (Iterable<Position<T>>) P;
	}
	// Troca o elemento de v
	public T replace(Position<T> v, T o) throws InvalidPositionException {
		BTPos<T> vv = checkPosition(v);
		return vv.setElement(o);
	}
	// Adiciona um elemento exatamente ap�s o �ltimo nodo
	public Position<T> add(T e) {
		int i = size() + 1;
		BTPos<T> p = new BTPos<T>(e, i);
		T.add(i, p);
		return p;
	}
	// Remove e retorna o elemento no do �ltimo nodo
	public T remove() throws EmptyTreeException {
		if (isEmpty())
			throw new EmptyTreeException("Tree is empty");
		return T.remove(size()).element();
	}
	// Retorna o irm�o de v
	public Position<T> sibling(Position<T> v) throws InvalidPositionException, BoundaryViolationException {
		try {
			Position<T> p = parent(v);
			Position<T> lc = left(p);
			if (v == lc)
				return right(p);
			else
				return lc;
		} catch (BoundaryViolationException e) {
			throw new BoundaryViolationException("Node has no sibling");
		}
	}
	// Troca os elementos de dois nodos
	public void swapElements(Position<T> v, Position<T> w) throws InvalidPositionException {
		BTPos<T> vv = checkPosition(v);
		BTPos<T> ww = checkPosition(w);
		T temp = vv.element();
		vv.setElement(ww.element());
		ww.setElement(temp);
	}
	// Retorna um iterator dos elementos armazenados em todos os nodos da �rvore
	public Iterator<T> iterator() {
		ArrayList<T> list = new ArrayList<T>();
		Iterator<BTPos<T>> iter = T.iterator();
		iter.next(); // skip the first element
		while (iter.hasNext())
			list.add(iter.next().element());
		return list.iterator();
	}
	// Retorna uma string representando esta �rvore bin�ria completa
	public String toString() {
		return T.toString();
	}
}