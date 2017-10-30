package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class EALoop {

    public EALoop(Integer population, Integer evolutions){
        this.populationSize = population;
        this.evolutions = evolutions;
        this.mainLoop();
    }

    public ArrayList<PCParts> possibleCpu = new ArrayList<PCParts>();
    public ArrayList<PCParts> possibleGpu = new ArrayList<PCParts>();
    public ArrayList<PCParts> possibleDrives = new ArrayList<PCParts>();

    private Random random = new Random();
    public int evolutions;
    public int populationSize;
    public ArrayList<PC> population = new ArrayList<PC>();
    public double mutationChance;
    public double mutationRate;

    public void mainLoop(){
        this.inistialisePopulation();
        for(int i=0; i<evolutions;i++){
            ArrayList<PC> parents = new ArrayList<PC>();
            ArrayList<PC> children = new ArrayList<PC>();
            parents = this.selectParents();
            children = this.combineParents(parents);
        }
    }

    public void inistialisePopulation(){
        PullPCParts pull = new PullPCParts();

        /*
        Print all pc parts

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
        */

        //Generate a new random population and print results



        for(int i=0;i<populationSize;i++){
            //System.out.println("population member==========================================");
            population.add(new PC(pull.pcPartsCPU.get(random.nextInt(pull.pcPartsCPU.size()-1)), pull.pcPartsGPU.get(random.nextInt(pull.pcPartsGPU.size()-1)), pull.pcPartsDrive.get(pull.pcPartsDrive.size()-1)));
            //System.out.println(population.get(i).getCpu().getPartName() + " " + population.get(i).getGpu().getPartName() + " " + population.get(i).getDrive().getPartName() + " $" + population.get(i).getPCPrice() + " fitness value: " + population.get(i).getFitness());
        }
    }

    public ArrayList<PC> selectParents(){
        ArrayList<PC> parents = new ArrayList<PC>();

        parents.add(population.get(random.nextInt(populationSize)));
        parents.add(population.get(random.nextInt(populationSize)));

        return parents;
    }

    public ArrayList<PC> combineParents(ArrayList<PC> parents){
        ArrayList<PC> childrenPC = new ArrayList<PC>();

        int randomCpu = random.nextInt(1);
        int randomGpu = random.nextInt(1);
        int randomDrive = random.nextInt(1);

        childrenPC.add(new PC(parents.get(randomCpu).getCpu(),parents.get(randomGpu).getGpu(),parents.get(randomDrive).getDrive()));
        childrenPC.add(new PC(parents.get(this.switchRandom(randomCpu)).getCpu(),parents.get(this.switchRandom(randomGpu)).getGpu(),parents.get(this.switchRandom(randomDrive)).getDrive()));

        return childrenPC;
    }

    public int switchRandom(int random){
        if(random == 0) return 1;
        else return 0;
    }

    public void repopulation(ArrayList<PC> children){
        
    }

    public PC mutate(PC childPC){
     PC mutatedPC = childPC;

     return mutatedPC;
    }

    public void addPCtoPop(PC pc){

    }
}
