package com.geektrust.learning;

public class Operations {
    OperationsPerformer operationsPerformer = new OperationsPerformer();
    String[] splitInput;
    String option;
    public void select(String input) {
        splitInput = input.split("\\s");
        option=splitInput[0];
        switch (option){
            case "BOOK":
                operationsPerformer.bookRoom(splitInput);
            break;

            case "VACANCY":
                operationsPerformer.roomVacancy(splitInput);
            break;

        }
    }
}
