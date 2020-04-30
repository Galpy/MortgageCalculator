public class Main {
    public static void main(String[] args) {
    	
    	int[] list = {14, 20, 28, 29, 33, 38, 42, 49, 56, 60, 71};
    	int key = 17;
    	int returnValue = binarySearch(list, key);
    	System.out.println(returnValue);
    
    	}
    	
/*        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        
        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    
    double[] prices = {15.20, 8.59, 12.47};
    double average;
    average = calcAverage(prices);
    System.out.println(average);
    }
    
    }
    **/
    public static void increase(double[][] scores){ 

    	for (int i = 0; i < scores.length; i ++){ 

    	for (int k = 0; k < scores[i].length; k++){ 

    	scores[i][k] *= 10; 

    	} 

    	} 

    	} 
    public static int binarySearch(int[] list, int key) { 

        int lowIndex = 0; 

        int highIndex = list.length - 1; 

     

        while (highIndex >= lowIndex) { 

          int midIndex = (lowIndex + highIndex) / 2;  

          if (key < list[midIndex]){   

    highIndex = midIndex - 1;  

     } 

          else if (key > list[midIndex]){   

    lowIndex = midIndex + 1;        

     } 

          else if (key == list[midIndex]){  

    return midIndex;              

     } 

        } // end of while loop 

      

        return -1; 
}
}