public class Test {
    int field;
    public Test() {field = 1; }
    public Test(int f) {field = f; }
    public int getField() {return field;}

    public static void main(String [] args) {
	System.out.println("Hello");
	Test t1 = new Test();
	Test t2 = new Test(2);
	System.out.println(t1.getField());
	System.out.println(t2.getField());
    }
}
