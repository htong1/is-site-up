package htspringproject.issiteup;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesController {

    @Autowired
    private ICityService cityService;

    @GetMapping(value = "/cities")
    public List<City> getCities() {

        List<City> cities = cityService.findAll();

        return cities;
    }
}