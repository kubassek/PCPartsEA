package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PullPCParts {

    public PullPCParts(){
        this.readPartsData();

        System.out.println("CPU ========================");
        for(int i=0;i< pcPartsCPU.size();i++){
            System.out.println(pcPartsCPU.get(i).getPartName() + " " + pcPartsCPU.get(i).getPerformace() + " " + pcPartsCPU.get(i).getPrice());
        }
        System.out.println("GPU ========================");
        for(int i=0;i< pcPartsGPU.size();i++){
            System.out.println(pcPartsGPU.get(i).getPartName() + " " + pcPartsGPU.get(i).getPerformace() + " " + pcPartsGPU.get(i).getPrice());
        }
        System.out.println("Drives ========================");
        for(int i=0;i< pcPartsDrive.size();i++){
            System.out.println(pcPartsDrive.get(i).getPartName() + " " + pcPartsDrive.get(i).getPerformace() + " " + pcPartsDrive.get(i).getPrice());
        }
    }

    private ArrayList<PC> pcPartsCPU = new ArrayList<PC>();
    private ArrayList<PC> pcPartsGPU = new ArrayList<PC>();
    private ArrayList<PC> pcPartsDrive = new ArrayList<PC>();

    private ArrayList<String> fileLocations = new ArrayList<String>();

    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";

    public void readPartsData(){
        try {

            fileLocations.add("/Users/jakubsobczak/IdeaProjects/PCPartsEA/CPU.csv");
            fileLocations.add("/Users/jakubsobczak/IdeaProjects/PCPartsEA/GPU.csv");
            fileLocations.add("/Users/jakubsobczak/IdeaProjects/PCPartsEA/HDD.csv");

            for(int i=0;i<3;i++) {

                br = new BufferedReader(new FileReader(fileLocations.get(i)));
                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] partsCPU = line.split(cvsSplitBy);
                    String[] partsGPU = line.split(cvsSplitBy);
                    String[] partsDrive = line.split(cvsSplitBy);
                    if(i==0) pcPartsCPU.add(new PC(partsCPU[0], Double.parseDouble(partsCPU[1]), Double.parseDouble(partsCPU[2])));
                    if(i==1)pcPartsGPU.add(new PC(partsGPU[0], Double.parseDouble(partsGPU[1]), Double.parseDouble(partsGPU[2])));
                    if(i==2)pcPartsDrive.add(new PC(partsDrive[0], Double.parseDouble(partsDrive[1]), Double.parseDouble(partsDrive[2])));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
