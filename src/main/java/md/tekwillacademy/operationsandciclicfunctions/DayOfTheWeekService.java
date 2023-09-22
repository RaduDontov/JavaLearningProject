package md.tekwillacademy.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        //Enter the day name and write in the console the day number


        String nameOfDay = "Sunday";

        int numberOfTheDay;

        switch (nameOfDay){
            case "Monday":
                numberOfTheDay = 1;
                System.out.println("A case has been found");

            case "Tuesday":
                numberOfTheDay = 2;
                System.out.println("A case has been found");

            case "Wednesday":
                numberOfTheDay = 3;
                System.out.println("A case has been found");

            case "Thursday":
               numberOfTheDay = 4;
                System.out.println("A case has been found");

            case "Friday":
                numberOfTheDay = 5;
                System.out.println("A case has been found");

            case "Saturday":
                numberOfTheDay = 6;
                System.out.println("A case has been found");

            case "Sunday":
                numberOfTheDay = 7;
                System.out.println("A case has been found");
        }
    }
}
