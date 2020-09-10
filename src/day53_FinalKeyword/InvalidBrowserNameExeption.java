package day53_FinalKeyword;

public class InvalidBrowserNameExeption extends RuntimeException{

    public InvalidBrowserNameExeption(){
        super("Invalid Browser Name");
    }

    public InvalidBrowserNameExeption(String str){
        super(str);
        System.out.println("Are you kidding?");
    }
}


class Test2{
    public static void main(String[] args) {
        String name = "batch20";

        switch (name){
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefox":
                System.out.println("Firefox is selected");
                break;
            case "safari":
                System.out.println("Safari is selected");
                break;
            default:

       throw new InvalidBrowserNameExeption("Please enter a valid browser name");
//throw new RuntimeException();
        }
//throw new InvalidBrowserNameExeption();
    }
}