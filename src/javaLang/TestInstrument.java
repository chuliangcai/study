package javaLang;

import java.lang.instrument.Instrumentation;

public class TestInstrument {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("occur in pre main");
    }
}
