package com.DrinksRest.RestDrinks;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/Drinks/Get")
    public String getDrink() {
        return "HTTP GET drink request was sent";
    }

    @PutMapping("/Drinks/Put")
    public String updateDrink() {
        return "HTTP PUT drink request has been sent";
    }

    @PostMapping("/Drinks/Post")
    public String createADrink() {
        return "HTTP POST drink request has been sent";
    }

    @DeleteMapping("/Drinks/Delete")
    public String deleteDrink() {
        return "HTTP DELETE drink request has been sent";
    }

}
