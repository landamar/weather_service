package com.tieto.config.properties;

import java.io.File;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import com.tieto.config.properties.transportobjects.Location;
import com.tieto.config.properties.transportobjects.LocationTO;

@Component
@ApplicationScope
public class LocationsLoader {

  private static final Logger LOG = LogManager.getLogger(LocationsLoader.class);
  private static final String FILE = "locations.xml";
  private List<Location> locations;

  @PostConstruct
  private void postConstruct() throws JAXBException {
    this.locations = loadlocationsFromXML(FILE);

  }

  List<Location> loadlocationsFromXML(String fileName) throws JAXBException {
    LOG.info("Loading data from location.xml");
    try {
      final JAXBContext jaxbContext = JAXBContext.newInstance(LocationTO.class);
      final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      final LocationTO locations = (LocationTO) jaxbUnmarshaller.unmarshal(getFile(fileName));
      return locations.getLocation();
    } catch (final JAXBException e) {
      throw fail("Wrong form of property file " + fileName, e);
    }
  }

  private JAXBException fail(String logText, Throwable cause) throws JAXBException {
    LOG.error(logText + " FAILED, cause");
    return new JAXBException("FAILED: " + logText, cause);
  }

  private File getFile(String fileName) {
    final ClassLoader classLoader = getClass().getClassLoader();
    return new File(classLoader.getResource(fileName).getFile());
  }

  public List<Location> getLocations() {
    return this.locations;
  }

  public Location get(int index) {
    return this.locations.get(index);
  }

}
