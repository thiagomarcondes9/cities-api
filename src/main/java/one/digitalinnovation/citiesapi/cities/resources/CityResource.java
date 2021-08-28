package one.digitalinnovation.citiesapi.cities.resources;

import one.digitalinnovation.citiesapi.cities.entities.City;
import one.digitalinnovation.citiesapi.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

  @GetMapping
  public List<City> cities() {
      return repository.findAll();
  }

    //Pageable
    /*@GetMapping
    public Page<City> cities(final Pageable page) {
        return repository.findAll(page);
    }*/
}

