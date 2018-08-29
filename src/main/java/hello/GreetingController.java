package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	private final GreetingRepository repository;
	
	public GreetingController(GreetingRepository r){
	this.repository = r;
	}
	
    @GetMapping("greeting")
    public String listAll(Model model, Greeting greeting) {
        model.addAttribute("greet", this.repository.findAll());
        return "greeting";
    }

    @PostMapping("greeting")
    public String greetingSubmit(@ModelAttribute(name="greeting") Greeting greeting) {
		this.repository.save(greeting);
        return "redirect:/greeting";
    }

}

