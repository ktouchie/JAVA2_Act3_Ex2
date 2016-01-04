import java.util.*;
class elemnull {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of ROWS in the array:");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of COLUMNS in the array:");
        int m = sc.nextInt();
        
        String[][] array = new String[n][m];
        
        System.out.println("You will need to enter a total of " + (n*m) + " values to complete the array.");
        
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++) {
                Scanner scan = new Scanner(System.in);  // Without this 2nd scanner system, user unable to enter a first value (output was 2x "Enter a value")
                System.out.println("Enter a value:");
                array[i][j] = scan.nextLine();
            }
        }
        
        System.out.println("Your array is complete:");
        
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}