// Subtract the product and sum of digits of an integer - leetcode solution
package LocalRepo;

public class SubtractProduct {
  
  public int subtractProductAndSum(int n) {

    // Initialize product and sum to 1 and 0 respectively
    
    int product = 1;
    int sum = 0;
    
    // Loop through each digit of the integer
    while (n > 0) {
        // Get the last digit of the integer
        int digit = n % 10;
        
        // Update the product and sum
        product *= digit;
        sum += digit;
        
        // Remove the last digit from the integer
        n /= 10;
    }
    
    // Return the difference between the product and sum
    return product - sum;
    }
}
