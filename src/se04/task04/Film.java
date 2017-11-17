package se04.task04;
import java.io.Serializable;
import java.util.ArrayList;

public class Film implements Serializable{
	private static final long serialVersionUID = 1L;
    
	private String title;
	private ArrayList<Actor> actors;

	public Film(String title, String[] actors){
		this.title = title;
		//System.out.printf("title: %s\n", this.title);
		this.actors = new ArrayList<>();
		for (String name: actors){
			//System.out.printf("actor: %s\n", name);
			this.actors.add(Actor.getActor(name));
		}
	}

	public Film(String title){
		this.title = title;
		//System.out.printf("title: %s\n", this.title);
		this.actors = new ArrayList<>();
	}

	public String toString(){
		String result = title + '\n';
		if (actors.size() > 0) {
			result = result + "\tStarring:\n";
			for (Actor actor: actors){
				result += "\t\t" + actor.getName() + '\n';
			}
		}
		return result;
	}

}
