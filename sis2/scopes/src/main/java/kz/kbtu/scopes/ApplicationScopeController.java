package kz.kbtu.scopes;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scopes")
public class ApplicationScopeController {
    @Resource(name = "applicationScopedBean")
    private HelloMessageGenerator applicationScopedBean;

    @GetMapping("/application")
    public String getApplicationScopeMessage() {
        String previousMessage = applicationScopedBean.getMessage();
        applicationScopedBean.setMessage("Good evening!");
        String currentMessage = applicationScopedBean.getMessage();

        return String.format("{\"previousMessage\": \"%s\", \"currentMessage\": \"%s\"}", previousMessage, currentMessage);
    }
}
