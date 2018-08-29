package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
public class Greeting {

	@Id
	@NotNull
	@Size(min=2, max=30)
    private String id;
	
	@NotNull
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	
	public String toString(){
		return "- " + this.content;
	}
	
	protected Greeting(){}
	
	public Greeting(String content){
		this.content = content;
		
	}

}