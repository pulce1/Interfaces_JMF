package Program2;

public class Process implements Priority, Comparable<Process>{
	private String processID;
	private int priority;

	public Process()
	{
		this.processID = "";
		this.priority = 0;
	}//end empty argument constructor
	
	public Process(String processID, int priority)
	{
		this.processID = processID;
		this.priority = priority;
	}//end preferred argument constructor
	
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcess
	public int getPriority() {
		return priority;
	}//end getPriority
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
	@Override
	public int compareTo(Process rhs)
	{

		Process that = (Process)rhs;


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
