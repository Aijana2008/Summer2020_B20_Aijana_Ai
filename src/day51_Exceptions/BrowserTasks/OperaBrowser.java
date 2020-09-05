package day51_Exceptions.BrowserTasks;

public class OperaBrowser extends WebDriver{

    public void get(String url) {
        System.out.println("Opening the " + url + " in opera browser");
    }


    public void close() {
        System.out.println("Closing the  opera browser");;
    }
}
