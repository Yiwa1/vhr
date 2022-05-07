package ga.yiwa.vhrweb.config;

import ga.yiwa.vhrmodel.Menu;
import ga.yiwa.vhrmodel.Role;
import ga.yiwa.vhrservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    MenuService menuService;
    AntPathMatcher antPathMatcher=new AntPathMatcher();
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        if(requestUrl.equals("/login_p")){
            //登录访问不需要权限
            return null;
        }
        List<Menu> menus = menuService.getAllMenusWithRole();
        for (Menu menu : menus) {
            if(antPathMatcher.match(menu.getUrl(),requestUrl)&&menu.getRoles().size() > 0){
                List<Role> roles = menu.getRoles();
                String[] roleNames=new String[roles.size()];
                for(int i = 0; i <roles.size(); i++){
                    roleNames[i] = roles.get(i).getName();
                }
                return SecurityConfig.createList(roleNames);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
