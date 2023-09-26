/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package card;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Card[] magicHand = new Card[7];
        // make 7 cards using random method
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rnd.nextInt(13)+1);
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            magicHand[i] = c;
        }
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Please enter card suit:");
        String userSuit = inp.nextLine();
        
        System.out.println("Please enter card value: (Ace - 1, Jack - 11, Queen - 12, King - 13)");
        int userValue = inp.nextInt();
        
        boolean flag = false;
        for (int i = 0 ; i < magicHand.length; i++){
            if(userValue == magicHand[i].getValue() && userSuit.equals(magicHand[i].getSuit())){
                System.out.println("Card number " + i + " matches with your card");
                flag = true;
            } 
        }
        if(!flag){
            System.out.println("No card matches with your card");
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
