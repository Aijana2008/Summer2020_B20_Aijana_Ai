package Library;
import day50_Inheritance_Overriding.AccessModifiers;
public class InheritanceTest extends AccessModifiers{
    public static void main(String[] args) {
        System.out.println(InheritanceTest.publicData);// public visible outside package
        System.out.println(InheritanceTest.protectedData);// protected is visible always
       // System.out.println(InheritanceTest.defaultData); // default is not visible outside
    }

}
