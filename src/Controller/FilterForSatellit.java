package Controller;

import Model.Satellit;
import java.util.List;

/*public interface FilterForSatellit {
     List<Satellit> filter(List<Satellit> satellitList);
}
*/

public interface FilterForSatellit {
    Boolean filter(Satellit satellit);
}