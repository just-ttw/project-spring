package ttw.com.sandbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ttw.com.entity.Message;
import com.ttw.*;

@RestController
public class SandboxController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        Message message = new Message();
        
        //return message.getData();
        return String.valueOf(Util.check(0));
    }
}
