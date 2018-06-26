

public class StringBuffBuilderDemo {

	public static void main(String[] args) {
		String s1 = "Test";
        concat1(s1);  // s1 is not changed
        System.out.println("String: " + s1);
 
        StringBuilder s2 = new StringBuilder("Test");
        concat2(s2); // s2 is changed
        System.out.println("StringBuilder: " + s2);
 
        StringBuffer s3 = new StringBuffer("Test");
        concat3(s3); // s3 is changed
        System.out.println("StringBuffer: " + s3);
	}
	private static void concat1(String s1)
    {
        s1 = s1 + "String";
    }
 
    // Concatenates to StringBuilder
    private static void concat2(StringBuilder s2)
    {
        s2.append("String");
    }
 
    // Concatenates to StringBuffer
    private static void concat3(StringBuffer s3)
    {
        s3.append("String");
    }

}
