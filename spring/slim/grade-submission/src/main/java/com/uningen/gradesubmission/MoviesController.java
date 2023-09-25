package com.uningen.gradesubmission;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesController {

  @GetMapping("/movies")
  public String getMovies(Model model) {
    // commented out -> legacy approach
    // public ModelAndView getMovies() {
    model.addAttribute("first", new Movie("Breaking Good", "Ozymandias", 10.0));
    model.addAttribute("second", new Movie("Attack on Titan", "Hero", 9.9));
    model.addAttribute("third", new Movie("Attack on Titan", "Perfect Game",
        9.9));
    model.addAttribute("fourth", new Movie("Star Wars: The Clone Wars", "Victory and Death", 9.9));
    model.addAttribute("fifth", new Movie("Mr. Robot", "407 Proxy Authentication Required", 9.9));
    // Map<String, Movie> model = new HashMap<String, Movie>();
    // model.put("first", new Movie("Breaking Bad", "Ozymandiaszzz", 10.0));
    // model.put("second", new Movie("Attack on Titan", "Hero", 9.9));
    // model.put("third", new Movie("Attack on Titan", "Perfect Game", 9.9));
    // model.put("fourth", new Movie("Star Wars: The Clone Wars", "Victory and
    // Death", 9.9));
    // model.put("fifth", new Movie("Mr. Robot", "407 Proxy Authentication
    // Required", 9.9));

    // return new ModelAndView("movies", model);
    return "movies";
  }
}
