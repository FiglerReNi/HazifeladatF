/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
import java.util.Scanner;
public class HazifeladatF {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Kérem a számot: ");
        int a=sc.nextInt(); 
        int[] c=new int[15];
        int index=0;
        while(a!=0){
            if(a%2==0){
                c[index]=0;
                index++;
                a=a/2;
            }
            else{
                c[index]=1;
                index++;
                a=(a-1)/2;
            }       
            } 
        for(int i=(index-1); i>=0; i--){
                System.out.print(c[i]+" ");
            }
            }
         }
    
    
