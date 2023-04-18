package machine;


import java.util.Scanner;

public class CoffeeMachine {

    int currentMoney = 550;

    int currentWater = 400;

    int currentMilk = 540;

    int currentCoffee = 120;

    int currentCup = 9;

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    public int getCurrentMilk() {
        return currentMilk;
    }

    public void setCurrentMilk(int currentMilk) {
        this.currentMilk = currentMilk;
    }

    public int getCurrentCoffee() {
        return currentCoffee;
    }

    public void setCurrentCoffee(int currentCoffee) {
        this.currentCoffee = currentCoffee;
    }

    public int getCurrentCup() {
        return currentCup;
    }

    public void setCurrentCup(int currentCup) {
        this.currentCup = currentCup;
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.next();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("remaining")) {
                String remaining = "\nThe coffee machine has:\n" +
                        coffeeMachine.getCurrentWater() + " ml of water\n" +
                        coffeeMachine.getCurrentMilk() + " ml of milk\n" +
                        coffeeMachine.getCurrentCoffee() + " g of coffee beans\n" +
                        coffeeMachine.getCurrentCup() + " disposable cups\n" +
                        "$" + coffeeMachine.getCurrentMoney() + " of money\n";
                System.out.println(remaining);
            } else if (input.equals("buy")) {
                coffeeMachine.buy();
            } else if (input.equals("fill")) {
                coffeeMachine.fill();
            } else {
                coffeeMachine.take();
            }
        }

    }

    public void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selection = scanner.next();
        if (selection.equals("1")) {
            if (getCurrentWater() >= 250 && getCurrentCoffee() >= 16 && getCurrentCup() >= 1) {
                System.out.println("I have enough resources, making you a coffee!\n");
                setCurrentWater(getCurrentWater() - 250);
                setCurrentCoffee(getCurrentCoffee() - 16);
                setCurrentMoney(getCurrentMoney() + 4);
                setCurrentCup(getCurrentCup() - 1);
            } else {
                if (getCurrentWater() < 250) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (getCurrentCoffee() < 16) {
                    System.out.println("Sorry, not enough coffee beans!\n");
                } else if (getCurrentCup() < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {
                    return;
                }
            }
        } else if (selection.equals("2")) {
            {
                if (getCurrentWater() >= 350 && getCurrentMilk() >= 75 && getCurrentCoffee() >= 20 && getCurrentCup() >= 1) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    setCurrentWater(getCurrentWater() - 350);
                    setCurrentMilk(getCurrentMilk() - 75);
                    setCurrentCoffee(getCurrentCoffee() - 20);
                    setCurrentMoney(getCurrentMoney() + 7);
                    setCurrentCup(getCurrentCup() - 1);
                } else {
                    if (getCurrentWater() < 350) {
                        System.out.println("Sorry, not enough water!\n");
                    } else if (getCurrentMilk() < 75) {
                        System.out.println("Sorry, not enough milk!\n");
                    } else if (getCurrentCoffee() < 20) {
                        System.out.println("Sorry, not enough coffee beans!\n");
                    } else if (getCurrentCup() < 1) {
                        System.out.println("Sorry, not enough disposable cups!\n");
                    } else {
                        return;
                    }
                }
            }

        } else if (selection.equals("3")) {

            if (getCurrentWater() >= 200 && getCurrentMilk() >= 100 && getCurrentCoffee() >= 12 && getCurrentCup() >= 1) {
                System.out.println("I have enough resources, making you a coffee!\n");
                setCurrentWater(getCurrentWater() - 200);
                setCurrentMilk(getCurrentMilk() - 100);
                setCurrentCoffee(getCurrentCoffee() - 12);
                setCurrentMoney(getCurrentMoney() + 6);
                setCurrentCup(getCurrentCup() - 1);
            } else {
                if (getCurrentWater() < 200) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (getCurrentMilk() < 100) {
                    System.out.println("Sorry, not enough milk!\n");
                } else if (getCurrentCoffee() < 12) {
                    System.out.println("Sorry, not enough coffee beans!\n");
                } else if (getCurrentCup() < 1) {
                    System.out.println("Sorry, not enough disposable cups!\n");
                } else {
                    return;
                }
            }
        } else if (selection.equals("back")) {
            return;
        }


    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffee = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int cup = scanner.nextInt();
        setCurrentWater(getCurrentWater() + water);
        setCurrentMilk(getCurrentMilk() + milk);
        setCurrentCoffee(getCurrentCoffee() + coffee);
        setCurrentCup(getCurrentCup() + cup);


    }

    public void take() {

        System.out.println("I gave you $" + getCurrentMoney());
        setCurrentMoney(0);


    }


}
