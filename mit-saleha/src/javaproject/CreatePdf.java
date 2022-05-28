package javaproject;


import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;    
import org.apache.pdfbox.pdmodel.PDPageContentStream;

public class CreatePdf {
	
   public static void main(String args[]) throws IOException   
	{  
	PDDocument pdfdoc= new PDDocument();
	PDPage myPage = new PDPage();
	pdfdoc.addPage(myPage);  
	/*try(PDPageContentStream invc=new PDPageContentStream(pdfdoc,myPage)) {
		invc.beginText();
		 invc.setFont(null, 0);
	      invc.newLineAtOffset(270, 690);
		String line1="Indian Hospital,"+"Dr.M.Parasad";
		invc.showText(line1);
		invc.newLine();
		invc.endText();
		String line2="Main Road Ranchi";
		invc.showText(line2);
		invc.newLine();
		invc.endText();
	}*/
	//path where the PDF file will be store  
	pdfdoc.save("C:\\Users\\HP i5\\eclipse\\java-2022-03\\eclipse\\Java PDF\\Report.pdf");  
	//prints the message if the PDF is created successfully   
	System.out.println("PDF created"); 
	//closes the document  
	pdfdoc.close();  
	}  
	}  


