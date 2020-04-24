/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onepasstwig2stack;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;



/**
 *
 * @author Descartes Fowo
 */
public class OnePasstwig2Stack {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        /*
            XmlDocument xmlDocument= new XmlDocument(new DocElement("a1"));
            XmlDocument d2= new XmlDocument(new DocElement("b1"));
            xmlDocument.addChild(new XmlDocument(new DocElement("a2")));
            xmlDocument.addChild(d2);
            xmlDocument.addChild(new XmlDocument(new DocElement("a3")));
            d2.addChild(new XmlDocument(new DocElement("b2")));
            d2.addChild(new XmlDocument(new DocElement("b3")));
            xmlDocument.printPosOrder();
         
        File inputFile = new File("doc.xml");
        XmlDocument doc = Utils.parse(inputFile);
        Stack<DocElement> stack = new Stack<>();
        doc.buildStack(stack); 
        try { 
            Home fen = new Home(doc);
            fen.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Preftwig2Stack.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        // Stack<DocElementPref> stack = new Stack<>(); 
        //doc.buildPrefStack(stack);
        // doc = null;   
        //System.out.println("Hs before PrefTiwg2Stack: " + Hs.toString());
/*        GTPResult response = null, result = null;
        Thread t2 = new Thread() {
            public void run() {
                File inputFile = new File("firstTest.xml");
                XmlDocument doc = Utils.parse(inputFile);
                Stack<DocElementPref> stack = new Stack<>();
                doc.buildPrefStack(stack);
                long startTime = System.nanoTime();
                HierachicalStack Hs = GenData.generateHierachicalStackForTreeBank();
                MainFunctions instance = new MainFunctions();
                instance.PrefTwig2Stack(stack, Hs);
                instance.filterHS(Hs);
                SOT eSOT = Hs.makeSOT();
                GTPResult response = instance.enumTiwg2Stack(Hs, eSOT);
                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println("PrefTwig2Stack " + totalTime);
                System.out.println("+++ " + response.getTupes().size());
            }
        };
        Thread t1 = new Thread() {
            public void run() {
                ThreadMXBean thread = ManagementFactory.getThreadMXBean();
                Runtime runtime = Runtime.getRuntime();
                runtime.gc();
                long initialMemory = runtime.totalMemory() - runtime.freeMemory();
                long initialTime = thread.getCurrentThreadCpuTime();

                File inputFile = new File("firstTest.xml");
                XmlDocument doc = Utils.parse(inputFile);
                Stack<DocElement> stack1 = new Stack<>();
                doc.buildStack(stack1);
                long startTime = System.currentTimeMillis();
                 HierachicalStack hs = GenData.generateHierachicalStackForTreeBank();
               Twig2Stack instance = new Twig2Stack();
                instance.twig2Stack(stack1, hs);
                SOT eSOT = hs.makeSOT();
                GTPResult result = instance.enumTiwg2Stack(hs, eSOT);
                 
                long finalTime = thread.getCurrentThreadCpuTime();
                long finalMemory = runtime.totalMemory() - runtime.freeMemory();

                System.out.println(String.format("Execution Time %s nanoseconds", finalTime - initialTime));
                System.out.println(String.format("Delta memory %s", finalMemory - initialMemory));

                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
                System.out.println("Twig2Stack " + totalTime);
                System.out.println("--- " + result.getTupes().size());
            }
        };
        //t1.start();  
       // t1.start();
        ThreadMXBean tr = ManagementFactory.getThreadMXBean();
        long t = tr.getThreadCpuTime(t1.getId());

        long startTime = System.currentTimeMillis();

        File inputFile = new File("firstTest.xml");
        XmlDocument doc = Utils.parse(inputFile);
        Stack<DocElement> stack1 = new Stack<>();
        doc.buildStack(stack1);
        HierachicalStack hs = GenData.generateHierachicalStackForTreeBank();
        Twig2Stack instance = new Twig2Stack();
        instance.twig2Stack(stack1, hs);
        SOT eSOT = hs.makeSOT();
        GTPResult result2 = instance.enumTiwg2Stack(hs, eSOT);

        long endTime = System.currentTimeMillis();
        System.out.println(String.format("****Delta memory %s", endTime - startTime));

        System.err.println(tr.isThreadCpuTimeEnabled());
        System.out.println("CPU Time " + t);
        /*       Thread t3 = new Thread() {
            public void run() {
                File inputFile = new File("testPref.xml");
                XmlDocument doc = Utils.parse(inputFile);
                Stack<DocElementPref> stack = new Stack<>();
                doc.buildPrefStack(stack);
                long startTime = System.nanoTime();
                HierachicalStack Hs = GenData.generateHierachicalStackForDataTest2DB();
                MainFunctions instance = new MainFunctions();
                instance.PrefTwig2Stack(stack, Hs);
                System.out.println("Hierachical Before =  " + Hs);
                instance.filterHS(Hs);
                System.out.println("Hierachical Before after =  " + Hs.printTop());
                SOT eSOT = Hs.makeSOT();
                GTPResult response = instance.enumTiwg2Stack(Hs, eSOT);
                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println("PrefTwig2Stack " + totalTime);
                System.out.println("+++ " + response);
            }
        };
        t3.start(); */
//        Thread t3 = new Thread() {
//            public void run() {
//                HierachicalStack Hs = GenData.generateHierachicalStackForDataTest2DB();
//                System.out.println("\n\n\n Je suis ici putain ! \n\n\n");
//                try {
//                    Home fen = new Home(Hs, "testPref.xml");
//                    fen.setVisible(true);
//                } catch (UnsupportedLookAndFeelException ex) {
//                    Logger.getLogger(OnePasstwig2Stack.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }; 
//        t3.start();
    	 public static void main(String[] args) {

    	      try {
    	         SAXParserFactory factory = SAXParserFactory.newInstance();
    	         SAXParser parser = factory.newSAXParser();
    	         
    	         parser.parse("book.xml", new MyXMLHandler());

    	      } catch (DOMException e) {
    	         e.printStackTrace();
    	      } catch (ParserConfigurationException e) {
    	         e.printStackTrace();
    	      } catch (TransformerFactoryConfigurationError e) {
    	         e.printStackTrace();
    	      } catch (SAXException e) {
    	         e.printStackTrace();
    	      } catch (IOException e) {
    	         // TODO Auto-generated catch block
    	         e.printStackTrace();
    	      }
    	   }
    //}

}
