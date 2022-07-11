import java .util.*;

public class FindTargetTransactions{
	private static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		
		System.out.println("Enter the number of transactions per day");
		
		int size = sc.nextInt();
		int [] transactionsArray = new int[size];
		
		for(int index = 0; index < size;) {
			int transaction = sc.nextInt();
			if(transaction > 0) {
				transactionsArray[index] = transaction;
				index++;
			}
		}
		System.out.println("Enter no Target");
		int noOfTargets = sc.nextInt();
		System.out.println("Enter Daily Target");
		int target = sc.nextInt();
		int transactionsCount = getNumberofTransactions(transactionsArray, target);
		System.out.println("The no. of transactions at which daily target is achieved " + (transactionsCount));
		
		sc.close();
	}
	private static int getNumberofTransactions(int [] transactionsArray, int noOfTargets) {
		while (noOfTargets > 0) {
			
		
		System.out.println("Enter Daily Target");
		int target = sc.nextInt();
		
		int transactionsCount = 0;
		int sum = 0;
		//int index = 0;
		do {
			sum = sum +transactionsArray[transactionsCount];
			transactionsCount ++;
		}
		while(sum<=target && transactionsCount<transactionsArray.length); {
			if(transactionsCount >= transactionsArray.length) {
				return -1;
			}
		return transactionsCount;	
		}
		}
		return noOfTargets;
		
	}
	
}
