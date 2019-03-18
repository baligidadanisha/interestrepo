package task2;
import java.util.*;
public class interestcac {
     static double SI(double p,double r,double t)
		{
			double s;
			s=(p*t*r)/100;
			return(s);
		}
		static double CI(double p,double r,double t)
		{
			double c;
			c=p*Math.pow(1.0+r/100.0, t)-p;
			return(c);
		}
		
  public static void main(String[] args) {
		Scanner K=new Scanner(System.in);
		double p,t,r;
		p=K.nextDouble();
		r=K.nextDouble();
		t=K.nextDouble();
		System.out.println(SI(p,r,t));
		System.out.println(CI(p,r,t));

	}

}
