/*
 * Created By Jacob Sawyer
 * CS201 Data Structures and Algorithms
 * 
 */

import java.io.InputStream;
import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
        // populating 2d array of states and their capitals
        String[][] statesAndCities = {
                                     {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},
                                     {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"}
                                            };
        System.out.println("\nWelcome to my program for CS201!\n");  
        getCap(statesAndCities);
    }    


    public static void getCap(String[][] statesAndCities)
    {
        // cities string array is array of all capitals
        String[] cities = statesAndCities[1];

        // getting user input to name one city
        Scanner sc = new Scanner(System.in);
        System.out.println("If you know the name of one, enter a U.S. capital!\n");
        String currentInput = sc.nextLine();

        // while condition equals false, keep looping

        boolean condition = false;
        while(condition)
        {
            if()
                {
                System.out.println("Invalid input! Try Again");
                continue;
                }
            else
                {
                condition = true;
                }
        }
        
    }                          

}
