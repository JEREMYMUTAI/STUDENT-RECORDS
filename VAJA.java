/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javaintro.vaja;

/**
 *
 * @author jerryness
 */
public class VAJA {

    public static void main(String[] args) {
        System.out.println("import java.util.Scanner;\n" +
"\n" +
"public class StudentRecord {\n" +
"    public static void main(String[] args) {\n" +
"        Scanner scanner = new Scanner(System.in);\n" +
"\n" +
"        System.out.print(\"Enter student name: \");\n" +
"        String name = scanner.nextLine();\n" +
"\n" +
"        System.out.print(\"Enter student admission number: \");\n" +
"        String admissionNumber = scanner.nextLine();\n" +
"\n" +
"        double totalMarks = 0;\n" +
"        double[] marks = new double[5];\n" +
"        for (int i = 0; i < 5; i++) {\n" +
"            System.out.print(\"Enter marks for unit \" + (i + 1) + \": \");\n" +
"            marks[i] = scanner.nextDouble();\n" +
"            totalMarks += marks[i];\n" +
"        }\n" +
"\n" +
"        double average = totalMarks / 5;\n" +
"\n" +
"        System.out.println(\"Student name: \" + name);\n" +
"        System.out.println(\"Admission number: \" + admissionNumber);\n" +
"        System.out.println(\"Total marks: \" + totalMarks);\n" +
"        System.out.println(\"Average marks: \" + average);\n" +
"    }\n" +
"}!");
    }
}
