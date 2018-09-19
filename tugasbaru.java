/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tt3e2018;

/**
 *
 * @author Iqbal AR
 */
public class TT3E2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah = 5;
        for (int i=0;i<5;i++){
        	for (int j=0;j<5;j++){
                	if (i==0 || i==4 ||j == 0 || j==4 ){
                        	System.out.print("#");
                        }else{
                            System.out.print("*");
                        
                }
        }
        System.out.println();
      }
    }
}
    

