

/*
package PlayingCards;
import java.util.ArrayList;
import java.util.Arrays;

public class Hand{

   
	
private ArrayList<Card> cards;
    
    
    
    public Hand() {
        
        this.cards = new ArrayList<Card>();
        
    }
    @Override
	public String toString() {
		String card = Arrays.toString(cards.toArray()).replace("[", "").replace("]", "").replace(",", "");
		return card + " ";
	}
public void add(Card c)
{
	cards.add(c);
}

public void clear()
{
	cards.clear();
}
public int size()
{
	return cards.size();
	
}
public Card get(int i) {
	return cards.get(i);
}
public void remove(int selected) {
	cards.remove(selected);
	
}
public int score() {
	int totalScore = 0;
	int cardScore = 0;
	for(int i = 0; i <cards.size(); i++)
	{
		if(cards.get(i).getRank().getValue() >=2 && cards.get(i).getRank().getValue()< 8)
		{
			cardScore = cards.get(i).getRank().getValue();
			totalScore = cardScore + totalScore;
		}
		else if (cards.get(i).getRank().getValue()>8 && cards.get(i).getRank().getValue() <=10 )
		{
			cardScore = cards.get(i).getRank().getValue();
			totalScore = cardScore + totalScore;
		}
		else if (cards.get(i).getRank().getValue() >10 && cards.get(i).getRank().getValue()<14)
		{
			cardScore = 10;
			totalScore = cardScore + totalScore;
		}
		else if (cards.get(i).getRank().getValue()==14)
		{
			cardScore = 1;
			totalScore = cardScore + totalScore;
		}
		else if (cards.get(i).getRank().getValue()==8)
		{
			cardScore = 50;
			totalScore = cardScore + totalScore;
		}
	}
	return totalScore;
}


	
}
*/
