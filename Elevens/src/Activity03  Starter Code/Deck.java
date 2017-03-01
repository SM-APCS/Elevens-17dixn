package elevenslab;

import java.util.List;
import java.util.ArrayList;


public class Deck 
{
    List<Card> cards;
    int size;
        
    public Deck(String[] ranks, String[] suits, int[] values) 
    {
        cards = new ArrayList<>();
        for (int i = 0; i < ranks.length; i++)
        {
            for (String suitString : suits) 
            {
                cards.add(new Card(ranks[i], suitString, values[i]));
            }
        }
        size = cards.size();
    }
        
    public boolean isEmpty() 
    {
	return size == 0;
    }
        
    public int size() 
    {
        return size;
    }
        
    public void perfectShuffle()
    {
        List<Card> shuffled = new ArrayList<>();
        for(int i = 0; i < size/2; i++)
        {
            shuffled.add(cards.get(i));
            shuffled.add(cards.get(i + size/2));
        }
        cards = shuffled;
    }
        
    public void selectionShuffle()
    {
        for(int i = size-1; i >= 0; i--)
        {
            int randInt = (int)(Math.random()*(size-1));
            Card c = cards.get(i);
            cards.set(i, cards.get(randInt));
            cards.set(randInt, c);
        }
    }
        
    public Card deal() 
    {
        if(isEmpty()) 
        {
            return null;
        }
        size--;
        Card c = cards.get(size);
        return c;
    }

    @Override
    public String toString() 
    {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for(int i = size - 1; i >= 0; i--) 
        {
            rtn = rtn + cards.get(i);
            if(i != 0) 
            {
                rtn = rtn + ", ";
            }
            if((size - i) % 2 == 0) 
            {
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for(int i = cards.size() - 1; i >= size; i--) 
        {
            rtn = rtn + cards.get(i);
            if(i != size) 
            {
                rtn = rtn + ", ";
            }
            if((i - cards.size()) % 2 == 0) 
            {
                rtn = rtn + "\n";
            }
        }
                
        rtn = rtn + "\n";
        return rtn;
    }
}
