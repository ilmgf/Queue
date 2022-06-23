package com.revature.collections.examples.Queue;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> myQ = new ArrayDeque<String>();
		myQ.add("z");
		myQ.add("j");
		myQ.add("d");
		myQ.add("k");
		myQ.add("b");
		myQ.add("n");
		
		//THE METHOD .poll() RETRIEVES AND REMOVES THE HEAD (FIRST ELEMENT) OF THE QUEUE
		System.out.println("poll() method: " + myQ.poll());
		//THE METHOD .peek() RETRIEVES BUT DOES NOT REMOVE THE HEAD OF THE QUEUE
		//SINCE Z WAS REMOVED BECAUSE OF .poll() J IS THE NEW HEAD
		System.out.println("peek() method: " + myQ.peek());
		/*THE METHOD .element() RETRIEVES BUT DOES NOT REMOVE THE HEAD OF THE QUEUE
		 BUT UNLIKE .peek() THROWS AN EXCEPTION IF THE HEAD DOES NOT EXIST */
		System.out.println("element() method: " + myQ.element());
		/*THE METHOD .remove() RETRIEVES AND REMOVES THE HEAD OF THE QUEUE
		  J IS NOW REMOVED AS THE HEAD OF THE QUEUE */
		System.out.println("remove() method: " + myQ.remove());
		//PRINTS EVERY REMAINING ELEMENT OF THE QUEUE
		System.out.print("\n" + "Remaining Queue: ");
		for(String i : myQ)
			System.out.print(i + ", ");
		
	}

}
