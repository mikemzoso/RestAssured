package resources;

//enum is a special class in java which has a collection of constants and methods
public enum APIResources {
//enums need to be separated with a ","
	AddPlaceAPI("/maps/api/place/add/json"), 
	GetPlaceAPI("/maps/api/place/get/json"),
	DeletePlaceAPI("/maps/api/place/delete/json");
	private String resource;

	APIResources(String resource) 
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
}
