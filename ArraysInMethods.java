
package arraysinmethods;


public class ArraysInMethods {

    
    public static void main(String[] args) {
        int mary[] = {1,2,3,4,5};
        change(mary);
        
        for(int  y :mary){
         System.out.println(y);   
        }
        
    }
    public static void change(int x[]){
        for(int index=0;index<x.length;index++){
            x[index] +=5;
        }
    }
}
