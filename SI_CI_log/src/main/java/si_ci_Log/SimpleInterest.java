package si_ci_Log;

import java.util.logging.Logger;

public class SimpleInterest {
	
	private static final Logger LOGGER = Logger.getLogger(si_ci_Log.SimpleInterest.class.getName());
	public double principleAmt;
	public double rateOfInterest;
	public double timePeriod;
	
	public SimpleInterest(double pAmt,double rate,double time) {
		
		principleAmt=pAmt;
		rateOfInterest=rate;
		timePeriod=time;
		
	}
	
	public void calculateSI() {
		
		double si=(principleAmt*rateOfInterest*timePeriod)/100;
		LOGGER.info("the simple interest is "+si);
	}
	
	public static void main(String args[]) {
		
		
		double pa=1200;//principle amount
		double roi=2;//rate of interest
		double tp=3;//time period
		SimpleInterest s=new SimpleInterest(pa,roi,tp);
		s.calculateSI();
		
	}

}
