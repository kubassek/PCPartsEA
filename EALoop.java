package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EALoop {

    public EALoop(){
        this.mainLoop();
    }

    public ArrayList<PCParts> possibleCpu = new ArrayList<PCParts>();
    public ArrayList<PCParts> possibleGpu = new ArrayList<PCParts>();
    public ArrayList<PCParts> possibleDrives = new ArrayList<PCParts>();

    public int evolutions;
    public int populationSize;
    public ArrayList<PC> population = new ArrayList<PC>();
    public double mutationChance;
    public double mutationRate;

    public void mainLoop(){
        for(int i=0; i<evolutions;i++){

        }
    }

    public void inistialisePopulation(){

    }

    public void selectParents(){

    }

    public ArrayList<PC> combineParents(){
        ArrayList<PC> childrenPC = new ArrayList<PC>();

        return childrenPC;
    }

    public PC mutate(PC childPC){
     PC mutatedPC = childPC;

     return mutatedPC;
    }

    public void addPCtoPop(PC pc){

    }
}
