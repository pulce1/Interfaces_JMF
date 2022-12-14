/**
 * @author james Frayser
 * Summer 2022
 * Program 2
 * Application.java
 */
package Program2;

import Program2.Task.Status;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		/**
		 * array lists for both the tasks and processes so it fills like a list 
		 */
		ArrayList<Task> tasks = new ArrayList<Task>();
		ArrayList<Process> processes = new ArrayList<Process>();
		
		
		/**
		 * Setting up prints of the toString as a blanket for the printing of the array
		 */
		Task t1 = new Task("Mow Lawn", Priority.MED_PRIORITY, Status.NOT_STARTED);
		System.out.println(t1.toString());
		Process p1 = new Process("VWXYZ", Priority.MED_PRIORITY);
		System.out.println(p1.toString());
		Task t2 = new Task("Fix Roof", Priority.MAX_PRIORITY, Status.IN_PROCESS);
		System.out.println(t2.toString());
		Process p2 = new Process("HRAS", Priority.MAX_PRIORITY);
		System.out.println(p2.toString());
		Task t3 = new Task("Go to gym", Priority.MED_PRIORITY, Status.NOT_STARTED);
		System.out.println(t3.toString());
		Process p3 = new Process("GYM", Priority.MED_PRIORITY);
		System.out.println(p3.toString());
		
		/**
		 * adding the different tasks and processes to the array list
		 */
		tasks.add(t1);
		processes.add(p1);
		tasks.add(t2);
		processes.add(p2);
		tasks.add(t3);
		processes.add(p3);
		
		
		//prints out the tasks in order of priority from the array list
		Collections.sort(tasks, Collections.reverseOrder());
 
		/**
		 * Iterator used to list the tasks and processes in order of priority from an array
		 */
		Iterator<Task> tsk = tasks.iterator();
		
 
		System.out.println("Tasks listed by order of priority: ");
		while(tsk.hasNext())
		{
		System.out.println(tsk.next());
		}
		
		//prints out the processes in order of priority from the array list
		Collections.sort(processes, Collections.reverseOrder());
		 
		Iterator<Process> pro = processes.iterator();
		
 
		System.out.println("Processes listed by order of priority: ");
		while(pro.hasNext())
		{
		System.out.println(pro.next());
		}
		
		
		/**
		 * compareTo for all the tasks and processes to find out which has more priority
		 */
		int compare = t1.compareTo(t2);
		
				if(compare == 0)
					System.out.println("Fix Roof and Mow lawn are equal priority");
				else if(compare < 0)
					System.out.println("Fix Roof is greater priority than Mow lawn");
				else 
					System.out.println("Mow lawn is greater priority than Fix Roof");
				
		compare = t1.compareTo(t3);
				
				if(compare == 0)
					System.out.println("Go to gym and Mow lawn are equal priority");
				else if(compare < 0)
					System.out.println("Go to gym is greater priority than Mow lawn");
				else 
					System.out.println("Mow lawn is greater priority than Go to gym");
				
		compare = t2.compareTo(t3);
				
				if(compare == 0)
					System.out.println("Go to gym and Mow lawn are equal priority");
				else if(compare < 0)
					System.out.println("Go to gym is greater priority than Fix Roof");
				else 
					System.out.println("Fix Roof is greater priority than Go to gym");
				
		compare = p1.compareTo(p2);
				
			if(compare == 0)
				System.out.println("P1 and P2 are equal priority");
			else if(compare < 0)
				System.out.println("P2 is greater priority than P1");
			else 
				System.out.println("P1 is greater priority than P2");
				
		compare = p1.compareTo(p3);
				
				if(compare == 0)
					System.out.println("P1 and P3 are equal priority");
				else if(compare < 0)
					System.out.println("P3 is greater priority than P1");
				else 
					System.out.println("P1 is greater priority than P3");
				
		compare = p2.compareTo(p3);
				
				if(compare == 0)
					System.out.println("P2 and P3 are equal priority");
				else if(compare < 0)
					System.out.println("P3 is greater priority than P2");
				else 
					System.out.println("P2 is greater priority than P3");
				
		//end compareTo
		
		
	
	}//end main

}//end class
