package wh.daywork.july.day19;

public class Test4 {
    public static final String JAVA_HOME="d:\\jdk1.9";
    public static final String CLASSPATH=".;%JAVA_HOME%\\lib\\dt.jar;%JAVA_HOME\\lib\\tools.jar%";
    public static final String Path="%%JAVA_HOME\\bin";

    public static void main(String[]args){
        System.out.println("JAVA_HOME"+JAVA_HOME);
        System.out.println("CLASSPATH"+CLASSPATH);
        System.out.println("Path"+Path);
    }
}

