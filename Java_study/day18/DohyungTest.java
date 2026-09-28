package day18;

//pm --도형의 넓이를 구하는 프로그램
abstract class Dohyung{
	String name;
	
	public void getInfo() {
		System.out.println("==도형 넓이 프로그램 v1.0==");
	}
	abstract public void area(int i, int j);
}
//둘리 -- 사각형의 널이
class Rect extends Dohyung{
	
	public Rect() {
		name="사각형";
	}
	
	public void area(int i, int j) {
		int result=i*j;
		System.out.println(name+"의 넓이:"+result);
	}
}
//도우너 -- 삼각형의 넓이
class Triangle extends Dohyung{
	
	public Triangle() {
		name="삼각형";
	}
	
	public void area(int num1, int num2) {
		int result=num1*num2/2;
		System.out.println(name+"의 넓이:"+result);
	}
}
//홍길동 -- 원의 넓이
abstract class Circle extends Dohyung{
	
	abstract public void area(int i);
}
//홍길동의 부사수
class Circle2 extends Circle{
	
	public Circle2() {
		name="원";
	}
	public void area(int i) {
		double result=i*i*Math.PI;
		System.out.println(name+"의 넓이:"+result);
	}
	public void area(int i,int j) {}
}

public class DohyungTest {

	public void goArea(int i,int j) {
		System.out.println("=가로"+i+"/세로:"+j+"인 각각 도형의 넓이");
		
		Rect r=new Rect();
		r.area(i, j);
		Triangle t=new Triangle();
		t.area(i, j);
		Circle2 c=new Circle2();
		c.area(i);
		
		Dohyung d2 =new Rect();
		d2.area(5, 5);
		d2.getInfo();
		Dohyung d3 =new Triangle();
		d3.area(5, 5);
		Dohyung d4 = new Circle2();
		d4.area(5, 5);
		
		Circle d5=(Circle)d4;
		d5.area(5);
		
		Dohyung arr[]=new Dohyung[3];
		arr[0] = new Rect();
		arr[1] = new Triangle();
		arr[2] = new Circle2();
		
		for(int z=0; z<arr.length; i++) {
			if(arr[z] instanceof Circle2){
				Circle temp=(Circle2)arr [z];
				temp.area(3);
			}else {
				arr[z].area(3, 3);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		DohyungTest dt = new DohyungTest();
		dt.goArea(3,5);
	}

}
