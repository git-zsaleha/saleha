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
	   String ptName;
       String Age;
       String tName;
       String Price;
       String payBy;
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
	  Scanner scan=new Scanner(System.in);
	  PDPageContentStream contentStream= new PDPageContentStream(document , page);
	  contentStream.beginText();
	  contentStream.setFont( font, 12);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(215, 750);
	  String Title = new String("FAMOUS MEDICAL & CLINIC");
	  
	  contentStream. showText(Title);
      contentStream.endText();
      contentStream.beginText();
      PDType1Font font1 = new PDType1Font(FontName.COURIER_BOLD);
	  contentStream.setFont( font, 10);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(225, 725);
	  String text1 = new String("MAIN ROAD ,CHATRA");
      contentStream. showText(text1);
      contentStream.endText();
      contentStream.beginText();
	  contentStream.setFont( font, 10);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(225, 715);
	  String text2 = new String("Phone:7487525267");
      contentStream. showText(text2);
      contentStream.endText();
      contentStream.beginText();
      PDType1Font font2 = new PDType1Font(FontName.TIMES_ITALIC);
      //Setting the position for a line
      contentStream.setFont( font, 12);
	  contentStream.setLeading(35.5f);
	   contentStream.newLineAtOffset(105, 650);
	   System.out.println("Patient Name");
	   ptName = scan.nextLine();
	  contentStream. showText("patient name:  ");
	  contentStream. showText(   ptName);
      contentStream.endText();
      contentStream.beginText();
      //Setting the position for a line
      contentStream.setFont( font, 12);
	  contentStream.setLeading(15.5f);
	   contentStream.newLineAtOffset(105, 625);
	   System.out.println("Age");
	   Age = scan.nextLine();
	  contentStream. showText("Age:  ");
	  contentStream. showText(Age);
      contentStream.endText();
      contentStream.beginText();
      //Setting the position for a line
      contentStream.setFont( font, 12);
	  contentStream.setLeading(40.5f);
	   contentStream.newLineAtOffset(105, 600);
	   System.out.println("Test Name");
	   tName = scan.nextLine();
	  contentStream. showText("Test Name:  ");
	  contentStream. showText(tName);
      contentStream.endText();
      contentStream.beginText();
      //Setting the position for a line
      contentStream.setFont( font, 12);
	  contentStream.setLeading(45.5f);
	   contentStream.newLineAtOffset(105, 575);
	   System.out.println("Amount");
	   Price = scan.nextLine();
	  contentStream. showText("Amount:  ");
	  contentStream. showText(Price);
      contentStream.endText();
      contentStream.beginText();
      //Setting the position for a line
      contentStream.setFont( font, 12);
	  contentStream.setLeading(50.5f);
	   contentStream.newLineAtOffset(105, 550);
	   System.out.println("Pay by Cash");
	   payBy = scan.nextLine();
	  contentStream. showText("Pay by Cash:  ");
	  contentStream. showText(payBy);
      contentStream.endText();
      contentStream.beginText();
	  contentStream.setFont( font, 14);
	  contentStream.setLeading(25.5f);
      //Setting the position for a line
	  contentStream.newLineAtOffset(150, 525);
      contentStream. showText("THANKYOU");
      contentStream.endText();
      contentStream.beginText();
	  contentStream.setFont( font, 14);
	  contentStream.setLeading(25.5f);
      PDType1Font font3 = new PDType1Font(FontName.TIMES_BOLD_ITALIC);
      //Setting the position for a line
	  contentStream.newLineAtOffset(150, 500);
      contentStream. showText("GET WELL SOON");
      contentStream.endText();
     
      contentStream.close();
      
    //path where the PDF file will be store
	 document.save("D:\\medical Invoice.pdf");
	//prints the message if the PDF is created successfully   
	  System.out.println("PDF created"); 
	//closes the document  
	  document.close();  
	}  
  
	}  


