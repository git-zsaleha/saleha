package javaproject;

import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1CFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName;

public class CreatePdf {
	
   public static void main(String args[]) throws IOException   
	{  
	  
	  PDDocument document=new PDDocument();
	  
	
	  
	  //Create Blank Page
	   PDPage newpage = new PDPage();
	    //Add the blank page
	   document.addPage(newpage);
	    
	  //PDPage page=new PDPage();
	  PDPage page=document.getPage(0);
	//  document.addPage(page);
	 // PDFont font =PDType1Font;
	  
	  PDType1Font font = new PDType1Font(FontName.HELVETICA_BOLD);
	  
	  PDPageContentStream contentStream= new PDPageContentStream(document , page);
	  contentStream.beginText();
	  contentStream.setFont( font, 12);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(215, 750);
	  String Title = new String("FAMOUS MEDICAL HALL");
	  
	  contentStream. showText(Title);
      contentStream.endText();
      contentStream.beginText();
	  contentStream.setFont( font, 10);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(230, 735);
	  String subTitle = new String("INDIAN CLINIC");
      contentStream. showText(subTitle);
      contentStream.endText();
      contentStream.beginText();
      PDType1Font font1 = new PDType1Font(FontName.COURIER_BOLD);
	  contentStream.setFont( font, 8);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(225, 725);
	  String text1 = new String("MAIN ROAD ,CHATRA");
      contentStream. showText(text1);
      contentStream.endText();
      contentStream.beginText();
      PDType1Font font2 = new PDType1Font(FontName.TIMES_ITALIC);
	  contentStream.setFont( font, 8);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(225, 715);
	  String text2 = new String("Phone:7487525267");
      contentStream. showText(text2);
      contentStream.endText();
     
      contentStream.close();
      
    //path where the PDF file will be store
	 document.save("D:\\Invoic.pdf");
	//prints the message if the PDF is created successfully   
	  System.out.println("PDF created"); 
	//closes the document  
	  document.close();  
	}  
  /* void getPage() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Patient name  ");
	   String ptName=sc.next();
   }*/
	}  


