package day51_Exceptions.BrowserTasks;
/*
 1. create a class called WebDriver
            actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser

 */
public class WebDriver  {

    public void get (String url){
        System.out.println("Opening the "+url+"in default browsergh");
    }
    public void close(){
        System.out.println("closing the default browser");
    }

}