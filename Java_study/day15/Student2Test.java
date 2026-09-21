package day15;

import java.io.*;
import day15.Student2;

public class Student2Test {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		Student2 st1 = new Student2();
		System.out.println("학생정보1");
		System.out.print("이름:");
		st1.setName(br.readLine());
		System.out.print("국어:");
		st1.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어:");
		st1.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학:");
		st1.setMath(Integer.parseInt(br.readLine()));
		/**
		 * System.out.print("국어:");
		String kor_s=br.readLine();
		int kor=Integer.parseInt(kor_s);
		s1.setKor(kor);
		System.out.print("영어:");
		st1.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학:");
		st1.setMath(Integer.parseInt(br.readLine()));
		 * */
		
		Student2 st2 = new Student2();
		System.out.println("학생정보2");
		System.out.print("이름:");
		st2.setName(br.readLine());
		System.out.print("국어:");
		st2.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어:");
		st2.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학:");
		st2.setMath(Integer.parseInt(br.readLine()));
		
		
		Student2 st3 = new Student2();
		System.out.println("학생정보3");
		System.out.print("이름:");
		st3.setName(br.readLine());
		System.out.print("국어:");
		st3.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어:");
		st3.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학:");
		st3.setMath(Integer.parseInt(br.readLine()));
		
		System.out.println("==================================");
		st1.getInfo();
		st2.getInfo();
		st3.getInfo();
	}

}
