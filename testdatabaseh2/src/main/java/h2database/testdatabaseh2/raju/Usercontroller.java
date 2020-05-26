package h2database.testdatabaseh2.raju;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Usercontroller {
	
	@Autowired
	private Userreoository userrespos;
	
	
	@RequestMapping(method=RequestMethod.POST , value="/home")
	public void getalldetails(@RequestBody Usermodel user )
	
	{
		userrespos.save(user);
	}

}
