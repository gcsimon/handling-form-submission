package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Greeting {

	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(min=2, max=30)
    private String username;
	
	@NotNull
    private String content;
	
	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;           
    }

    public void setId(Long id) {
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
	
	public Greeting(String content, String username, Long id){
		this.content = content;
		this.username = username;
		this.id = id;
		
	}

}