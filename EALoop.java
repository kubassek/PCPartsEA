package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class EALoop {

    public EALoop(Integer population){
        this.mainLoop();
        this.populationSize = population;
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
        this.inistialisePopulation();
        for(int i=0; i<evolutions;i++){

        }
    }

    public void inistialisePopulation(){
        PullPCParts pull = new PullPCParts();
        System.out.println("CPU ========================");
        for(int i=0;i< pull.pcPartsCPU.size();i++){
            System.out.println(pull.pcPartsCPU.get(i).getPartName() + " " + pull.pcPartsCPU.get(i).getPerformace() + " " + pull.pcPartsCPU.get(i).getPrice());
        }

        System.out.println("GPU ========================");
        for(int i=0;i< pull.pcPartsGPU.size();i++){
            System.out.println(pull.pcPartsGPU.get(i).getPartName() + " " + pull.pcPartsGPU.get(i).getPerformace() + " " + pull.pcPartsGPU.get(i).getPrice());
        }

        System.out.println("Drives ========================");
        for(int i=0;i< pull.pcPartsDrive.size();i++){
            System.out.println(pull.pcPartsDrive.get(i).getPartName() + " " + pull.pcPartsDrive.get(i).getPerformace() + " " + pull.pcPartsDrive.get(i).getPrice());
        }

        Random random = new Random();

        for(int i=0;i<populationSize;i++){
            System.out.println("population member==========================================");
            population.add(new PC(pull.pcPartsCPU.get(random.nextInt(pull.pcPartsCPU.size()-1)), pull.pcPartsGPU.get(random.nextInt(pull.pcPartsGPU.size()-1)), pull.pcPartsDrive.get(pull.pcPartsDrive.size()-1)));
            System.out.println(population.get(i).getCpu().getPartName() + " " + population.get(i).getGpu().getPartName() + " " + population.get(i).getDrive().getPartName() + " $" + population.get(i).getPCPrice());
        }
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
