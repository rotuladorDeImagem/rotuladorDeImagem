/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Jonatan
 */
public class TestLog {
    private static final Logger LOGGER = Logger.getLogger(TestLog.class.getName());
	public static Change change;
	public TestLog() {
                BasicConfigurator.configure();
		//change = new Change();
	}
	public void log() {		
	}

	public static void main(String[] args) {
		TestLog testlog = new TestLog();
                
               
		try {
                    throw new IOException();
		} catch (IOException e) {
                    LOGGER.warn("Deu erro na main");
		}
	}

            
    
}
