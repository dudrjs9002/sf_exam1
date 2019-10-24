package com.young.exam.tv;

public class SamsungTv extends Tv 
{
	@Override //원 파일 것 쓰지않고 독자적으로 쓰는 것!
	void channelUp()
	{
		channel += 5;
	
	}
	@Override
	public String toString()
	{
		return String.format("%stv의 채널: %d, 볼륨 : %d", "삼성", channel, volume);
	}

}
