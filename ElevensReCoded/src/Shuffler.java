/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 2;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 6;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		
		int[] val1 = new int[VALUE_COUNT];
		
		for (int i = 0; i < val1.length; i++) 
		{
			val1[i] = i;
		}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(val1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < val1.length; k++) {
				System.out.print(" " + val1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) 
	{
		int[] firstHalf = new int[VALUE_COUNT/2];
		int[] secHalf = new int[VALUE_COUNT - VALUE_COUNT/2];
		
		int half = VALUE_COUNT/2;
		
		for( int i = 0; i <= (half); i++)
		{
			firstHalf[i] = values[i];
		}
		for( int i = 0; i <= (VALUE_COUNT - half); i++)
		{
			secHalf[i] = values[i + (half)];
		}
		for( int i = 0; i <= (half); i++)
		{
			values[2 * i] = secHalf[i];
		}
        for( int i = 0; i < half; i++ ) 
        {
            values[ 2 * i ] = secHalf[i];
            values[ 2 * i + 1 ] = firstHalf[i];
        }
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) 
	{
		for( int i = VALUE_COUNT - 1; i >= 0; i-- ) 
		{
            int r = (int)(Math.random() * i);
            int temp = values[r];
            values[r] = values[i];
            values[i] = temp;
		}
	}
}
