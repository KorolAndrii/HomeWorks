package com.korol.homeworks.homework2.task5;

import com.korol.homeworks.homework2.task2.CentralProcessingUnit;
import com.korol.homeworks.homework2.task2.OperativeMemory;

/**
 * Created by Somebody on 16.02.2017.
 */
public class Computer {
    private String model;
    private ComputerInfo computerInfo;

    public Computer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ComputerInfo getComputerInfo() {
        return computerInfo;
    }

    public void setComputerInfo(ComputerInfo computerInfo) {
        this.computerInfo = computerInfo;
    }

    class ComputerInfo {
        private OS operationSystem;
        private CentralProcessingUnit cpu;
        private OperativeMemory RAM;

        public ComputerInfo(OS operationSystem, CentralProcessingUnit cpu, OperativeMemory RAM) {
            this.operationSystem = operationSystem;
            this.cpu = cpu;
            this.RAM = RAM;
        }

        @Override
        public String toString() {
            return "ComputerInfo {" +"operationSystem:" + operationSystem +
                    ", cpu:" + cpu +
                    ", RAM:" + RAM + '}';
        }

        public OS getOperationSystem() {
            return operationSystem;
        }

        public void setOperationSystem(OS operationSystem) {
            this.operationSystem = operationSystem;
        }

        public CentralProcessingUnit getCpu() {
            return cpu;
        }

        public void setCpu(CentralProcessingUnit cpu) {
            this.cpu = cpu;
        }

        public OperativeMemory getRAM() {
            return RAM;
        }

        public void setRAM(OperativeMemory RAM) {
            this.RAM = RAM;
        }
    }

    public static void main(String[] args) {
       Computer computer = new Computer("RAMEC STORM 8-01 W");
       OperativeMemory RAM = new OperativeMemory(2000);
       CentralProcessingUnit CPU = new CentralProcessingUnit(2.8);
        Computer.ComputerInfo info = computer.new ComputerInfo(OS.MICROSOFT_WINDOWS, CPU, RAM);
        computer.setComputerInfo(info);
        System.out.println(computer.getComputerInfo());
    }
}
