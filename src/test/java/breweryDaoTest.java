import org.junit.Test;
import org.openbrewerydb.entity.Brewery;
import org.openbrewerydb.persistence.BreweryDao;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class breweryDaoTest {

    @Test
    public void getBrewerySuccess() {
        BreweryDao dao = new BreweryDao();
        assertEquals("Diving Dog Brewhouse", dao.getBrewery().getName());
        assertEquals("micro", dao.getBrewery().getBreweryType());
        assertEquals("1802 Telegraph Ave", dao.getBrewery().getStreet());
        assertEquals("Oakland", dao.getBrewery().getCity());
        assertEquals("California", dao.getBrewery().getState());
    }
}
