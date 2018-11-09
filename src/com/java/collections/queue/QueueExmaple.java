package com.java.collections.queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class QueueExmaple {

	public static void main(String[] args) {

		PriorityQueue<Employee> queue = new PriorityQueue<>();
		queue.add(new Employee(10L, "Steve", LocalDate.now()));
		queue.add(new Employee(11L, "Mike", LocalDate.now()));
		queue.add(new Employee(124L, "Pual", LocalDate.now()));
		queue.add(new Employee(189L, "Smith", LocalDate.now()));
		queue.add(new Employee(10L, "Steve", LocalDate.now()));

		while (true) {
			Employee e = queue.poll();
			System.out.println(e);
			if (e == null)
				break;

		}
	}

}
