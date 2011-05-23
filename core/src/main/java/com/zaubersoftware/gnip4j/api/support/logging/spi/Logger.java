/*
 * Copyright (c) 2011 Zauber S.A.  -- All rights reserved
 */
package com.zaubersoftware.gnip4j.api.support.logging.spi;


/**
 * Logger (based on SL4J). This abstraction let gnip4j not depending 
 * on any logging framework.  
 * 
 * @author Juan F. Codagnone
 * @since May 23, 2011
 */
public interface Logger {

    /**
     * Is the logger instance enabled for the TRACE level?
     * @return True if this Logger is enabled for the TRACE level,
     * false otherwise.
     */
    boolean isTraceEnabled();
      

    /**
     * Log a message at the TRACE level.
     *
     * @param msg the message string to be logged
     */
    void trace(String msg);

    /**
     * Log a message at the TRACE level according to the specified format
     * and arguments.
     * 
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the TRACE level. </p>
     *
     * @param format the format string
     * @param argArray an array of arguments
     */
    void trace(String format, Object... argArray);
    
    /**
     * Log an exception (throwable) at the TRACE level with an
     * accompanying message. 
     * 
     * @param msg the message accompanying the exception
     * @param t the exception (throwable) to log
     */ 
    void trace(String msg, Throwable t);
   
    
    /**
     * Is the logger instance enabled for the DEBUG level?
     * @return True if this Logger is enabled for the DEBUG level,
     * false otherwise.
     * 
     */
    boolean isDebugEnabled();
    
    
    /**
     * Log a message at the DEBUG level.
     *
     * @param msg the message string to be logged
     */
    void debug(String msg);
    
    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     * 
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param argArray an array of arguments
     */
    void debug(String format, Object... argArray);
    
    /**
     * Log an exception (throwable) at the DEBUG level with an
     * accompanying message. 
     * 
     * @param msg the message accompanying the exception
     * @param t the exception (throwable) to log
     */ 
    void debug(String msg, Throwable t);
   
    
    /**
     * Is the logger instance enabled for the INFO level?
     * @return True if this Logger is enabled for the INFO level,
     * false otherwise.
     */
    boolean isInfoEnabled();

    
    /**
     * Log a message at the INFO level.
     *
     * @param msg the message string to be logged
     */
    void info(String msg);
    

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * 
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param argArray an array of arguments
     */
    void info(String format, Object...argArray);
    
    /**
     * Log an exception (throwable) at the INFO level with an
     * accompanying message. 
     * 
     * @param msg the message accompanying the exception
     * @param t the exception (throwable) to log 
     */
    void info(String msg, Throwable t);
    
    /**
     * Is the logger instance enabled for the WARN level?
     * @return True if this Logger is enabled for the WARN level,
     * false otherwise.
     */
    boolean isWarnEnabled();

    /**
     * Log a message at the WARN level.
     *
     * @param msg the message string to be logged
     */
    void warn(String msg);
    
    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     * 
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param argArray an array of arguments
     */
    void warn(String format, Object... argArray);
    
    /**
     * Log an exception (throwable) at the WARN level with an
     * accompanying message. 
     * 
     * @param msg the message accompanying the exception
     * @param t the exception (throwable) to log 
     */
    void warn(String msg, Throwable t);
    


    /**
     * Is the logger instance enabled for the ERROR level?
     * @return True if this Logger is enabled for the ERROR level,
     * false otherwise.
     */
    boolean isErrorEnabled();
    
    /**
     * Log a message at the ERROR level.
     *
     * @param msg the message string to be logged
     */
    void error(String msg);

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     * 
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param argArray an array of arguments
     */
    void error(String format, Object... argArray);
    
    /**
     * Log an exception (throwable) at the ERROR level with an
     * accompanying message. 
     * 
     * @param msg the message accompanying the exception
     * @param t the exception (throwable) to log
     */
    void error(String msg, Throwable t);
}
