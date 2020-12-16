package Stack;

public class StockSpan {
	public static void main(String[] args) {

		UtilityS utility = new UtilityS();

		int[] prices = { 31, 27, 14, 21, 30, 22 };
		int[] stockspan = new int[prices.length];
		int span = 0;

		for (int i = 0; i < prices.length; i++) {

			stockspan[i] = 1;

			if (prices[i] > utility.peek() && !utility.isEmpty()) {
				stockspan[i] += span;
				while (utility.peek() <= prices[i] && !utility.isEmpty()) {
					stockspan[i]++;
					span++;
					utility.pop();
				}
			}

			utility.push(prices[i]);

		}

		for (int i = 0; i < prices.length; i++)
			System.out.print(stockspan[i] + " ");

	}
}