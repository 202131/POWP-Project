package production.WaffleShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String beverageType = "";

    public Client() {
    }

    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("What do you want to order?");
                System.out.println("(1) Waffle");
                System.out.println("(2) Drink");
                System.out.println("(Other) I have finished ordering.");
                int a = scanner.nextInt();
                if (a == 1) {
                    ArrayList<String> chocoList = new ArrayList();
                    ArrayList<String> fruitList = new ArrayList();
                    ArrayList<String> condimentList = new ArrayList();
                    String waffleType = null;
                    String answer = null;

                    while(true) {
                        System.out.println("Which waffle do you want?");
                        System.out.println("(1) Square Waffle --- 5.0$");
                        System.out.println("(2) Circular Waffle --- 4.0$");
                        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                        try {
                            answer = input.readLine();
                        } catch (IOException var17) {
                            var17.printStackTrace();
                        }

                        if (answer.equals("1")) {
                            waffleType = "Square Waffle";
                            System.out.println("*** Square Waffle is chosen.");
                            break;
                        }

                        if (answer.equals("2")) {
                            waffleType = "Circle Waffle";
                            System.out.println("*** Circular Waffle is chosen.");
                            break;
                        }
                    }

                    System.out.println("");
                    System.out.println("-------------------- INGREDIENTS --------------------");
                    Scanner scan = new Scanner(System.in);

                    int value;
                    for(int i = 0; i < 2; ++i) {
                        System.out.println("-------------------- Chocolate Types --------------------");
                        System.out.println("(1) White Chocolate --- 1.5$");
                        System.out.println("(2) Nutella --- 1.25$");
                        System.out.println("(Other) I finished the chocolate selection.");
                        value = scan.nextInt();
                        if (value == 1) {
                            chocoList.add("White");
                            System.out.println("*** White Chocolate is chosen.");
                        } else {
                            if (value != 2) {
                                break;
                            }

                            chocoList.add("Normal");
                            System.out.println("*** Nutella is chosen.");
                        }
                    }

                    System.out.println("The selection of chocolates is completed.");
                    System.out.println("");
                    Scanner scan2 = new Scanner(System.in);

                    for(value = 0; value < 3; ++value) {
                        System.out.println("-------------------- Fruit Types --------------------");
                        System.out.println("(1) Banana --- 0.75$");
                        System.out.println("(2) Strawberry --- 0.65$");
                        System.out.println("(3) Kiwi --- 0.85$");
                        System.out.println("(Other) I finished the fruit selection.");
                        value = scan2.nextInt();
                        if (value == 1) {
                            fruitList.add("Banana");
                            System.out.println("*** Banana is chosen.");
                        } else if (value == 2) {
                            fruitList.add("Strawberry");
                            System.out.println("*** Strawberry is chosen.");
                        } else {
                            if (value != 3) {
                                break;
                            }

                            fruitList.add("Kiwi");
                            System.out.println("*** Kiwi is chosen.");
                        }
                    }

                    System.out.println("The selection of fruits is completed.");
                    System.out.println("");
                    Scanner scan3 = new Scanner(System.in);

                    for(value = 0; value < 3; ++value) {
                        System.out.println("-------------------- Condiment Types --------------------");
                        System.out.println("(1) Ice Cream --- 2.5$");
                        System.out.println("(2) Coconut --- 0.1$");
                        System.out.println("(3) Almond --- 0.35$");
                        System.out.println("(Other) I finished the condiment selection.");

                        if ((value = scan3.nextInt()) == 1) {
                            condimentList.add("Ice Cream");
                            System.out.println("*** Ice Cream is chosen.");
                        } else if (value == 2) {
                            fruitList.add("Coconut");
                            System.out.println("*** Coconut is chosen.");
                        } else {
                            if (value != 3) {
                                break;
                            }

                            fruitList.add("Almond");
                            System.out.println("*** Almond is chosen.");
                        }
                    }

                    System.out.println("The selection of condiments is completed.");
                    System.out.println("");
                    String[] chocoArr = new String[chocoList.size()];
                    chocoArr = (String[])chocoList.toArray(chocoArr);
                    String[] fruitArr = new String[fruitList.size()];
                    fruitArr = (String[])fruitList.toArray(fruitArr);
                    String[] condimentArr = new String[condimentList.size()];
                    condimentArr = (String[])condimentList.toArray(condimentArr);

                } else {
                    if (a != 2) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("BON APPETIT");
                        return;
                    }

                    Scanner scanBeverage = new Scanner(System.in);
                    System.out.println("-------------------- DRINKS --------------------");

                    for(int i = 0; i < 1; ++i) {
                        System.out.println("-------------------- Drink Types --------------------");
                        System.out.println("(1) Tea --- 2.5$");
                        System.out.println("(2) Coffee --- 5.5$");
                        System.out.println("(3) Cola --- 4.0$");
                        System.out.println("(4) Ice Tea --- 4.5$");
                        System.out.println("(5) Fanta --- 4.0$");
                        System.out.println("(6) Sprite --- 4.0$");
                        System.out.println("(Other) I finished the drink selection.");
                        int drink = scanBeverage.nextInt();
                        if (drink == 1) {
                            beverageType = "Tea";
                            System.out.println("*** Tea is chosen.");
                        } else if (drink == 2) {
                            beverageType = "Coffee";
                            System.out.println("*** Coffee is chosen.");
                        } else if (drink == 3) {
                            beverageType = "Cola";
                            System.out.println("*** Cola is chosen.");
                        } else if (drink == 4) {
                            beverageType = "Ice Tea";
                            System.out.println("*** Ice Tea is chosen.");
                        } else if (drink == 5) {
                            beverageType = "Fanta";
                            System.out.println("*** Fanta is chosen.");
                        } else {
                            if (drink != 6) {
                                break;
                            }

                            beverageType = "Sprite";
                            System.out.println("*** Sprite is chosen.");
                        }
                    }

                    System.out.println("The selection of drinks is completed.");
                    System.out.println("");

                }
            }
        }
    }
}
