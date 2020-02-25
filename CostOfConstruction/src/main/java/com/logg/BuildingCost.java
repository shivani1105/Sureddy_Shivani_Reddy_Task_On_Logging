package com.logg;

import java.util.logging.Logger;

public class BuildingCost {
	
	private static final Logger LOGGER=Logger.getLogger(com.logg.BuildingCost.class.getName());
	public int materialStandard;
	public int areaOfHouse;
	
	public BuildingCost(int ms,int area)
	{
		materialStandard=ms;
		areaOfHouse=area;
	}
	
	public int constructionCost(int fa) {
		
		if(materialStandard==1)
		{
			return 1200*areaOfHouse;
		}
		if(materialStandard==2)
		{
			return 1500*areaOfHouse;
		}
		if(materialStandard==3)
		{
			if(fa==0)
				return 1800*areaOfHouse;
			else
				return 2500*areaOfHouse;
		}
		
		return 0;
		
	}
	
	public static void main(String args[]) {
		
		// ch is choice
		//'1' for standard materials 
		//'2' for above standard materials 
		//'3' for high standard materials
		int ch=3; 
		//"Do you want fully automated house:\n '1' for Yes \n '0' for No"
		int f=0;
		int area=400;//area of the house in square feet
		BuildingCost cb=new BuildingCost(ch,area);
		int cost=cb.constructionCost(f);
		LOGGER.info("The cost for construction of building is Rs."+cost);
		
	}
	
	

}
