package ddit.chap10.sec01;

import java.io.IOException;

public class ExceptionEx06 {

	public static void main(String[] args) {
		try {
			int res = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
