package Strings.BufferandBuilder;

public class StringBufferBuilderTest {
    static void main() {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("hello");
        for (int i = 0; i < 10000; i++) {
            sbf.append("world");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("TimeTaken by SBF =" + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        StringBuilder sbi = new StringBuilder("hello");
        for (int i = 0; i <  10000; i++);{
            sbi.append("world");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("TimeTaken by SBi =" + (stopTime - startTime));

    }

}

