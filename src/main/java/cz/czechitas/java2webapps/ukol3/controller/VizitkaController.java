package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller

public class  VizitkaController {
  private final List<Vizitka> vizitky;

  public VizitkaController() {
    vizitky = List.of(
            new Vizitka("Harry Potter","Bradavice","Příčná 1","11000 Praha 1",
                    "harry.potter@bradavice.wiz","111 222 333","https://cs.wikipedia.org/wiki/Harry_Potter"),
            new Vizitka("Frodo Pytlík","Společenstvo prstenu s.r.o","Šedivny 22","51801 Dobré" ,
                    null,"111 333 333",null),
            new Vizitka("Anakin Skywalker","Rada Jedi","Strahovská 205","11801 Praha 1",
                    "anakin.skywalker@jedi.uni",null,null)
    );
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", vizitky);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka",vizitky.get(id));
    return modelAndView;
  }

}


