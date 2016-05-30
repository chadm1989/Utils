package com.chadm.utils;

import android.util.Log;

/**
 * 
 * @author chadm
 * 
 * 用法：
 * 1.如果没有设置TAG标签，默认是以文件名为TAG的;如果设置了TAG，则以TAG为标签
 * LotUti.i(msg)
 * 2.同时设置TAG和msg信息
 * LotUtil.i(tag,msg)
 */
public final class LogUtil { 

    private static String TAG = LogUtil.class.getSimpleName();

    /**
    * 
    */
    private static boolean debug = Log.isLoggable(TAG,Log.VERBOSE);
    
    //For the default TAG
    private static String fileName;
 
    //can not create LogUtil object
    private LogUtil() {
 
    }
   
    private static String getFunctionName() {
        StackTraceElement[] sts = Thread.currentThread().getStackTrace();
        if (sts == null) {
            return null;
        }
  
        StringBuilder sb = new StringBuilder();
 
        for (StackTraceElement st : sts) {
            if (st.isNativeMethod()) {
                continue;
            }
 
            if (st.getClassName().equals(Thread.class.getName())) {
                continue;
            }
            
            //get infomation about the file
            fileName = st.getFileName();
            String methodName = st.getMethodName();
            int lineNum = st.getLineNumber();
  
            return "[" + methodName + ":"+ lineNum +"]";
        }
 
        return null;
    }
 
    private static String createMessage(String msg) {
        String functionName = getFunctionName();
        String message = (functionName == null ? msg : (functionName + " - " + msg));
        return message;
    }
    
    public static void i(String msg) {
        //if set the TAG,print log use it;else use the file name as TAG
        if(LogUtil.class.getSimpleName().equals(TAG)) {
            i(fileName,msg);
        } else {
            i(TAG,msg);
        }
    } 
 
    /**
    * log.i
    */
    public static void i(String tag, String msg) {
        if (debug) {
            String message = createMessage(msg);
            Log.i(tag, message);
        }
    } 
    
    public static void v(String msg) {
        //if set the TAG,print log use it;else use the file name as TAG
        if(LogUtil.class.getSimpleName().equals(TAG)) {
            v(fileName,msg);
        } else {
            v(TAG,msg);
        }
    } 
 
    /**
     * log.v
     */
    public static void v(String tag, String msg) {
        if (debug) {
            String message = createMessage(msg);
            Log.v(tag, message);
        }
    }
    
    public static void d(String msg) {
        //if set the TAG,print log use it;else use the file name as TAG
        if(LogUtil.class.getSimpleName().equals(TAG)) {
            d(fileName,msg);
        } else {
            d(TAG,msg);
        }
    } 
 
    /**
    * log.d
    */
    public static void d(String tag, String msg) {
        if (debug) {
            String message = createMessage(msg);
            Log.d(tag, message);
        }
    }
    
    public static void e(String msg) {
        //if set the TAG,print log use it;else use the file name as TAG
        if(LogUtil.class.getSimpleName().equals(TAG)) {
            e(fileName,msg);
        } else {
            e(TAG,msg);
        }
    } 
 
    /**
    * log.e
    */
    public static void e(String tag, String msg) {
        if (debug) {
            String message = createMessage(msg);
            Log.e(tag, message);
        }
    }
    
    /**
    * log.error
    */
     public static void error(String tag, Exception e){
        if(debug){
            StringBuffer sb = new StringBuffer();
             String name = getFunctionName();
             StackTraceElement[] sts = e.getStackTrace();
 
             if (name != null) {
                sb.append(name+" - "+e+"\r\n");
            } else {
                sb.append(e+"\r\n");
            }
            if (sts != null && sts.length > 0) {
                for (StackTraceElement st:sts) {
                    if (st != null) {
                        sb.append("[ "+st.getFileName()+":"+st.getLineNumber()+" ]\r\n");
                    }
                }
            }
            Log.e(tag,sb.toString());
        }
    }
    
    public static void w(String msg) {
        //if set the TAG,print log use it;else use the file name as TAG
        if(LogUtil.class.getSimpleName().equals(TAG)) {
            w(fileName,msg);
        } else {
            w(TAG,msg);
        }
    } 
    
    /**
    * log.w
    */
    public static void w(String tag, String msg) {
        if (debug) {
            String message = createMessage(msg);
            Log.w(tag, message);
        }
    }
   
    /**
    * set debug false
    */
    public static void setDebug(boolean d) {
        debug = d;
    }
    
    public static void setTag(String tag) {
        if( tag != null && ! tag.isEmpty()) {
            TAG = tag;
        }
    }
 
}
