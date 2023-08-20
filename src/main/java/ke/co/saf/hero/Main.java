package ke.co.saf.hero;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.*;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        List<Squad> squads = new ArrayList<>();

        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("squads", squads );

            return new ModelAndView(model, "home.hbs");
        }, new HandlebarsTemplateEngine());

        get("/add-squad-submit", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "add-squad.hbs");
        }, new HandlebarsTemplateEngine(){});


        get("/add-squad", (request, response) -> {

            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "add-squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/add-hero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "add-hero.hbs");
        }, new HandlebarsTemplateEngine(){});


        post("/add-hero-submit", (request, response) -> {

            System.out.println(request.queryParams());

            Hero hero = new Hero();

            Map<String, Object> model = new HashMap<>();
            hero.setName( request.queryParams("name"));
            hero.setAge(Integer.parseInt(request.queryParams("age")));
            hero.setSpecialPower( request.queryParams("power"));
            hero.setWeakness( request.queryParams("weakness"));
            hero.setSquad( request.queryParams("squad"));

            //add the hero to the list of heroes -
            heroes.add(hero);
            model.put("name", "Hero " + hero.getName() + " added successfully!");
            return new ModelAndView(model, "add-hero.hbs");
        }, new HandlebarsTemplateEngine());

        post("/add-squad-submit", (request, response) -> {

            System.out.println(request.queryParams());

            Squad squad = new Squad();

            Map<String, Object> model = new HashMap<>();
            squad.setName( request.queryParams("name"));
            squad.setMaxSize(request.queryParams("maxSize"));
            squad.setDedicatedCause( request.queryParams("dedicatedCause"));

            //add the hero to the list of heroes -
            squads.add(squad);
            model.put("name", "Squad: " + squad.getName() + " added successfully!");
            return new ModelAndView(model, "add-squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/list-heroes", (request, response) -> {

            //dummy  data
            /*Hero hero = new Hero("John", 101, "strong", "weak", "sq10");
            heroes.add(hero);*/
            Map<String, Object> model = new HashMap<>();
            model.put("heroes", heroes );

            return new ModelAndView(model, "list-heroes.hbs");
        }, new HandlebarsTemplateEngine());


    }
}