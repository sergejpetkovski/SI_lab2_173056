import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 obj = new SILab2();
    List<String> list = new ArrayList<String>();
    User user = new User("sergej","nekipassword","sergej.petkovski@finki.mk");

    @Test
    void multipleCondition() {
        list.add("baze");
        list.add("kiko");
        list.add("nikola");

        //if (user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername()))
        //TTT
        assertTrue(obj.function(user, list));

        //FXX
        assertFalse(obj.function(new User(null, "nekipassword", "sergej.petkovski@finki.mk"), list));

        //TFX
        assertFalse(obj.function(new User("sergej", "nekipassword", null), list));

        //TTF
        list.add("sergej");
        assertFalse(obj.function(user, list));

        list.remove(3);
        //if (atChar && user.getEmail().charAt(i)=='.') and if (atChar && dotChar)
        //TT
        assertTrue(obj.function(user, list));

        //FX
        assertFalse(obj.function(new User("sergej", "nekipassword", "sergej.petkovskifinki.mk"), list));

        //TF
        assertFalse(obj.function(new User("sergej", "nekipassword", "sergej.petkovski@finkimk"), list));
    }

    @Test
    void everyBranch(){
        //user == null
        assertFalse(obj.function(null,list));

        //user.getUsername()=="sergej" && user.getEmail()=="sergej.petkovski@finki.mk" && !allUsers.contains(user.getUsername())
        assertTrue(obj.function(user, list));

        //user.getUsername() == null
        assertFalse(obj.function(new User(null, "nekipassword", "sergej.petkovski@finki.mk"),list));

        //user.getEmail()=="sergej.petkovski@finkimk"
        assertFalse(obj.function(new User("sergej", "nekipassword", "sergej.petkovski@finkimk"), list));

    }
}
