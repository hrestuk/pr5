package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        StateMachine stateMachine = new StateMachine();
        String input = "test";
        stateMachine.findLetter(input);

        System.out.println("\nCurrent state: "+stateMachine.currentState);


    }



}