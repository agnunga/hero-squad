package ke.co.saf.hero;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Here we are updated...");


        staticFileLocation("/public");

        get("/", (request, response) ->{
            return "Here updated / ";
        } );

    }
}