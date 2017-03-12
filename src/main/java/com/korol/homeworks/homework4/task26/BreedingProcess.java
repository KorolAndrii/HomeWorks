package com.korol.homeworks.homework4.task26;


public class BreedingProcess {
    ColonyOfBacteria colony = new ColonyOfBacteria();

    public ColonyOfBacteria startBreedingProcess(int cycles) {
        for (int i = 0; i < cycles; i++) {
            if (i % 2 == 0) {
                colony.add(BacteriumFactory.getBacterium(BacteriumForm.STELLATE));
            } else if (i % 3 == 0) {
                colony.add(BacteriumFactory.getBacterium(BacteriumForm.BACOLIFORM));
            } else if (i % 4 == 0) {
                colony.add(BacteriumFactory.getBacterium(BacteriumForm.CRIMPED));
            } else if (i % 5 == 0) {
                colony.add(BacteriumFactory.getBacterium(BacteriumForm.ROUNDED));
            }
        }
        return colony;
    }
}
