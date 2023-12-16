
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class BOOK_SHELF {
    public static void main(String[] args) {

        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("BookShelf");
            doc.appendChild(rootElement);

            Element Book_1 = doc.createElement("Book");
            rootElement.appendChild(Book_1);

            Element title_1 = doc.createElement("title");
            title_1.appendChild(doc.createTextNode("deadline warrior"));
            Book_1.appendChild(title_1);

            Element publishedYear_1 = doc.createElement("publishedYear");
            publishedYear_1.appendChild(doc.createTextNode("12/14/2023"));
            Book_1.appendChild(publishedYear_1);

            Element numberOfPages_1 = doc.createElement("numberOfPages");
            numberOfPages_1.appendChild(doc.createTextNode("1/3"));
            Book_1.appendChild(numberOfPages_1);

            Element authors_1 = doc.createElement("authors");
            authors_1.appendChild(doc.createTextNode("me"));
            Book_1.appendChild(authors_1);



            Element Book_2 = doc.createElement("Book");
            rootElement.appendChild(Book_2);

            Element title_2 = doc.createElement("title");
            title_2.appendChild(doc.createTextNode("The dreaded deadline"));
            Book_2.appendChild(title_2);

            Element publishedYear_2 = doc.createElement("publishedYear");
            publishedYear_2.appendChild(doc.createTextNode("2025"));
            Book_2.appendChild(publishedYear_2);

            Element numberOfPages_2 = doc.createElement("numberOfPages");
            numberOfPages_2.appendChild(doc.createTextNode("-23"));
            Book_2.appendChild(numberOfPages_2);

            Element authors_2 = doc.createElement("authors");
            authors_2.appendChild(doc.createTextNode("me again"));
            Book_2.appendChild(authors_2);




            Element Book_3 = doc.createElement("Book");
            rootElement.appendChild(Book_3);

            Element title_3 = doc.createElement("title");
            title_3.appendChild(doc.createTextNode("godlike deadline"));
            Book_3.appendChild(title_3);

            Element publishedYear_3 = doc.createElement("publishedYear");
            publishedYear_3.appendChild(doc.createTextNode("2021"));
            Book_3.appendChild(publishedYear_3);

            Element numberOfPages_3 = doc.createElement("numberOfPages");
            numberOfPages_3.appendChild(doc.createTextNode("66"));
            Book_3.appendChild(numberOfPages_3);

            Element authors_3 = doc.createElement("authors");
            authors_3.appendChild(doc.createTextNode("also me"));
            Book_3.appendChild(authors_3);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.transform(new DOMSource(doc), new StreamResult(new File("BookShelf_1.xml")));
            System.out.println("File saved!");

            NodeList nl = doc.getElementsByTagName("*");
            int length = nl.getLength();
            System.out.println(length);
            for (int i = 0; i < length; i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element el = (Element) nl.item(i);
                    if (el.getNodeName().contains("Book")) {
                        String title = el.getElementsByTagName("title").item(0).getTextContent();
                        String publishedYear = el.getElementsByTagName("publishedYear").item(0).getTextContent();
                        String numberOfPages = el.getElementsByTagName("numberOfPages").item(0).getTextContent();
                        String authors = el.getElementsByTagName("authors").item(0).getTextContent();
                        System.out.println(title);
                        System.out.println(publishedYear);
                        System.out.println(numberOfPages);
                        System.out.println(authors);

                    }
                }
            }
            authors_3.appendChild(doc.createTextNode("me me me me me me!"));


            System.out.println("I changed the last node");



            for (int i = 0; i < length; i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element el = (Element) nl.item(i);
                    if (el.getNodeName().contains("Book")) {
                        String title = el.getElementsByTagName("title").item(0).getTextContent();
                        String publishedYear = el.getElementsByTagName("publishedYear").item(0).getTextContent();
                        String numberOfPages = el.getElementsByTagName("numberOfPages").item(0).getTextContent();
                        String authors = el.getElementsByTagName("authors").item(0).getTextContent();
                        System.out.println(title);
                        System.out.println(publishedYear);
                        System.out.println(numberOfPages);
                        System.out.println(authors);

                    }
                }
            }



        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();}}

}