public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    String playerName;
    int leftOrRight;
    int attackOrRun;
    int enemyDamage;
    int playerDamage;
    int afterAttack;
    boolean run;

    // 1.  Player Name Store
    System.out.print("Enter your name : ");
    playerName = input.next();
    System.out.println();

    System.out.println("Now , you are in the adventure game.");
    System.out.println("You must find a way to escape the forest.");
    System.out.println();

    System.out.println("Choose the path you want to go: ( 1 -> Left ) and ( 2 -> Right ) ");
    // 2. Choose Left or Right
    System.out.print("Type Here 1 or 2 : ");
    leftOrRight = input.nextInt();

    while (leftOrRight != 1 && leftOrRight != 2) {
        System.out.println();
        System.out.println("You entered a wrong number! Choose again.");
        System.out.println("Choose the path you want to go: (1 -> Left) and (2 -> Right)");
        System.out.print("Type Here 1 or 2: ");
        leftOrRight = input.nextInt();
    }

    System.out.println();
    if (leftOrRight == 1) // Left
    {
        System.out.println("The path leads deeper into darkness.");
        System.out.println("A strange and mysterious creature awaits you.");
        System.out.println();
        // this creature strength
        enemyDamage = random.nextInt(1, 5);
        System.out.println("Enemy Damage is  ==== >  " + enemyDamage);
        System.out.println("Choose Attack or Run");
        System.out.println("( 1 -> Attack ) and ( 2 -> Run )");
        System.out.print("Type Here 1 or 2: ");
        attackOrRun = input.nextInt();

        if (attackOrRun == 1) // Attacking
        {
            playerDamage = random.nextInt(1, 5);
            System.out.println();
            System.out.println("Your energy is ==== >  " + playerDamage);
            afterAttack = enemyDamage - playerDamage;
            System.out.println();

            while (afterAttack >= 1) {
                System.out.println("Enemy is now " + afterAttack);
                System.out.println("Do you want to continue?");
                System.out.println();
                System.out.println("Choose Attack or Run");
                System.out.println("(1 -> Attack) and (2 -> Run)");
                System.out.print("Type Here 1 or 2: ");
                attackOrRun = input.nextInt();
                System.out.println();

                if (attackOrRun == 1) // Attack Again
                {
                    playerDamage = random.nextInt(1, 5);
                    System.out.println("Your energy is ===>" + playerDamage);
                    afterAttack -= playerDamage;
                } else if (attackOrRun == 2)  // Run
                {
                    //Run , Escape possibility
                    run = random.nextBoolean();

                    if (run) {
                        // Game Win by Running
                        System.out.println("Congratulations You Escape." + playerName);
                    } else {
                        // Game Over
                        System.out.println("You are not escape. Game Over! " + playerName);
                    }
                    break;
                }
            }
            // Game Win by Attacking enemy.
            System.out.println("Congratulations You Win the Enemy." + playerName);
        }
        else  // Run
        {
            //Run , Escape possibility
            run = random.nextBoolean();
            if (run) {
                // Game Win by Running
                System.out.println(playerName + "!!! Congratulations You Escape.");
            } else {
                // Game Over
                System.out.println(playerName + "!!! You are NOT escape. Game Over! ");
            }
        }


    }
    else// Right
    {
        System.out.println("The trail winds along a riverbank.");
        System.out.println("A fierce dragon guards the path.");
        System.out.println();
        // this creature strength
        enemyDamage = random.nextInt(1, 5);
        System.out.println("Enemy Damage is : " + enemyDamage);
        System.out.println("Choose Attack or Run");
        System.out.println("( 1 -> Attack ) and ( 2 -> Run )");
        System.out.print("Type Here 1 or 2: ");
        attackOrRun = input.nextInt();

        if (attackOrRun == 1) // Attacking
        {
            playerDamage = random.nextInt(1, 5);
            System.out.println();
            System.out.println("Your energy is ==== >  " + playerDamage);
            afterAttack = enemyDamage - playerDamage;
            System.out.println();

            while (afterAttack >= 1) {
                System.out.println("Enemy is now " + afterAttack);
                System.out.println("Do you want to continue?");
                System.out.println();
                System.out.println("Choose Attack or Run");
                System.out.println("(1 -> Attack) and (2 -> Run)");
                System.out.print("Type Here 1 or 2: ");
                attackOrRun = input.nextInt();
                System.out.println();

                if (attackOrRun == 1) // Attack Again
                {
                    playerDamage = random.nextInt(1, 5);
                    System.out.println();
                    System.out.println("Your energy is ===> " + playerDamage);
                    afterAttack -= playerDamage;
                } else if (attackOrRun == 2)  // Run
                {
                    //Run , Escape possibility
                    run = random.nextBoolean();

                    if (run) {
                        // Game Win by Running
                        System.out.println("Congratulations You Escape." + playerName);
                    } else {
                        // Game Over
                        System.out.println("You are not escape. Game Over! " + playerName);
                    }
                    break;
                }
            }

            // Game Win by Attacking enemy.
            System.out.println("Congratulations You Win the Enemy." + playerName);
        } else  // Run
        {
            //Run , Escape possibility
            run = random.nextBoolean();
            if (run) {
                // Game Win by Running
                System.out.println(playerName + "!!! Congratulations You Escape.");
            } else {
                // Game Over
                System.out.println(playerName + "!!!You are NOT escape. Game Over! ");
            }
        }
    }

    input.close();
}
