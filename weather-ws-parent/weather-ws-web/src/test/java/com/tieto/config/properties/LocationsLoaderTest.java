package com.tieto.config.properties;

import static org.junit.Assert.*;

import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.tieto.config.properties.transportobjects.Location;

@RunWith(MockitoJUnitRunner.class)
public class LocationsLoaderTest {

  @InjectMocks
  private LocationsLoader locationLoader;

  @Test
  public void locationLoaderForValidXMLTest() throws JAXBException {
    final List<Location> location = this.locationLoader.loadlocationsFromXML("locations.xml");
    assertEquals("Ostrava", location.get(0).getCity());
    assertEquals("Vilnius", location.get(1).getCity());
    assertEquals("Warsaw", location.get(2).getCity());
    assertEquals("Bratislava", location.get(3).getCity());
    assertEquals("San_Francisco", location.get(4).getCity());

    assertEquals("CZ", location.get(0).getCountry());
    assertEquals("LT", location.get(1).getCountry());
    assertEquals("PL", location.get(2).getCountry());
    assertEquals("SK", location.get(3).getCountry());
    assertEquals("CA", location.get(4).getCountry());
  }

  @Test
  public void locationLoaderSomeDataIsEmtyOrNull() throws JAXBException {
    final List<Location> location = this.locationLoader
        .loadlocationsFromXML("locationsFirstCityIsEmpty.xml");
    assertEquals("", location.get(0).getCity());
    assertNull(location.get(1).getCountry());
  }

  @Test(expected = JAXBException.class)
  public void locationLoaderWrongFormOfXml() throws JAXBException {
    this.locationLoader.loadlocationsFromXML("locationsWrongForm.xml");
  }

}
