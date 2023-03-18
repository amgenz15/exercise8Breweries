package org.openbrewerydb.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openbrewerydb.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Properties;

public class BreweryDao implements PropertiesLoader {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private Properties properties;
    public Brewery getBrewery() {
        properties = loadProperties("/brewery.properties");
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(properties.getProperty("web.target"));
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Brewery brewery = null;

        try {
            brewery = mapper.readValue(response, Brewery.class);
        } catch (JsonProcessingException ex) {
            logger.error("Json processing exception: ", ex);
        }

        return brewery;
    }
}
