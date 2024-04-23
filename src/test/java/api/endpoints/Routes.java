package api.endpoints;

public class Routes {
	
//	 Swagger URL	 : https://petstore.swagger.io/v2
//	
//			 Add New Pet(post)  : https://petstore.swagger.io/v2/pet
//			 Get Pet (get)	    : https://petstore.swagger.io/v2/pet/{id}
//			 Update pet (put)   : https://petstore.swagger.io/v2/pet/{id}
//			 Delete pet (delete): https://petstore.swagger.io/v2/pet/{id}
	public static String base_url="https://petstore.swagger.io/v2/pet";
	
			// pet model
	
	public static String post_url=base_url;
	public static String get_url=base_url+"/{id}";
	public static String put_url=base_url;
	public static String delete_url=base_url+"/{id}";

}



