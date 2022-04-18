package lv.tsi.hello;

        import org.apache.coyote.Response;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.ArrayList;
        import java.util.List;

@RestController
public class Greetingscontroller {

    @GetMapping("/greeting")
    public ResponseEntity<List<Greetings>> getGreeting() {
        List<Greetings> Greetings = new ArrayList<>();
        Greetings.add(new Greetings("Hello, my name is Spring"));

        return ResponseEntity.ok(Greetings);
    }
}