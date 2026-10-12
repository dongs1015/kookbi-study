package guiTest1;

//1.import
import java.awt.*;

public class FrameTest1 {

	public static void main(String[] args) {
		
		//2.도화지 구매하기
		Frame f=new Frame("나의 첫 Frame");
		
		//3.도화지 크기지정
		f.setSize(300, 300);
		//////////////////////////////
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // 사용자 해상도 정보
		int x =(int)dim.getWidth()/2-150;
		int y =(int)dim.getHeight()/2-150;
		
		System.out.println("x="+x+"/y="+y);
		
		f.setLocation(x, y); // 위치
		
//		//FlowLayout (int align, int hgap, int vgap)
//		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,30,30);
//		f.setLayout(fl);
		
		//BorderLayout (int hgap, int vgap)
		BorderLayout bl = new BorderLayout(30,30); 
		f.setLayout(bl); // 이 상태로는 불가능 등록할때 위치를 결정해야함
		
		Button bt1=new Button("bt1");
		Button bt2=new Button("bt2");
		Button bt3=new Button("bt3");
		Button bt4=new Button("bt4");
		Button bt5=new Button("bt5");
		
		f.add(bt1, BorderLayout.NORTH); // Border 위치 정해줌
		f.add(bt2, BorderLayout.SOUTH);
		f.add(bt3, "Center");
		f.add(bt4, "West");
		f.add(bt5, "East");
		
		/// //////////////////////////
		//4.눈에 보이도록 활성화
		f.setVisible(true);
		
		// 프레임의 디폴트 레이아웃은 보더 레이아웃이다.
		
	}

}
