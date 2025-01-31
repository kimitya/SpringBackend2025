package kz.kbtu.scopes;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scopes")
public class SessionScopeController {
    @Resource(name = "sessionScopedBean")
    private HelloMessageGenerator sessionScopedBean;

    @GetMapping("/session")
    public String getSessionScopeMessage() {
        String previousMessage = sessionScopedBean.getMessage();
        sessionScopedBean.setMessage("Good afternoon!");
        String currentMessage = sessionScopedBean.getMessage();

        return String.format("{\"previousMessage\": \"%s\", \"currentMessage\": \"%s\"}", previousMessage, currentMessage);
    }
}
