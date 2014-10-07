package Hands;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void TestRoyalFlush1() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}

	@Test
	public final void TestRoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestJoker1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.JACK));
		rfHand.add(new Card(eSuit.HEARTS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.Joker,eRank.Joker));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		

	}
	@Test
	public final void TestJoker2(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FIVE));
		rfHand.add(new Card(eSuit.SPADES,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a full house:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		

	}
	@Test
	public final void TestOnePair(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.THREE));
		rfHand.add(new Card(eSuit.SPADES,eRank.FOUR));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a one pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		

	}
	@Test
	public final void TestTwoOfAkind(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a two of a kind:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());		

	}
	@Test
	public final void TestThreeOfAkind1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a three of a kind:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		

	}
	@Test
	public final void TestFourOfAkind1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
		rfHand.add(new Card(eSuit.SPADES,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a four of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		

	}
	
	@Test
	public final void TestFourOfAkind2(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a four of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		

	}
	@Test
	public final void TestFiveOfAkind(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.Joker,eRank.Joker));
		Hand h = Hand.EvalHand(rfHand);	
		assertEquals("Should be a five of a kind:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());		

	}

	
	@Test
	public final void TestStraightFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}

}
