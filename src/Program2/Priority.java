package Program2;

public interface Priority {
	//setting up priority values
	static final int MED_PRIORITY = 5;
    static final int MAX_PRIORITY = 10;
    static final int MIN_PRIORITY = 1;
    
    
    //getters and setters for priority
    public int getPriority ();
    
    public void setPriority (int priority);
}//end main
