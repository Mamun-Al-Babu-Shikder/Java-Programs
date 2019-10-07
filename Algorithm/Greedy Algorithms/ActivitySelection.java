/*
 * given n activities with their start and finish times. 
 * Select the maximum number of activities that can be performed by a single person, 
 * assuming that a person can only work on a single activity at a time.
 */

/*
 * The greedy choice is to always pick the next activity 
 * whose finish time is least among the remaining activities and 
 * the start time is more than or equal to the finish time of previously selected activity. 
 * We can sort the activities according to their finishing time so that 
 * we always consider the next activity as minimum finishing time activity.
 */

public class ActivitySelection
{
	public static void main(String[] args)
	{
		/*
		 * Let's consider two array with start time and finish time of activity,
		 * They are sorted according to finish time. 
		 * start time <= finish time
		 */
		int start[]  =  {1, 3, 4, 0, 5, 8, 5,  8,  9};
	    int finish[] =  {2, 4, 5, 6, 7, 9, 9, 10, 12};	
	    
	    int i, j, len;
	    len = start.length;
	    
	    System.out.println("Following activitys are selected :");
	    /*
	     * We always select first activity
	     * Here, first activity index is 0
	     */
	    i = 0;
	    System.out.print(i+", ");
	    
	    for(j=1; j<len; j++) {
	    	
	    	/*
	    	 * We select those activity which start time is equal or
	    	 * grater than previous selected activity.
	    	 */
	    	if(start[j]>=finish[i]) {
	    		i = j;
	    		System.out.print(i+", ");
	    	}
	    }
	}
}