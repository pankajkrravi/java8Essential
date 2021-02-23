package src.com.example.java;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	private static final String FLOWERS_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";

	public static void main(String[] args) {
		try {
			URL url = new URL(FLOWERS_FEED);
			InputStream inputStream = url.openStream();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			StringBuilder builder = new StringBuilder();
			while (true) {
				int data = bufferedInputStream.read();
				if (data == -1) {
					break;
				} else {
					builder.append((char) data);
				}
			}
			System.out.println(builder);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		//close all resources
		}
	}

}
