/*
 *   Code implemented by:
 *       Fredson Bandeira
 *       Walter dos Santos
 * */



package ch.idsia.agents.controllers;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.human.CheaterKeyboardAgent;
import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.tasks.BasicTask;
import ch.idsia.tools.MarioAIOptions;

import javax.swing.*;

public class Newcode  extends BasicMarioAIAgent implements Agent{


    public Newcode() {
        super("game");
    }


    public static void main(String[] args) {
        final MarioAIOptions marioAIOptions = new MarioAIOptions(args);
        final BasicTask basicTask = new BasicTask(marioAIOptions);
        basicTask.setOptionsAndReset(marioAIOptions);



        A a = new A(basicTask);
        Thread thread = new Thread(a);
        thread.start();

        basicTask.doEpisodes(1, true, 1);
        System.exit(0);
    }


}

class A implements Runnable {
    BasicTask basicTask;

    public A(BasicTask basicTask) {
        this.basicTask = basicTask;
    }

    @Override
    public void run() {
        while (true) {

            System.out.println(basicTask.getEnvironment().getReceptiveFieldWidth());

//        }
        }
    }
}






//    public static void main(String[] args){
//        final MarioAIOptions marioAIOptions = new MarioAIOptions(args);
//        final BasicTask basicTask = new BasicTask(marioAIOptions);
//        basicTask.setOptionsAndReset(marioAIOptions);
//        basicTask.doEpisodes(1, true, 1);
//
//        System.exit(0);
//    }
