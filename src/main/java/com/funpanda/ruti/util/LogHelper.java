package com.funpanda.ruti.util;


import com.funpanda.ruti.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;



/**
 * @author Pahimar:Mostly Copied And Pasted
 * @author FunPanda
 * Thanks to Pahimar
 * Package: com.funpanda.testmod
 * Date: 8/20/2014
 */
public class LogHelper {

    //Prefill FML Logger
    public static void log(Level LogLevel, Object LogMessage ){
        FMLLog.log(Reference.MOD_ID,LogLevel, String.valueOf(LogMessage) );
    }

    //Log Level "All"
    public static void All(Object LogMessage){log(Level.ALL, LogMessage);}

    //Log Level "Warn"
    public static void Warn(Object LogMessage){log(Level.WARN, LogMessage);}

    //Log Level "Error"
    public static void Error(Object LogMessage){log(Level.ERROR, LogMessage);}

    //Log Level "Info"
    public static void Info(Object LogMessage){log(Level.INFO, LogMessage);}

    //Log Level "Debug"
    public static void Debug(Object LogMessage){log(Level.DEBUG, LogMessage);}

    //Log Level "Trace"
    public static void Trace(Object LogMessage){log(Level.TRACE, LogMessage);}

    //Log Level "Fatal"
    public static void Fatal(Object LogMessage){log(Level.FATAL, LogMessage);}

    //Log Level "Off"
    public static void Off(Object LogMessage){log(Level.OFF, LogMessage);}
}
