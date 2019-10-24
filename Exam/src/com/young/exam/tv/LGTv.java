package com.young.exam.tv;

public class LGTv extends Tv
{
    
	public static String model; 
	
	public LGTv() {}
	
	public LGTv(String str) {}
	
	public void record()
	{
		System.out.println("녹화를 하고 있습니다.");
	}
	@Override
	public void showState()
	{
		System.out.println("!!!!!");
	}
	@Override
	public String toString()
	{
		return "LGtv임!! ㅋㅋㅋ";
	}
}
