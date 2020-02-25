package si_ci_Log;

import java.util.logging.Logger;

public class CompoundInterest {
	
	private  static final Logger LOGGER = Logger.getLogger(CompoundInterest.class.getName());
	public double principleAmt;
	public double rateOfInterest;
	public double timePeriod;
	
	public CompoundInterest(double pAmt,double rate,double noOfYears)
	{
	    principleAmt=pAmt;
	    rateOfInterest=rate;
	    timePeriod=noOfYears;
    }
	
	public void calculateCI() {
		
		double amount=0,t=1;
        rateOfInterest=(1+rateOfInterest/100);
        for(int i=0;i<timePeriod;i++)
          t*=rateOfInterest;
	    amount=principleAmt*t;
        double ci=amount-principleAmt;
        LOGGER.info("the compound interest is "+ci);
        
	}
	
	
	public static void main(String args[]) {
		
		
		double pa=5000;//principal amount
		double roi=2;//rate of interest
		double noy=3;//no.of.years
		CompoundInterest c=new CompoundInterest(pa,roi,noy);
		c.calculateCI();
	}

}
