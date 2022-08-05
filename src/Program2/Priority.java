package Program2;
/**
 * @author james Frayser
 * Summer 2022
 * Program 2
 * Priority.java
 */
public interface Priority {
	//setting up priority values
	static final int MED_PRIORITY = 5;
    static final int MAX_PRIORITY = 10;
    static final int MIN_PRIORITY = 1;
    
    
    /**
     * getters and setters for priority
     * @return
     */
    public int getPriority ();
    
    public void setPriority (int priority);
}//end main
