package poker;

public enum eHandStrength {

	RoyalFlush(100),
	StraightFlush(90),
	FourOfAKind(80),
	FiveOfAKind(70),
	FullHouse(60),
	Flush(50),
	Straight(40),
	ThreeOfAKind(30),
	TwoPair(20),
	Pair(10),
	HighCard(000);
	
	private eHandStrength(final int handstrength){
		this.iHandStrength = handstrength;
	}

	private int iHandStrength;
	
	public int getHandStrength(){
		return iHandStrength;
	}
	
}
