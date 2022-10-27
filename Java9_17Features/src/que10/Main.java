package que10;

public class Main {
    public static void main(String[] args) {
        //Repeat
        String str1="This is the Repeat method";
        System.out.println(str1.repeat(3));
        //strip
        String str2="\t\n\t\t  String with spaces \n\t";
        System.out.println(str2.strip());
        //isBlank
        String str3="\t\n     \s\s\t\n";
        System.out.println(str3.isBlank());
        //indent
        String str4="New String";
        str4=str4.indent(10);
        System.out.println(str4);
        System.out.println(str4.indent(-5));
        //transform
        String ans=str4.transform(str->str.indent(-5).toUpperCase());
        System.out.println(str4);
        //stripIndent
        String str="    string without whitespaces     ";
        System.out.println(str.stripIndent());

    }
}
