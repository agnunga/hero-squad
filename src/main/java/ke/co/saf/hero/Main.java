package ke.co.saf.hero;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Here we are updated...");


        staticFileLocation("/public");

        get("/", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(model, "home.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine());

        get("/add-hero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "add-hero.hbs");
        }, new HandlebarsTemplateEngine());


        post("/add-hero-submit", (request, response) -> {

            System.out.println(request.queryParams());

            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            String squad = request.queryParams("squad");
            model.put("name", name);
            model.put("age", age);
            model.put("power", power);
            model.put("weakness", weakness);
            model.put("squad", squad);

            return new ModelAndView(model, "list-heroes.hbs");
        }, new HandlebarsTemplateEngine());


    }
}