package codebase;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
 
public class ReadXML {
    public static void main(String[] args) throws Exception  {
 
        //The two lines below are just for getting an
        //instance of DocumentBuilder which we use
        //for parsing XML data
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
 
        //Parsing of xml is done here
        Document doc = builder.parse(new File("C:/Testbestanden/export.xml"));
 
        //Here we get the root element of XML and print out
        Element rootElement = doc.getDocumentElement();
 
        //Here we get a list of all elements named 'child'
        NodeList list = rootElement.getElementsByTagName("bd-bedr:RetainedProfitsFiscal");
 
        //Traversing all the elements from the list and printing
        //out its data
        for (int i = 0; i < list.getLength(); i++) {
             
            //Getting one node from the list.
            Node childNode = list.item(i);
           
            System.out.println("Waarde: " + childNode.getTextContent());
        }
    }
}