package kz.kbtu.scopes;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scopes")
public class RequestScopeController {

    @Resource(name = "requestScopedBean")
    private HelloMessageGenerator requestScopedBean;

    @GetMapping("/request")
    public String getRequestScopeMessage() {
        String previousMessage = requestScopedBean.getMessage();
        requestScopedBean.setMessage("Good morning!");
        String currentMessage = requestScopedBean.getMessage();

        return String.format("{\"previousMessage\": \"%s\", \"currentMessage\": \"%s\"}", previousMessage, currentMessage);
    }
}
