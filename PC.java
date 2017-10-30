package com.company;

public class PC {

    public PC(PCParts cpu, PCParts gpu, PCParts drive){

        this.cpu = cpu;
        this.gpu = gpu;
        this.drive = drive;
        this.PCPrice = cpu.getPrice() + gpu.getPrice() + drive.getPrice();
    }

    private PCParts cpu;
    private PCParts gpu;
    private PCParts drive;
    private double PCPrice = 0;

    public double getPCPrice() {
        return PCPrice;
    }

    public PCParts getCpu() {
        return cpu;
    }

    public void setCpu(PCParts cpu) {
        this.cpu = cpu;
    }

    public PCParts getGpu() {
        return gpu;
    }

    public void setGpu(PCParts gpu) {
        this.gpu = gpu;
    }

    public PCParts getDrive() {
        return drive;
    }

    public void setDrive(PCParts drive) {
        this.drive = drive;
    }
}
