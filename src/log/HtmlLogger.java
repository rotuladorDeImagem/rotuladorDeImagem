/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 *
 * @author Jonatan
 */
public class HtmlLogger extends Formatter{

    @Override
    public String format(LogRecord record) {
        StringBuffer s = new StringBuffer();
        s.append("<tr class=\""+record.getLevel()+"\">");
        s.append("<td>"+calcData(record.getMillis())+"</td>");
        s.append("<td>"+record.getMessage()+"</td>");		
        s.append("<td>"+record.getLoggerName()+"</td>");
        s.append("<td>"+record.getSequenceNumber()+"</td>");
        s.append("<td>"+record.getSourceClassName()+"</td>");
        s.append("<td>"+record.getLevel()+"</td>");
        s.append("</tr>");
	return s.toString() ;
    }
    private String calcData(long millisecs) {
	SimpleDateFormat date_format = new SimpleDateFormat("HH:mm - dd MMMM yyyy ");
	Date resultdate = new Date(millisecs);
	return date_format.format(resultdate);
    }
	
    @Override
    public String getHead(Handler h) {
	StringBuffer s = new StringBuffer();
	s.append("<!DOCTYPE html>");
	s.append("<html>");
	s.append("<head><meta charset=\"utf-8\"><title> . : Logger : . </title><link rel=\"stylesheet\" href=\"estilo.css\"></link></head>");
	s.append("<body><table>");
	s.append("<tr>");
	s.append("<th>Hora - Data</th>");
	s.append("<th>Mensagem</th>");
        s.append("<th>Logger</th>");
    	s.append("<th>Sequencia</th>");
	s.append("<th>Classe</th>");
	s.append("<th>Nivel</th>");
	s.append("</tr>");
	return s.toString();
    }

    @Override
    public String getTail(Handler h) {
    	return "</table></body></html>";
    }  
    
}
