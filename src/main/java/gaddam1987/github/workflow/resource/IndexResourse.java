package gaddam1987.github.workflow.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class IndexResourse {
    @RequestMapping(method = GET)
    public ResponseEntity<Endpoint> index() {
        return new ResponseEntity<Endpoint>(new Endpoint(), HttpStatus.OK);
    }
}
