package edu.ucalgary.oop;

public class Cleaning {
    /*
     * Cleaning class populates a Task ArrayList of type ArrayList<Task> that contains all 
     * the cleaning tasks for a given database. This is the lowest priority task.
    */
    private final int UNIQUEID;
    private String description;

    /*
     * Cleaning object constructor. Recieves arguments of type (int, String) and sets the 
     * private variables TASKID and description.
     */
    public Cleaning(int uniqueID, String description) {
        this.UNIQUEID = uniqueID;
        this.description = description;
    }

    /*
     * Getters. No arguments, getTaskID() returns int and getDescription() returns String.
     */
    public int getTaskID() { return this.UNIQUEID; }
    public String getDescription() { return this.description; }
    
}
