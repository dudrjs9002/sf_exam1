package com.young.exam.tv;
//private(그 클래스에만), default, protected, public(완전개방)
public class Tv 
{

	protected int channel;
	protected int volume;
	
	
	Tv() {}
	
	Tv(int channel, int volume)
	{
		this.channel = channel;
		this.volume = volume;
	}
	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel < 1)
		{
			this.channel = 1;
		}
		else if(channel > 300)
		{
			this.channel = 300;
		}
		else 
		{
			this.channel = channel;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) 
	{
		if(volume < 0)
		{
			this.volume = 0;
		}
		else if(volume > 100)
		{
			this.volume = 100;
		}
		else 
		{
			this.volume = volume;
		}
	}

	
	
	void showState()
	{
		System.out.printf("channel : %d", volume);
	}
	
	void channelUp()
	{
		channel++;
	}
	void channelDown()
	{
		channel--;
	}
}
