package javaproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Date;

import javax.net.ssl.HttpsURLConnection;

public class SendSms {
	public static void sendSms(String message,String number) {
		
		try {
		String apikey="uB5Dtwmd3MAYEPJSTx2FkbNgLs7CrQVvz48jaoyqIW9eflO0KiDCNlytoFQXuxvIadsnh0YrReqULmJTMM";
		
		message=URLEncoder.encode(message, "UTF-8");
		String language="english";
		String route="q";//q means Quick SMS whereas other types also available, refer the fast2sms.com
       
			String myUrl=" https://www.fast2sms.com/dev/bulkV2?authorization="+apikey+
				"&message="+message+"&language="+language+"&route="+route+"&flash=0"+"&numbers="+number;
		
		//sending get request using java
		URL url=new URL(myUrl);
		HttpsURLConnection con=(HttpsURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent","Mozilla/5.0");
		con.setRequestProperty("cache-control","no-cache");
		System.out.println("WAIT.......");
		int code=con.getResponseCode();
		System.out.println("Reponce code"  +code);
		StringBuffer responce=new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		while(true) {
			String line=br.readLine();
			if(line==null)
			{
				break;
			}
			responce.append(line);
		}
		System.out.println(responce);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("program started");
	
		SendSms.sendSms("Health is not just about diet.It's also about a way of thinking and a way of being"
				+ "  THANKS..." ,"8863022348");
	}
}
	


