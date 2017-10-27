package com.company;

public class PC {

    public PC(){
    }

    private PCParts cpu;
    private PCParts gpu;
    private PCParts drive;

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
