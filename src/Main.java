import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        //Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("\nTask 1. Initial values:\ndog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("\nTask 2.\ndog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);

        //Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("\nTask 3.\n(dog + 4) - 3.5 = " + dog);
        System.out.println("(cat + 4) - 1.6 = " + cat);
        System.out.println("(paper +4) - 7639 = " + paper);

        //Task 4
        var friend = 19;
        System.out.println("\nTask 4.\nInitial value friend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("(friend + 2) / 7 = " + friend);

        //Task 5
        var frog = 3.5;
        System.out.println("\nTask 5.\nInitial value frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("(frog * 10) / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("(frog * 10) / 3.5 + 4 = " + frog);

        //Task 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println("\nTask 6.\nTotal weight of two boxers = " + weightTotal);
        var weightDifference = abs(weightBoxer1 - weightBoxer2);
        System.out.println("Weight difference of two boxers = " + weightDifference);

        //Task 7
        System.out.println("\nTask 7.\nRemainder weight = " + (weightBoxer2 % weightBoxer1));
    }
}