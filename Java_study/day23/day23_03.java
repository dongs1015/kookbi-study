package day23; // day22_07 교수님버전

import java.util.*;

public class day23_03 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("파일명 입력:");
		
		String filename=sc.nextLine();
		
		String ind[]= {"jpg","gif","png"};
		
		int position=filename.lastIndexOf(".");
		String temp=filename.substring(position+1);         
		System.out.println(temp);
		// 맨뒤에 가져오는거파일명 ex)입력:iu.jpg.text  text
		
		boolean sw=true;
		for(int i=0; i<ind.length; i++) {
			if(filename.equals(ind[i])) {
				System.out.println("이미지 파일이 맞습니다!");
				sw=false;
			}
		}
		if(sw) {
			System.out.println("이미지 파일이 아닙니다.");
		}
		// 이미지파일이거나 아닌경우 나오게함 
// 파일명 입력:iu.jpg.text  text  이미지 파일이 아닙니다.
// 파일명 입력:iu.jpg jpg  이미지 파일이 아닙니다.

//		
//		if(filename.endsWith("jpg")||("gif")||("png")) {
//			
//		}
	
	}
}
