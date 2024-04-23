package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndPoints {

	public static Response addNewPet(Pet payload) {

		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(Routes.post_url);
		return response;
	}

	public static Response getPetById(int id) {

		Response response = given().pathParam("id", id)

				.when().get(Routes.get_url);
		return response;
	}

	public static Response updatePet(Pet payload) {

		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(payload).when().put(Routes.put_url);
		return response;
	}

	public static Response deletePetById(int id) {

		Response response = given().pathParam("id", id)

				.when().delete(Routes.delete_url);
		return response;
	}
}
