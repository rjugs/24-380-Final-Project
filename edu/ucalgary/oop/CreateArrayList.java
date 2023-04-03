package edu.ucalgary.oop;
import java.util.*;

public class CreateArrayList extends ScheduleBuilder {
    
    private ArrayList<Feeding> feedingTasks;
    private ArrayList<PreppedFeeding> preppedFeedingTasks;
    private ArrayList<Cleaning> cleaningTasks;
    private ArrayList<Animal> animals = getAnimalsArray();

    /*
     * CreateArrayList constructor. Instantiates the ArrayLists for feeding tasks,
     * prepped feeding tasks and cleaning tasks. Calls the fillArrays method within the
     * class to populate each array by adding tasks. No arguments.
     */
    public CreateArrayList() {
        this.feedingTasks = new ArrayList<Feeding>();
        this.cleaningTasks = new ArrayList<Cleaning>();
        this.preppedFeedingTasks = new ArrayList<PreppedFeeding>();
        fillArrays();
        
    }

    /*
     * fillArrays method. This method is called only within this class to populate
     * the different ArrayLists that contain different objects. It iterates through each animal in the animals
     * ArrayList<Animal> from the ScheduleBuilder class, and populates the neccessary arraylists by species.
     * No returns and no arguments.   
    */
    public void fillArrays() {
        int i = 0;
        for (Animal animal : animals) {
            String species = animal.getAnimalSpecies();
            if (species == "beaver") {
                feedingTasks.add(new Feeding(i, AnimalSpecies.BEAVER.getStartHour(), 
                    AnimalSpecies.BEAVER.getMaxWindow(), AnimalSpecies.BEAVER.getFeedingDescription()));
                i+=1;
                cleaningTasks.add(new Cleaning(i, AnimalSpecies.BEAVER.getCleaningDescription()));
                i += 1;
            }

            else if (species == "porcupine") {
                feedingTasks.add(new Feeding(i, AnimalSpecies.PORCUPINE.getStartHour(), 
                    AnimalSpecies.PORCUPINE.getMaxWindow(), AnimalSpecies.PORCUPINE.getFeedingDescription()));
                i+=1;
                cleaningTasks.add(new Cleaning(i +=1, AnimalSpecies.PORCUPINE.getCleaningDescription()));
                i+=1;
            }

            else if (species == "fox") {
                preppedFeedingTasks.add(new PreppedFeeding(i, AnimalSpecies.FOX.getStartHour(), 
                    AnimalSpecies.FOX.getMaxWindow(), AnimalSpecies.FOX.getFeedingDescription(), 
                    AnimalSpecies.FOX.getFoodPrepTime()));
                i+=1;
                cleaningTasks.add(new Cleaning(i +=1, AnimalSpecies.FOX.getCleaningDescription()));
                i+=1;
            }
    
            else if (species == "coyote") {
                preppedFeedingTasks.add(new PreppedFeeding(i, AnimalSpecies.COYOTE.getStartHour(), 
                    AnimalSpecies.COYOTE.getMaxWindow(), AnimalSpecies.COYOTE.getFeedingDescription(), 
                    AnimalSpecies.COYOTE.getFoodPrepTime()));
                i+=1;
                cleaningTasks.add(new Cleaning(i +=1, AnimalSpecies.COYOTE.getCleaningDescription()));
                i+=1;
            }

            else if (species == "raccoon") {
                feedingTasks.add(new Feeding(i, AnimalSpecies.RACCOON.getStartHour(), 
                    AnimalSpecies.RACCOON.getMaxWindow(), AnimalSpecies.RACCOON.getFeedingDescription()));
                i+=1;
                cleaningTasks.add(new Cleaning(i +=1, AnimalSpecies.RACCOON.getCleaningDescription()));
                i+=1;
            }
        }
    }

    public ArrayList<Feeding> getFeedingTasks() { return this.feedingTasks; }
    public ArrayList<PreppedFeeding> getPreppedFeedingTasks() { return this.preppedFeedingTasks; }
    public ArrayList<Cleaning> getCleaningTasks() { return this.cleaningTasks; }
}
