public class labTask2 {
    public static void main(String[]args){
        String txt="OBJECT ORIENTED PROGRAMMING";
       String txt2="PROGRAMMING FUNDAMENTALS";
        System.out.println("character at 2 is "+txt.charAt(2));
        System.out.println("Code point at 3  is "+txt.codePointAt(3));
        System.out.println("code point bef5 "+txt.codePointBefore(5));
        System.out.println("Comparison "+txt.compareTo(txt2));
        System.out.println("Comparison"+txt.compareToIgnoreCase(txt2));
        System.out.println("joining "+txt.concat(txt2));
        System.out.println("contains "+txt.contains("OBJ"));
        System.out.println("equals"+txt2.contentEquals("PROGRAMMING FUNDAMENTALP"));
        char[] txt3={'h','e'};
        String txt4="redf";
        txt4= txt4+String.copyValueOf(txt3);

        System.out.println(""+txt4);
        boolean obj = txt.matches("OBJECT");
        System.out.println(obj);
        int result=txt4.offsetByCodePoints(2,3);
        System.out.println(result);
     String myStr1 = "Hello, World!";
     String myStr2 = "New World";
     System.out.println(myStr1.regionMatches(7, myStr2, 4,6));
String result2=myStr1.replace("Hello","hi");
System.out.println(result2);
String resultt=myStr1.replaceFirst("Hell","JJJJ");
System.out.println(resultt);
String output=myStr2.replaceAll("New","Old");
System.out.println(output);
int a=3;
a++;
System.out.println(a);

    }
}
