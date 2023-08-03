package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		
		long 시작시간 = System.currentTimeMillis();
		
		try(FileInputStream fis = new FileInputStream("chapter14.zip"); FileOutputStream fos = new FileOutputStream("copy.zip"); BufferedInputStream bis = new BufferedInputStream(fis); BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int i;
			int sum = 0;
			
			while( (i = bis.read()) != -1) {
				
				bos.write(i);
				sum++;
			}
			
//			while( (i = fis.read()) != -1) {
//				
//				fos.write(i);
//				sum++;
//			}
			System.out.println("총 바이트 수:"+sum);
		
	        // 종료 시간 기록
	        long 종료시간 = System.currentTimeMillis();

	        // 실행 시간 계산
	        long 실행시간 = 종료시간 - 시작시간;
	        
	        System.out.println(실행시간  + " 밀리초");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
