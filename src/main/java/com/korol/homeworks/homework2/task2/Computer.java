package com.korol.homeworks.homework2.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Somebody on 14.02.2017.
 */
public class Computer {
    private boolean power;
    private CentralProcessingUnit processor;
    private DiscDrive discDrive;
    private List<OperativeMemory> operativeMemories = new ArrayList<>();
    private List<HardDriveDisk> hardDrives = new ArrayList<>();

    public Computer(CentralProcessingUnit processor, DiscDrive discDrive,
                    OperativeMemory operativeMemories, HardDriveDisk hardDrives) {
        this.processor = processor;
        this.discDrive = discDrive;
        addHardDrives(hardDrives);
        addOperativeMemories(operativeMemories);
    }

    public CentralProcessingUnit getProcessor() {
        return processor;
    }

    public void setProcessor(CentralProcessingUnit processor) {
        this.processor = processor;
    }

    public DiscDrive getDiscDrive() {
        return discDrive;
    }

    public void setDiscDrive(DiscDrive discDrive) {
        this.discDrive = discDrive;
    }

    public List<OperativeMemory> getOperativeMemories() {
        return operativeMemories;
    }

    public void addOperativeMemories(OperativeMemory RAM) {
        operativeMemories.add(RAM);
    }

    public List<HardDriveDisk> getHardDrives() {
        return hardDrives;
    }

    public void addHardDrives(HardDriveDisk HDD) {
        hardDrives.add(HDD);
    }

    public void on() {
        power = true;
    }

    public void off() {
        power = false;
    }

    public String checkForViruses() {
        int count = 0;
        for (HardDriveDisk element : hardDrives) {
            count += element.getViruses().size();
        }
        return "I found " + count + " viruses";
    }

    public int hddCapacity() {
        int capacity = 0;
        for (HardDriveDisk element : hardDrives) {
            capacity += element.getCapacity();
        }
        return capacity;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "power=" + power +
                ", processor=" + processor + ",\n" +
                "discDrive=" + discDrive +
                ", operativeMemories=" + operativeMemories  + ",\n" +
                "hardDrives=" + hardDrives +
                '}';
    }
}
