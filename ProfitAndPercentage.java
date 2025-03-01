class ProfitAndPercentage{
	public static void main(String[] args){
		int costPrice = 129;
		int sellingPrice = 191;
		int profit = sellingPrice - costPrice;
		int profitPercentage = profit/(costPrice*100);
		System.out.println("The cost price in INR is " + costPrice + " and the selling price in INR is "+ sellingPrice);
		System.out.print( "The profit is INR " + profit + " and profit percentage is " + profitPercentage);
	}
}

