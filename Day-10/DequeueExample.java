package com.day10;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DequeueExample {

	public static void main(String[] args) {
		Deque <Integer> deque = new LinkedList<>();
		
		deque.offer(10);
		deque.offer(20);
		deque.offer(30);
		
		deque.offerFirst(50);
		deque.offerFirst(90);
		
		deque.offerLast(80);
		
		System.out.println(deque);

		deque.poll();
		deque.pollFirst();
		System.out.println(deque);
		
		
		deque.pollLast();
		
		System.out.println(deque);
	
		
		PriorityQueue <Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
		
		pqueue.offer(90);
		pqueue.offer(150);
		pqueue.offer(30);
		pqueue.offer(90);
		pqueue.offer(40);
		//pqueue.offer(null);
		
		
		System.out.println(pqueue);

		pqueue.poll();
		
		System.out.println(pqueue);
		
	}

}
