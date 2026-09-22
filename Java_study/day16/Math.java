package day16;

public class Math extends YongMath{
	
	public int getMaxNum(int num1,int num2) {
		if(num1 > num2) {
				return num1;
		}else {
		
			return num2;
		}
		
	}
	
	public double getMaxNum(double num1,double num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public void getInfo() {
		super.getInfo();
		
	}

}
