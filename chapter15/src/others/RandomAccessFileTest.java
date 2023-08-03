package others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요");	// 3바이트*5 + 양쪽의 null문자 (1*2) = 17바이트
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		// 읽기
		rf.seek(0);
		System.out.println("읽기 시작, 파일 포인터 위치:" + rf.getFilePointer());
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
