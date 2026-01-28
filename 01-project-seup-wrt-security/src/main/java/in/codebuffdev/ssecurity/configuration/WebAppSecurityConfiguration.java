package in.codebuffdev.ssecurity.configuration;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity //Gives us SpringSecurityFilterChain
public class WebAppSecurityConfiguration extends WebSecurityConfigurerAdapter {
    // This class help us in creating SpringSecurityFilterChain
}
