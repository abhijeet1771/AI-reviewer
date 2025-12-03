public class Calculator {
    // Simple calculator with potential issues for AI to find
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        // Potential issue: no overflow check
        return a * b;
    }
    
    public double divide(int a, int b) {
        // Potential issue: no division by zero check
        return a / b;
    }
    
    public void printResult(int result) {
        System.out.println("Result: " + result);
    }
    
    // New methods with bugs for AI to catch
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;  // No overflow check - AI should catch this
        }
        return result;
    }
    
    public String concatenate(String a, String b) {
        // Potential null pointer - AI should catch
        return a + b;
    }
    
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        // No negative number check - AI should catch
        return n * factorial(n - 1);
    }
}

