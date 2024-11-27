package org.example;

public class StateMachine {
    public enum ProcessState {
        Start,
        One,
        Two,
        Three,
        Final
    }
    public ProcessState currentState = ProcessState.Start;

    public String  findLetter(String input) {

        int index = 0;
        String result = "Start ";
        String word = "test";

        System.out.println(currentState);

        for (int i = 0; i < input.length(); i++) {
//            switch (currentState) {
//                case Start -> {
//                    currentState = (input.charAt(i) == 't') ? ProcessState.One : ProcessState.Start;
//                    System.out.println(currentState);
//                }
//                case One -> {
//                    currentState = (input.charAt(i) == 'e') ? ProcessState.Two : ProcessState.Start;
//                    System.out.println(currentState);
//                }
//                case Two -> {
//                    currentState = (input.charAt(i) == 's') ? ProcessState.Three : ProcessState.Start;
//                    System.out.println(currentState);
//                }
//                case Three -> {
//                    currentState = (input.charAt(i) == 't') ? ProcessState.Final : ProcessState.Start;
//                    System.out.println(currentState);
//                }
//                case Final -> {
//                    System.out.println("Final");
//                    return currentState;
//                }
//            }

            switch (currentState) {
                case Start -> {
                    currentState = (input.charAt(i) == 't') ? ProcessState.One : ProcessState.Start;
                    result += (currentState == ProcessState.One) ? "One " : "Start ";
                    System.out.println(currentState);
                }
                case One -> {
                    currentState = (input.charAt(i) == 'e') ? ProcessState.Two : ProcessState.Start;
                    result += (currentState == ProcessState.Two) ? "Two " : "Start ";
                    System.out.println(currentState);
                }
                case Two -> {
                    currentState = (input.charAt(i) == 's') ? ProcessState.Three : ProcessState.Start;
                    result += (currentState == ProcessState.Three) ? "Three " : "Start ";
                    System.out.println(currentState);
                }
                case Three -> {
                    currentState = (input.charAt(i) == 't') ? ProcessState.Final : ProcessState.Start;
                    result += (currentState == ProcessState.Final) ? "Final" : "Start ";
                    System.out.println(currentState);
                }
                case Final -> {
                    return result;
                }
            }
        }

        return result;


    }


}


