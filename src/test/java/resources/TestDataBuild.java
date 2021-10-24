package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	//String name, language and address are for "Examples" in placeValidation. Adding to setlanguage, setaddress, and setname uses those variables
	public AddPlace addPlacePayload(String name, String language, String address)
	{
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("756-937-9373");
		p.setWebsite("www.nin.com");
		p.setName(name);
		//Creating List object for setTypes and providing value of list
		List<String> myList = new ArrayList<String>();
		myList.add("home");
		myList.add("nostalgia");
		p.setTypes(myList);
		//Creating location class object and providing values for lat and long, creating a sub Json for location
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
	}
	
	public String deletePlacePayload(String place_id)
	{
		return "{\r\n    \"place_id\":\""+place_id+"\"\r\n}";
	}

	
}
