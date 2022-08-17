package DesignPattern2;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TestInput {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "I love java";
        String str3 = "I want to be Junior java dev.";
        try (ByteArrayInputStream is1 = new ByteArrayInputStream(str1.getBytes());
        ByteArrayInputStream is2 = new ByteArrayInputStream(str2.getBytes());
        ByteArrayInputStream is3 = new ByteArrayInputStream(str3.getBytes())) {
            byte[] strBytes1 = new byte[str1.length()];
            byte[] strBytes2 = new byte[str2.length()];
            byte[] strBytes3 = new byte[str3.length()];

            LowerCaseInputStream lowerCaseInputStream1 = new LowerCaseInputStream(is1);
            LowerCaseInputStream lowerCaseInputStream2 = new LowerCaseInputStream(is2);
            LowerCaseInputStream lowerCaseInputStream3 = new LowerCaseInputStream(is3);

            int result1 = lowerCaseInputStream1.read(strBytes1, 0, str1.length());
            int result2 = lowerCaseInputStream2.read(strBytes2, 0, str2.length());
            int result3 = lowerCaseInputStream3.read(strBytes3, 0, str3.length());

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);

            System.out.println(new String(strBytes1));
            System.out.println(new String(strBytes2));
            System.out.println(new String(strBytes3));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
