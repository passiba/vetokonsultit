/*
 * Sisaltaa jasentyypit
 */
package vetokonsultit.olioharjoitukset.ui.data;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pasi haverinen
 */
public final class  Constants {

    public static enum JASENTYYPPI{

        NORMAALIJASEN("NORMAALI"), ULKOJASEN("ULKO"), VALTUUSTOJASEN("VALTUUSTO");
        private String type;

        private JASENTYYPPI(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
        
        public static List<String> getJasenTyypit() {

            return Arrays.asList(new String[]{NORMAALIJASEN.getType(), ULKOJASEN.getType(),VALTUUSTOJASEN.getType()});
        }
    }


}
