package one.digitalinnovation.citiesapi.countries.repositories;

import one.digitalinnovation.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

