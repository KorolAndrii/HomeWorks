package com.korol.homeworks.homework2.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Somebody on 15.02.2017.
 */
public class ComputerTest {
    private Computer computer;
    private OperativeMemory RAM;
    private HardDriveDisk HDD1;
    private HardDriveDisk HDD2;
    private DiscDrive discDrive;
    private CentralProcessingUnit CPU;
    private String expected;

    @Before
    public void setUp() {
        RAM = new OperativeMemory(2000);
        HDD1 = new HardDriveDisk(1000000000);
        HDD2 = new HardDriveDisk(500000000);
        HDD1.addVirus(Virus.BRAIN);
        HDD1.addVirus(Virus.ILOVEYOU);
        HDD2.addVirus(Virus.MORRIS);
        HDD2.addVirus(Virus.SASSER);
        discDrive = new DiscDrive(24);
        CPU = new CentralProcessingUnit(2.8);
        computer = new Computer(CPU, discDrive, RAM, HDD1);
        computer.addHardDrives(HDD2);
        expected = "I found 4 viruses";
    }

    @Test
    public void checkForViruses() throws Exception {
        Assert.assertEquals(expected, computer.checkForViruses());
    }

    @Test
    public void hddCapacity() throws Exception {
        assertEquals(1500000000, computer.hddCapacity());
    }

}