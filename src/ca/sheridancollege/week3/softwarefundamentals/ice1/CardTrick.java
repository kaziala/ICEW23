/*
 * Author: Al Aqsaa Kazi
 * Student Id: 991704686
 * 
 */

package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSUIT(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a card value (1-13):");
        int cardValue = sc.nextInt();
        scanner.nextLine();
        System.out.print("Enter a card suit from 0 to 3: ");
        int suitValue = sc.nextInt();
        
        Card chosenCard = new Card();
        chosenCard.setValue(cardValue);
        chosenCard.setSuit(Card.SUITS[suitIndex]);
        
        // and search magicHand here
         boolean found = false;
        for(int i =0; i< magicHand.length; i++){
            if(magicHand[i].equals(chosenCard)){
                found = true;
                break;
            }
        }
        //Then report the result here
        if(found){
            System.out.println("Your card is in the magic hand");
        }
        else{
            System.out.println("Your card isn't in the hand");
        }
    }
    
}
