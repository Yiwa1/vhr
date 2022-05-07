package ga.yiwa.vhrmapper;

import ga.yiwa.vhrmodel.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    List<Menu> getAllMenus();

    List<Menu> getAllMenusWithRole();
}
