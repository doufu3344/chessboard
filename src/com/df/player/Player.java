package com.df.player;

import java.util.Random;

import com.df.computer.computer;

public class Player {
	private static int a,b;
	private static int[][]list;
	
	public void computerCoor(int Who,int Mode){
		if(Mode == 0){
			computer computer = new com.df.computer.computer();
			computer.SetList(list);
			com.df.computer.computer.computePositon(Who);//电脑计算坐标
			a = com.df.computer.computer.Geta();
			b = com.df.computer.computer.Getb();
		}
		if(Mode == 1){

			
			Random ran =new Random(System.currentTimeMillis()); 
			a = ran.nextInt(15);
			b = ran.nextInt(15);
			
			
			
		}
	}
	
	public void SetList(int[][] l){
		list = l;
	}	
	public static int Geta(){
		return a;
	}
	public static int Getb(){
		return b;
	}
}
