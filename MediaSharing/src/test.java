

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class test {

public void main(){
	 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
     DocumentBuilder builder;
     String xml="<firstname>aaa</firstname><lastname>bbb</lastname>";
     InputSource is;
     try {
         builder = factory.newDocumentBuilder();
         is = new InputSource(new StringReader(xml));
         Document doc = builder.parse(is);
         NodeList list = doc.getElementsByTagName("firstname");
         NodeList list1 = doc.getElementsByTagName("lastname");
         System.out.println("fname"+list.item(0).getTextContent());
     } catch (ParserConfigurationException e) {
     } catch (SAXException e) {
     } catch (IOException e) {
     }
	
}
	
}
