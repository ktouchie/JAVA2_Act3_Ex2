import java.util.*;
class elemnull {
    
    public static void main(String[] args) {
        
        Integer[][] array = {{1,null,3},{null,5,6},{7,8,null},{10,11,12}};
        
        double n = array.length;
        double m = array[0].length;
        
        double total = n*m;
        
        int sum = 0;
        
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++) {
                System.out.print(array[i][j] + "   ");
                if (array[i][j] == null) {
                    sum++;
                }
            }
            System.out.println("");
        }
        
        double proportion = sum/total;
        
        System.out.println("The proportion of null values is " + 100*proportion + "%.");

    }
}