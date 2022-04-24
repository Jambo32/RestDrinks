package com.DrinksRest.RestDrinks;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@RestController
public class DrinksController {

    String name;
    String spirit;
    String spiritMeasure;
    String juice;
    String juiceMeasure;
    String sour;
    String sweet;
    String puree;
    String pureeMeasure;
    String measurement;

    @RequestMapping("/welcomeDrinks")
    public String welcomeDrinks() {

        return "lets make some drinks";
    }

    @RequestMapping("/Drinks/PinaColada")
    public String pinaColada() {

        name = "Pina Colada";
        spiritMeasure = "50ml";
        spirit = "malibu";
        pureeMeasure = "25ml";
        puree = "coconut cream";
        juice = "pineapple juice";
        juiceMeasure = "75ml";

        return name + " these are the measurements for the drink "
                + spiritMeasure +
                " " + spirit +
                " " + pureeMeasure +
                " " + puree +
                " " + juice +
                " " + juiceMeasure;
    }

    @RequestMapping("/Drinks/Daiquiri")
    public String daiquiri() {

        name = "Daiquiri";
        spiritMeasure = "50ml";
        spirit = "Havana 3yr";
        sour = "lime juice";
        juiceMeasure = "25ml";
        sweet = "sugar syrup";
        measurement = "2 barspoons";

        return name + " these are the measurements for the drink "
                + spiritMeasure +
                " " + spirit +
                " " + sour +
                " " + juiceMeasure +
                " " + sweet +
                " " + measurement;
    }

    /**
     * url?myX=5&myY=8 returns 13
     * investigate curl for calling webservices
     * investigate json for sending back data (done!)
     * learn how to use post unit test
     * how to send response code e.g 200 for success
     * create gradle and maven file
     * look up web forms (done!)
     * @param myX
     * @param myY
     * @return
     */

    @GetMapping("/Drinks/value")
    @ResponseBody
    public int getValue(@RequestParam String myX, @RequestParam String myY) {

        int x = Integer.getInteger(myX, 10);
        int y = Integer.getInteger(myY, 22);
        return y + x;
    }

    /**
     * need to junit test the method below
     * it works but still need to run tests!
     * @return
     */

    @GetMapping("/Drinks/arrayDrinks")
    @ResponseBody
    public ArrayList getDrinkNames () {

        ArrayList<String> drinkNames = new ArrayList<>();
        drinkNames.add("mai tai");
        drinkNames.add("japanese slipper");
        drinkNames.add("zombie");
        drinkNames.add("b52");
        drinkNames.add("miami vice");

        return drinkNames;
    }

    @GetMapping("/Drinks/drinkChoice")
    @ResponseBody
    public String getDrink(@RequestParam String cocktail) {
        return "Drink: " + cocktail;
    }

    @GetMapping("/Drinks/Get")
    public String getMethodDrink() {
        return "HTTP GET drink request was sent";
    }

    @PutMapping("/Drinks/Put")
    public String updateMethodDrink() {
        return "HTTP PUT drink request has been sent";
    }

    @PostMapping("/Drinks/Post")
    public String createMethodDrink() {
        return "HTTP POST drink request has been sent";
    }

    @DeleteMapping("/Drinks/Delete")
    public String deleteMethodDrink() {
        return "HTTP DELETE drink request has been sent";
    }

}
