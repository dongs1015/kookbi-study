package day21;

import java.io.*;




public class StringApiTest {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("문장입력: ");
		String user=br.readLine();
		System.out.print("찾을문자:");
		String see=br.readLine(); 
		int count = 0;
		int idx = user.indexOf(see);
		while (idx != -1) {
		    count++;
		    idx = user.indexOf(see, idx + 1);
		}
		System.out.println("총"+see+"는"+count+"개 발견되었습니다.");
	}

}
