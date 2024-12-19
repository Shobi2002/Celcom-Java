package com.day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue <Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(10);
		queue.add(90);
		queue.add(null);
		
		//queue.clear();
		
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.remove(10));
		System.out.println(queue);
		
		
		
		
		queue.poll();
		System.out.println(queue);


	}

}
