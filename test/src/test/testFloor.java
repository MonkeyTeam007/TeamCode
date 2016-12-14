package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.junit.Test;


public class testFloor {
	
//	public static void main(String[] args) {
//		System.out.println(new Double(0+1)/51);
//		System.out.println(Math.round(new Double(0+1)/51*100-1));
//	}
	
	@Test
	public void test(){
		 String strInput ="������";
	        StringBuffer output = new StringBuffer();
	        System.out.println("\""+strInput+ "\" ��utf8���룺");
	        for (int i = 0; i < strInput.length(); i++)
	        {
	            output.append("&#x" +Integer.toString(strInput.charAt(i), 16)+";");
	        }        
	        System.out.println(output);
		}
	@Test
	public void testOrder(){
		List<String> orderList=new ArrayList<String>();
		
		orderList.add("������");
		orderList.add("�Զ������");
		orderList.add("�����");
		
		StringBuffer order = new StringBuffer();
		for (int i = 0; i < orderList.size(); i++) {
			if (i < orderList.size() - 1) {
				order.append("<hop>");
				//ת�� utf-8
				String strInput=orderList.get(i);
				String strInput1=orderList.get(i + 1);
				 StringBuffer output = new StringBuffer();
				 StringBuffer output1 = new StringBuffer();
				 for (int k = 0; k < strInput.length(); k++) {
					 output.append("&#x" +Integer.toString(strInput.charAt(k), 16)+";");
				}
				 for (int k = 0; k < strInput1.length(); k++) {
					 output1.append("&#x" +Integer.toString(strInput1.charAt(k), 16)+";");
				 }
				order.append("<from>" + output.toString() + "</from>");
				order.append("<to>" + output1
				+ "</to><enabled>Y</enabled>");
				order.append("</hop>");
			}
		}
		System.out.println(order);
	}
	@Test
	public void testUTF(){
		 String strInput ="�Զ������";
	        StringBuffer output = new StringBuffer();
	        System.out.println("\""+strInput+ "\" ��utf8���룺");
	        for (int i = 0; i < strInput.length(); i++)
	        {
	            output.append("&#x" +Integer.toString(strInput.charAt(i), 16));
	        }        
	        System.out.println(output);
	        System.out.println(new String("&#x8868;&#x8f93;&#x5165;"));
	}
	
	@Test
	public void testJDBC(){
	      Properties p=new Properties();
	      try {
	           //ͨ�����·�������ļ�
	            p.load(new FileInputStream(new File("db.properties")));
	            //��getProperty����ͨ���ؼ��ֻ�ȡ��
	        } catch (Exception e) {
	            e.printStackTrace();
	        }       
	}
	@Test
	public void testLong(){
		long aa=1111;
		String string = Long.toString(aa);
		System.out.println(string);
		
		BigInteger bb=new BigInteger("2222");
		System.out.println(bb);
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		System.out.println("-----"+lotteryOdds);
	}
	
	@Test
	public void test00(){
		Object ob=true;
		if(ob.equals(true)){
			System.out.println("=====");
		}
	}
	@Test
	public void test001(){
		StringBuffer sb=new StringBuffer();
		sb.append("�ϴ�ktr�ļ�ʧ��\r\n������룺0\r\n������Ϣ����������");
		System.out.println(sb.toString());
	}
}
