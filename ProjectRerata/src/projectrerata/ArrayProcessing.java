/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayProcessing {
    int [] dataBil = new int[100];
    int n,i,j;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya data (n):");
        this.n = input.nextInt();
            for(i=0; i< n; i++){
                System.out.print("Masukan bil ke - " + (i+1)+" : ");
                this.dataBil[i]= input.nextInt();
            }
    }
    double hitungRerata(int[] dataArray){
        double sum = 0;
        for(i=0; i<n; i++){
            sum += dataArray[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    int cariMax(int[] dataArray){
        int max = dataArray[0];
        for(i=0; i<n; i++){
            if (max<dataArray[i]){
                max = dataArray[i];
            }
        }
        return max;
    }
    int cariMin(int[] dataArray){
        int min = dataArray[0];
        for( i=0; i<n; i++){
            if (min>dataArray[i]){
                min = dataArray[i];
            }
        }
        return min;    
    }
    void output(){
        System.out.print("Rerata :" + this.hitungRerata(this.dataBil));
        System.out.print("Nilai min : " + this.cariMin(this.dataBil));
        System.out.print("Nilai max : " + this.cariMax(this.dataBil));
    }   
}
