/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author User
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n=70;
        float r=3;
        float x;
        if (n>0 && r>0 && n>=r) {
        System.out.println("Total Class :" +n/r);
        }
        else {
        System.out.println("Eror");
        }
        if(n>0 && r>0 && n>=r){
        x = n/r;
        System.out.println("Totalclasses : "+x);
        
            for (int i = 1; i <= x; i++) {
                System.out.println("Days "+i);
            }
}
    }
    
}
