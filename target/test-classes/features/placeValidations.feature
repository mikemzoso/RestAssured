Feature: Validating Place API's 
#Adding Outline to Scenario means Cucumber will look for Examples
@AddPlace
Scenario Outline: Verify if Place is being Succesfully Added using AddPlaceAPI 

	Given Add Place Payload with "<name>" "<language>" "<address>" 
	When user calls "AddPlaceAPI" with "POST" http request 
	Then the API call got success with status code 200 
	And "status" in response body is "OK" 
	And "scope" in response body is "APP" 
	And verify place_id created maps to "<name>" using "GetPlaceAPI" 
	
	Examples: 
		|name     |language |address          |
		|myhouse  |English  |1200 Florida Rd  |
		|yourhouse|French   |Boise            |
#		|danhouse |Spanish  |Oxford           |
		
		
@DeletePlace		
Scenario: Verify if Delete Place functionality is working 

	Given DeletePlace Payload 
	When user calls "DeletePlaceAPI" with "POST" http request 
	Then the API call got success with status code 200 
	And "status" in response body is "OK"