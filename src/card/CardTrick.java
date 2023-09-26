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
        
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(2);
        
        boolean flag = false;
        for (int i = 0 ; i < magicHand.length; i++){
            if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())){
                System.out.println("You won!");
                flag = true;
            } 
        }
        if(!flag){
            System.out.println("You lose");
        }
    }
    
}
