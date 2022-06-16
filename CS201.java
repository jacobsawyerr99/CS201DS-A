/*
 * Created By Jacob Sawyer
 * CS201 Data Structures and Algorithms
 * 
 */

import java.util.*;

public class CS201
{
    public static void main(String[] args) 
    {
        CS201 o = new CS201();
        // populating 2d array of states and their capitals
        String[][] statesAndCities = {
                                     {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},
                                     {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"}
                                     };
        System.out.println("\nWelcome to my program for CS201!\n");  
        o.getCap(statesAndCities);
        o.printCurrent(statesAndCities);
        o.bubbleSort(statesAndCities);
        o.quizUser(statesAndCities);
    }    


    public void getCap(String[][] statesAndCities)
    {
        // cities string array is array of all capitals
        String[] cities = statesAndCities[1];

        // while no capital is inputted false, keep looping
        boolean condition = false;
        while(!condition)
        {
            // getting user input to name one city
            Scanner sc = new Scanner(System.in);
            System.out.println("\nIf you know the name of one, enter a U.S. capital!\n");

            String current = sc.nextLine();

            // test to see if input is a valid capital city
            for (String x:cities)
            {
                if (x.equalsIgnoreCase(current)){
                    condition = true;
                    break;}
            }
            // if input is not valid, prompt user to try again. moves on if they enter anything besides y or n
            if (!condition)
            {
                System.out.println("\nThat is not a U.S. Capital! Try Again? \n  Y for yes/ N for no\n");
                String yayOrNay = sc.nextLine();
                if(yayOrNay.equalsIgnoreCase("y")){
                    continue;
                }
                else if(yayOrNay.equalsIgnoreCase("n")){
                    break;
                }
                else{
                    System.out.println("\nInvalid Input. Moving on to next part of project\n");
                    break;
                }
            }
        }
    }    
    
    // next part of project is printing out current array
    public void printCurrent(String[][] statesAndCities)
    {
        System.out.println("\nSORTED BY STATE:");
        for (int i = 0; i < 50; i++)
        {
            System.out.println("\nThe capital of " + statesAndCities[0][i] + " is " + statesAndCities[1][i]);
        }
    }

    // next we bubble sort alphabetically by capital
    public void bubbleSort(String[][] statesAndCities)
    {
        String tempCity;
        String tempState;
        System.out.println("\nBUBBLE SORTED BY CAPITAL:");
        for (int j = 0; j < 50; j++) {
            for (int i = j + 1; i < 50; i++) {
                if (statesAndCities[1][i].compareTo(statesAndCities[1][j]) < 0) {
                tempCity = statesAndCities[1][j];
                statesAndCities[1][j] = statesAndCities[1][i];
                statesAndCities[1][i] = tempCity;
                tempState = statesAndCities[0][j];
                statesAndCities[0][j] = statesAndCities[0][i];
                statesAndCities[0][i] = tempState;
                }
            }
        }
        // print out sorted by bubble sort
       // for (int i = 0; i < 50; i++)
       // {
       //     System.out.println("\n"+ statesAndCities[1][i] + " is " + statesAndCities[0][i] + " Capital!");
       // }
    }


    // now we quiz user for all U.S. capitals to see how many they get right
    public void quizUser(String[][] statesAndCities)
    {
        System.out.println("\nNow I am going to quiz you on all of the capitals to see how well you've learned.");
        System.out.println("If you'd like to skip this part, type 'quit'");
        String current2 = new String();
        String[] cities = statesAndCities[1];
        String[] states = statesAndCities[0];
        for (int i = 0; i < 50; i++)
        {
            System.out.println("\nWhat is " + states[i] + "'s capital?");
            Scanner sc2 = new Scanner(System.in);
            current2 = sc2.nextLine();
            if (cities[i].equalsIgnoreCase(current2)){
                System.out.println("\nCorrect! Next Question\n");
            }
            else if(current2.equalsIgnoreCase("quit"))
            {
                break;
            }
            else
            {
                System.out.println("Not sure what that means. going to next question.");
                continue;
            }
        }
    }
}
