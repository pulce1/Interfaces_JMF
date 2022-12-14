/**
 * @author james Frayser
 * Summer 2022
 * Program 2
 * Task.java
 */
package Program2;


public class Task implements Priority, Comparable<Task>
{
	enum Status {
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE,
	}//end enum Status
	
	private int priority;
	private String name;
	public Status status;
	//end instance fields
	/**
	 * Empty argument constructor
	 * @param name
	 * @param priority 
	 */
	public Task () {
		this.name = "";
		this.priority = 0;
	}//end empty argument constructor
	/**
	 * Preffered argument constructors
	 * @param name
	 * @param priority
	 * @param status
	 */
	public Task (String name, int priority, Status status) {
		this.name = name;
		this.priority = priority;
		this.status = status;
		if(this.priority < MIN_PRIORITY)
			this.priority = MIN_PRIORITY;
		else if(this.priority > MAX_PRIORITY)
			this.priority = MAX_PRIORITY;
		else if(this.priority > MIN_PRIORITY && this.priority < MAX_PRIORITY)
			this.priority = MED_PRIORITY;
	}//end proffered argument constructor
	
	
	
	public int getPriority() {
		return priority;
	}//end getPriority

	/**
	 * setPriority here to set up if a priority is equal or not to MIN, MED, or MAX priority
	 */
	public void setPriority(int priority) {
		if(priority >= MIN_PRIORITY && priority <= MAX_PRIORITY)
			this.priority = priority;
	}//end setPriority

	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	public Status getStatus() {
		return status;
	}//end getStatus

	/**
	 * utilizing enum Status as a constant
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}//end setStatus
	

	@Override
	/**
	 * toString to be able to print out in the application class.
	 */
	public String toString() {
		return "Priority = " + priority + ", Task name = " + name + ", status = " + status;
	}//end toString
	
	/**
	 * compareTo to compare whether one task has more priority
	 */
	public int compareTo(Task rhs)
	{

		Task that = (Task)rhs;


		int thisResult = (int)this.priority;

		int thatResult = (int)that.priority;

		if(Math.abs(thisResult-thatResult) < 0.0001)
			return 0;
		
		else if(thisResult - thatResult < 0)
			return -1;
		
		else 
			return 1;

		}//end compareTo
		
}//end class
