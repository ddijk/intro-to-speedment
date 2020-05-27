package com.company.sakila.sakila.sakila.city.generated;

import com.company.sakila.sakila.sakila.city.City;
import com.company.sakila.sakila.sakila.city.CityImpl;
import com.company.sakila.sakila.sakila.city.CityManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.sakila.sakila.sakila.city.City} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCityManagerImpl 
extends AbstractManager<City> 
implements GeneratedCityManager {
    
    private final TableIdentifier<City> tableIdentifier;
    
    protected GeneratedCityManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "city");
    }
    
    @Override
    public City create() {
        return new CityImpl();
    }
    
    @Override
    public TableIdentifier<City> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<City>> fields() {
        return CityManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<City>> primaryKeyFields() {
        return Stream.of(
            City.CITY_ID
        );
    }
}