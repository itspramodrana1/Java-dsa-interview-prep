package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class L24_UserService {

    public static Optional<L23_User> getUser(int id){
        List<L23_User>  users =  Arrays.asList(new L23_User(1, "Pramod"), new L23_User(2, "Sonu"),
                new L23_User(2, "Shankar"));

        for(var user : users){
            if(user.getId()==id){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }


}
