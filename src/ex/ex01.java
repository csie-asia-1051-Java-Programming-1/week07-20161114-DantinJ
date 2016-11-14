package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int a = scn.nextInt();
		System.out.println(var(a));
		System.out.println(std(var(a)));
	}
	public static double var(int a){
		Scanner scn=new Scanner(System.in);
		int data[] = new int[a];
		double sum=0;
		double q=0;
		double fin=0;
		
		for(int j=0;j<a;j++){
			data[j]=scn.nextInt();
		}
		for (int x=0;x<a;x++){
			sum=data[x]+sum;
		}
		q=sum/a;
		for(int y=0;y<a;y++){
			fin=((data[y]-q)*(data[y]-q))/a+fin;
		}
		return fin;
		}
		
	public static double std(double fin){
		double x=Math.pow(fin,1/2);
		return x;
	}
	}


