package Main;

import java.net.URL;
import java.time.LocalDate;

public class Sanktionslistenentry {
    public String firstName;
    public String middleName;
    public String lastName;
    public String wholeName;
    public URL source;
    public LocalDate birthdate;


    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s \n",firstName, middleName, lastName, wholeName, source,birthdate);
    }
}
