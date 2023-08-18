package ke.co.saf.hero;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Here we are updated...");

        List heroes = new ArrayList<Hero>();

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

            Hero hero = new Hero();

            Map<String, Object> model = new HashMap<String, Object>();
            hero.setName( request.queryParams("name"));
            hero.setAge(Integer.parseInt(request.queryParams("age")));
            hero.setSpecialPower( request.queryParams("power"));
            hero.setWeakness( request.queryParams("weakness"));
            hero.setSquad( request.queryParams("squad"));

            model.put("name", hero.getName());
            model.put("age", hero.getAge());
            model.put("power", hero.getSpecialPower());
            model.put("weakness", hero.getWeakness());
            model.put("squad", hero.getSquad());

            return new ModelAndView(model, "list-heroes.hbs");
        }, new HandlebarsTemplateEngine());


    }
}