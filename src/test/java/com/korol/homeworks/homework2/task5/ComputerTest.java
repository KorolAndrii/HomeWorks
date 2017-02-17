package com.korol.homeworks.homework2.task5;

import com.korol.homeworks.homework2.task2.CentralProcessingUnit;
import com.korol.homeworks.homework2.task2.OperativeMemory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Somebody on 17.02.2017.
 */
public class ComputerTest {
    private Computer computer;
    private CentralProcessingUnit CPU;
    private OperativeMemory RAM;

    @Before
    public void setUp() {
        computer = new Computer("RAMEC STORM 8-01 W");
        RAM = new OperativeMemory(2000);
        RAM.setMemoryFrequency(20);
        CPU = new CentralProcessingUnit(2.8);
        Computer.ComputerInfo info = computer.new ComputerInfo(OS.MICROSOFT_WINDOWS, CPU, RAM);
        computer.setComputerInfo(info);
    }

    @Test
    public void getComputerInfo() throws Exception {
        Assert.assertEquals("ComputerInfo {operationSystem:MICROSOFT_WINDOWS," +
                                    " cpu:CentralProcessingUnit{frequency=2.8}, RAM:OperativeMemory{memoryFrequency=20.0}}",
                                    computer.getComputerInfo().toString());
    }

}