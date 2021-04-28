package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import tad_fila_prioridade_heap.HeapPriorityQueue;

class HeapPriorityQueueTestEx2 {

	@Test
	void Ex_02() {
		HeapPriorityQueue<Integer, Character> X = new HeapPriorityQueue<Integer, Character>();
		X.insert(5, 'A');
		X.insert(4, 'B');
		X.insert(7, 'I');
		X.insert(1, 'D');
		assertEquals("(1,D)", X.removeMin().toString());
		X.insert(3, 'J');
		X.insert(6, 'L');
		assertEquals("(3,J)", X.removeMin().toString());
		assertEquals("(4,B)", X.removeMin().toString());
		X.insert(8, 'G');
		assertEquals("(5,A)", X.removeMin().toString());
		X.insert(2, 'H');
		assertEquals("(2,H)", X.removeMin().toString());
		assertEquals("(6,L)", X.removeMin().toString());
		
		assertEquals("[null, [(7,I),1], [(8,G),2]]", X.toString());
	}
}
