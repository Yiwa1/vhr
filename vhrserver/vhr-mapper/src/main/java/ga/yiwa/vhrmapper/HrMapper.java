package ga.yiwa.vhrmapper;

import ga.yiwa.vhrmodel.Hr;
import org.springframework.stereotype.Repository;

@Repository
public interface HrMapper {
    Hr loadUserByUsername(String username);
}
