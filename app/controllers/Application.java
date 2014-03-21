package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import models.*;
import org.joda.time.DateTime;
import java.util.Map;
import java.util.HashMap;

public class Application extends Controller {
	//This implements a hardcoded in memory database. Please do not use this.
	//It is only here for the live demo
	private static Map<Long, User> users = new HashMap<Long, User>();
	static {
		User simao = new User("Simao", new DateTime(1990, 9, 13, 0, 0), "Last Login Time");
		users.put(1L, simao);

		User david = new User("David", new DateTime(1991, 9, 13, 0, 0), "Last Login Time");
		users.put(15L, david);
	}
	
	
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

	public static Result listUsers() {
		return ok("Not implemented yet!");
    }

	public static Result showUser(Long id) {
		User u = users.get(id);
		if (u == null) {
			return ok("<h1>No user found</h1>").as("text/html");
		} else {
        	return ok(user.render(u));
    	}
    }
    
    public static Result notExistentMethod() {
    	return redirect(controllers.routes.Application.index());
    }
}
