/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELS;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import static com.itextpdf.text.FontFactory.HELVETICA;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dell
 */
public class ReleveBancaire {
    private ResultSet Res;
    
    public void GeneratePDF(String path,String NomPrenom,String cin,Operation operations,int periode,String from,String to) throws FileNotFoundException, DocumentException, BadElementException, IOException, SQLException, ParseException{
        
        this.Res = operations.Operation_From_To(cin,from,to);
        
        String Cl=" Jours";
        if(periode>30){
            periode = (int )(periode/30);
            Cl = " Mois";
        }
                
        Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            Image image2 = Image.getInstance("./img/header.png");
            image2.scaleAbsolute(520f, 90f);
            document.add(image2);
            
            
            Paragraph title = new Paragraph("Historique des opérations", FontFactory.getFont(FontFactory.COURIER, 30, Font.BOLD, new CMYKColor(200, 200, 0, 90)));
            title.setAlignment(1);
            document.add(title);
            
             // add a blank lines
            document.add( Chunk.NEWLINE );
            
            Paragraph NomP = new Paragraph("Nom et Prenom:\t"+NomPrenom, FontFactory.getFont(FontFactory.COURIER, 15));
            Paragraph NumC = new Paragraph("Numéro de client:\t"+cin, FontFactory.getFont(FontFactory.COURIER, 15));
            Paragraph Periode = new Paragraph("Période:\t"+periode+Cl.toString(), FontFactory.getFont(FontFactory.COURIER, 15));
            
            document.add(NomP);
            document.add(NumC);
            document.add(Periode);
            
            // add a blank lines
            document.add( Chunk.NEWLINE );
            document.add( Chunk.NEWLINE );
            /* Create table of operation
            *
            */            
            PdfPTable table = new PdfPTable(5);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell("Nom Prénom");
            table.addCell("Compte Distination");
            table.addCell("Libellé opeartion");
            table.addCell("Montant");
            table.addCell("Date Operation");
            
            
            table.setHeaderRows(1);
            PdfPCell[] cells = table.getRow(0).getCells(); 
            for (int j=0;j<cells.length;j++){
                cells[j].setBackgroundColor(BaseColor.GRAY);
            }
            
            while (Res.next()){
                String np=Res.getString(5).toUpperCase()+" "+Res.getString(6).toUpperCase();
                table.addCell(np);
                table.addCell(Res.getString(1));
                table.addCell(Res.getString(2));
                table.addCell(Res.getString(3));
                table.addCell(Res.getString(4));
                
            }
            
            document.add(table);
           
            document.close();
            System.out.println("Done");
    }
    
}
