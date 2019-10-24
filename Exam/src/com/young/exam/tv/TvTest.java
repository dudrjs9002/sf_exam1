package com.young.exam.tv;

public class TvTest {

	public static void main(String[] args)
	{
		Tv tv1 = new Tv(30, 5);
		
		Tv tv2 = new Tv();
		tv2.setChannel(50);
		tv2.setVolume(100);
		
		tv1.showState();
		tv2.channelDown();
		
		int volume = tv2.getVolume();
		
}
