/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonatan
 */
public class Change {
    private static FileHandler fileHandler;
    private static Formatter formatter;
    
    public void save() throws IOException {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(Level.FINER); 
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/YYYY_hh:mm:sss");
        fileHandler = new FileHandler("E:\\Logger\\"+format.format(new Date()) + "_log.html");
        formatter = new HtmlLogger();
        fileHandler.setFormatter(formatter);
	logger.addHandler(fileHandler);   
    }
    public static FileHandler getFileHandler() {
	return fileHandler;
    }
    
}
