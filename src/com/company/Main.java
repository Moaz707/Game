package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Create it by Muaadh Melhi Sep 30,2017

public class Main {
    private static void sleep(int time) {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("*-----------------<(_o_o_)>-------< o (_) o >---------<(o)_(o)>-----------------\n*");


        System.out.println("....,Its a rainy day, its a cloudy thunderous day. ");
        System.out.println("\n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                " ██▓  ██▓  ██▓  ██▓  ██▓  ██▓  ██▓  ██▓  ██▓  ██▓  ██▓  ██▓  ██▓                         \n" +
                " ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒  ▒▓▒                         \n" +
                " ░▒   ░▒   ░▒   ░▒   ░▒   ░▒   ░▒   ░▒   ░▒   ░▒   ░▒   ░▒   ░▒                          \n" +
                " ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░                           \n" +
                "  ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░                          \n" +
                "  ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░    ░                          \n" +
                "                 ██▀███  ▄▄▄      ██▓███▄    █                                           \n" +
                "                ▓██ ▒ ██▒████▄   ▓██▒██ ▀█   █                                           \n" +
                "                ▓██ ░▄█ ▒██  ▀█▄ ▒██▓██  ▀█ ██▒                                          \n" +
                "                ▒██▀▀█▄ ░██▄▄▄▄██░██▓██▒  ▐▌██▒                                          \n" +
                " ██▓  ██▓       ░██▓ ▒██▒▓█   ▓██░██▒██░   ▓██░             ██▓        ██▓        ██▓    \n" +
                " ▒▓▒  ▒▓▒       ░ ▒▓ ░▒▓░▒▒   ▓▒█░▓ ░ ▒░   ▒ ▒              ▒▓▒        ▒▓▒        ▒▓▒    \n" +
                " ░▒   ░▒          ░▒ ░ ▒░ ▒   ▒▒ ░▒ ░ ░░   ░ ▒░             ░▒         ░▒         ░▒     \n" +
                " ░    ░           ░░   ░  ░   ▒   ▒ ░  ░   ░ ░              ░          ░          ░      \n" +
                "  ░    ░           ░          ░  ░░          ░               ░          ░          ░     \n" +
                "  ░    ░                                                     ░          ░          ░     \n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                "                                                                                         \n" +
                "          ██▓  ██▓        ██▓  ██▓              ██▓  ██▓                                 \n" +
                "          ▒▓▒  ▒▓▒        ▒▓▒  ▒▓▒              ▒▓▒  ▒▓▒                                 \n" +
                "          ░▒   ░▒         ░▒   ░▒               ░▒   ░▒                                  \n" +
                "          ░    ░          ░    ░                ░    ░                                   \n" +
                "           ░    ░          ░    ░                ░    ░                                  \n" +
                "           ░    ░          ░    ░                ░    ░                                  \n");
        sleep(3000);
        System.out.println("\t>I open my eyes...OMG...I drink too much!!\"");

        System.out.println("\t>Angel:What happened to you ?");
        System.out.println("\t>Thomas:Nothing?\n");
        System.out.println(".....you hear gun fire shots......you look behined you , Someone Said:  ");
        System.out.println("\t>How is Thomas?");
        System.out.println("\t>Would like to answer? y/n");
        String input1 = in.nextLine(); //Pick up the user choice now
        boolean running = true;
        GAME:
        while (running)

        {
            if (input1.equals("y")) {
                System.out.println("\t>Thomas:I'm okay, what do you want? Are you looking to die today!");
            } else {
                System.out.println(".....Thomas stood up and left the bar from the backdoor");
                break;
            }

            System.out.println("\t>the guy:Finally !!I'm not looking for trouble with you i know who you are Captain");
            System.out.println("\t but i need your help, i lost my son in the mountian and I cant go there at the night.. ");
            System.out.println("\t you knows how walking there at the night.....\n");
            System.out.println("\t>Captin said: I'm not interested?");
            System.out.println("\t>the guy:that's what will bring your attention!!!  ");
            System.out.println("\t would you like to play?" + " " + "y/n");

            String input2 = in.nextLine(); //Pick up the user choice now
//            do {


            switch (input2.toLowerCase()) {
                case "y":
                    System.out.println("\n\t> you see the ring you are looking for whole you live");
                    System.out.println("\t>thomas:I'm in!!");
                    System.out.println("\t****.....................");
                    System.out.println("\t                         ....................******");
                    System.out.println("\n\t> after time from leaving the bar with your frined Angel..");
                    System.out.println("\t> Angel: thomas whats worng with ring?");
                    System.out.println("\t> would you like to answer?y/n");
                    String input3 = in.nextLine(); //Pick up the user choice now
                    if (input3.toLowerCase().equals("y")) {
                        System.out.println("\t> its belong to my beloved , its been killed by the beast in the mountin");
                        System.out.println("\t> That's the only memory had left from her...");
                    } else {
                        System.out.println("\t>please Angle :Save me from the answer!!");
                        System.out.println("\t>Angel: I see Thomas....forget i ask you");

                    }
                    System.out.println("\t both reach to where roads splits...");
                    System.out.println("\t one of these road will lead you to save the kid in the game");
                    System.out.println("Choose which path you will go? R ,L ");
                    System.out.println("\t R is right path, l is te left path");
                    String input4 = in.nextLine(); //Pick up the user choice now
                    String[] pathWayToMountain = {"the right path ", "the left path"};
                    for (int i = 0; i < pathWayToMountain.length; i++) {
                        if (input4.toLowerCase().equals("r")) {
                            System.out.println("\n\t>....you reach the mountin and its midnight... ");
                            sleep(3000);
                            System.out.println("\n" +
                                    " ██▓▄▄▄█████▓  ██████     ███▄ ▄███▓ ██▓▓█████▄  ███▄    █  ██▓  ▄████  ██░ ██ ▄▄▄█████▓\n" +
                                    "▓██▒▓  ██▒ ▓▒▒██    ▒    ▓██▒▀█▀ ██▒▓██▒▒██▀ ██▌ ██ ▀█   █ ▓██▒ ██▒ ▀█▒▓██░ ██▒▓  ██▒ ▓▒\n" +
                                    "▒██▒▒ ▓██░ ▒░░ ▓██▄      ▓██    ▓██░▒██▒░██   █▌▓██  ▀█ ██▒▒██▒▒██░▄▄▄░▒██▀▀██░▒ ▓██░ ▒░\n" +
                                    "░██░░ ▓██▓ ░   ▒   ██▒   ▒██    ▒██ ░██░░▓█▄   ▌▓██▒  ▐▌██▒░██░░▓█  ██▓░▓█ ░██ ░ ▓██▓ ░ \n" +
                                    "░██░  ▒██▒ ░ ▒██████▒▒   ▒██▒   ░██▒░██░░▒████▓ ▒██░   ▓██░░██░░▒▓███▀▒░▓█▒░██▓  ▒██▒ ░ \n" +
                                    "░▓    ▒ ░░   ▒ ▒▓▒ ▒ ░   ░ ▒░   ░  ░░▓   ▒▒▓  ▒ ░ ▒░   ▒ ▒ ░▓   ░▒   ▒  ▒ ░░▒░▒  ▒ ░░   \n" +
                                    " ▒ ░    ░    ░ ░▒  ░ ░   ░  ░      ░ ▒ ░ ░ ▒  ▒ ░ ░░   ░ ▒░ ▒ ░  ░   ░  ▒ ░▒░ ░    ░    \n" +
                                    " ▒ ░  ░      ░  ░  ░     ░      ░    ▒ ░ ░ ░  ░    ░   ░ ░  ▒ ░░ ░   ░  ░  ░░ ░  ░      \n" +
                                    " ░                 ░            ░    ░     ░             ░  ░        ░  ░  ░  ░         \n" +
                                    "                                         ░                                              \n");

                            sleep(3000);

                            System.out.println("\t you hear Screaming sound from far away......");
                            System.out.println("\n\t you definitely run to that sound .....you dont hesitate");
                            System.out.println("\t when you reach there you see the kid and something or someone beside him..");
                            System.out.println("\n\t you dont know what to say!!!!.....you are shocked...");
                            sleep(3000);
                            System.out.println("\n\t thats thing ,or thats somone look to you ...his eyes hidden alot..");
                            System.out.println("\tyou keep looking , and will all your brave you couldn't move ");
                            System.out.println("\t thats thing is jump, flying to you.......");
                            System.out.println("\t Angel screams , watch out...... ");
                            System.out.println("\t but you couldnt even move .......Angel jump to protect you ..");
                            System.out.println("\t but,...in blink of eye......Angel die");
                            System.out.println("\t You still dont know what happend.....and thats thing ready to attack you");
                            sleep(3000);
                            System.out.println("\n\t Do you wanna fight him!!!??   thats's what you thinking now?");
                            System.out.println("\t choose yes(y) or no(n)?");
                            String input5 = in.nextLine(); //Pick up the user choice now
                            if ((input5.toLowerCase().equals("yes")) || ((input5.toLowerCase().equals("y")))) {
                                //Vampire varabile
                                int VampHealthMax = 120;
                                int vampAttack = 60;
                                // thomas var
                                int thomasHealth = 100;
                                int thomasAttack = 80;

                                int vampHealth = rand.nextInt(VampHealthMax);   //creat enemy and give it health

                                while (vampHealth > 0) {         //while the enemy alive
                                    System.out.println("\tYour HP: " + thomasHealth);
                                    System.out.println("\t 'VAMP's Hp:" + vampHealth);

                                    int damageDoneToVamp = rand.nextInt(thomasAttack);
                                    int damageTaken = rand.nextInt(vampAttack);
                                    vampHealth -= damageDoneToVamp;
                                    thomasHealth -= damageTaken;
//                            System.out.println("\ny" +
//                                    "\t> enemy hass recived " + " < " + damageDoneToVamp + " > " + "damage.");
//                            System.out.println("\t >You recive " + " < " + damageTaken + " > " + "in the Battle!");
                                    if (vampHealth > 0 || thomasHealth > 0) {
                                        System.out.println("\n \t......you both still fighting ...");
                                        System.out.println("\t---------------------------------");
                                    } else {
                                        System.out.println("\n\t <<<<Battle finshed>>>>>");
                                        System.out.println("\t---------------------------------");
                                    }
                                    sleep(5);

                                    if (thomasHealth < 1) {
                                        System.out.println("\t>You lose the Battle!, you should run and Fight onther day!");
                                        break;

                                    }
                                } //////for if loop

                                sleep(4000);
                                System.out.println("\n" +
                                        "                                                                             \n" +
                                        "                                                                             \n" +
                                        "                                                                             \n" +
                                        "                                                                             \n" +
                                        "`7M'   `MF' ,pW\"Wq.  `7MM  `7MM      `7M'    ,A    `MF' ,pW\"Wq.  `7MMpMMMb.  \n" +
                                        "  VA   ,V  6W'   `Wb   MM    MM        VA   ,VAA   ,V  6W'   `Wb   MM    MM  \n" +
                                        "   VA ,V   8M     M8   MM    MM         VA ,V  VA ,V   8M     M8   MM    MM  \n" +
                                        "    VVV    YA.   ,A9   MM    MM          VVV    VVV    YA.   ,A9   MM    MM  \n" +
                                        "    ,V      `Ybmd9'    `Mbod\"YML.         W      W      `Ybmd9'  .JMML  JMML.\n" +
                                        "   ,V                                                                        \n" +
                                        "OOb\"                                                                         \n");

                                sleep(3000);
                                System.out.println("\n\t> you saved the kid ");
                                System.out.println("\t> but you lose you frined , You will never forget him ");

                            } else {
                                System.out.println("\t> live today to figth in another day!!!");
                            }

                            break;

                        } else {
                            System.out.println("YOu choose the wrong path , You reach late!!");
                            break GAME;

                        }

                    }
                case "n":
                    System.out.println("\n\t the guy screaming at you ,yelling :you coward!!!");
                    System.out.println("\t you leaving ....and just feeling your self dizzy....");
                    System.out.println("\t you know that time you been shot!!!");
                    break;
                default:
                    System.out.println("\t> please type yes or no");
                    break;
            }




            break GAME;
        }
//            while (!input2.equals("yes") ||(!input2.equals("no")))
        sleep(3000);
        System.out.println("\n\t>see you next time when you interest in playing!!!");
        sleep(3000);
        System.out.println("\n\t>Thank you for playing ");
        System.out.println("\n" +
                "                                                                                                                                                \n" +
                "                                                                                                                                                \n" +
                "                                                                                                                                                \n" +
                "                                                                                                                                                \n" +
                "                                                                                                                                                \n" +
                "                                                                                                                                                \n" +
                "                                                                                                                                                \n" +
                "    __    __    ______   .______    _______    .___________. ______           _______. _______  _______    ____    ____  ______    __    __     \n" +
                "   |  |  |  |  /  __  \\  |   _  \\  |   ____|   |           |/  __  \\         /       ||   ____||   ____|   \\   \\  /   / /  __  \\  |  |  |  |    \n" +
                "   |  |__|  | |  |  |  | |  |_)  | |  |__      `---|  |----|  |  |  |       |   (----`|  |__   |  |__       \\   \\/   / |  |  |  | |  |  |  |    \n" +
                "   |   __   | |  |  |  | |   ___/  |   __|         |  |    |  |  |  |        \\   \\    |   __|  |   __|       \\_    _/  |  |  |  | |  |  |  |    \n" +
                "   |  |  |  | |  `--'  | |  |      |  |____        |  |    |  `--'  |    .----)   |   |  |____ |  |____        |  |    |  `--'  | |  `--'  |    \n" +
                "   |__|  |__|  \\______/  | _|      |_______|       |__|     \\______/     |_______/    |_______||_______|       |__|     \\______/   \\______/     \n" +
                "                                                                                                                                                \n");
    }

}
