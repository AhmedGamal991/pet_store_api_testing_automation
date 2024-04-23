package api.tests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.PetEndPoints;
import api.payload.Pet;
import io.restassured.response.Response;

public class PetTest {

	Faker faker;
	Pet petpayload;
	@BeforeClass
	public void setupDate() {
		faker = new Faker();
		petpayload = new Pet();
		petpayload.setId(faker.idNumber().hashCode());
		petpayload.setName(faker.animal().name());
		
	}
		@Test(priority = 1)
		public void testaddpet() {
			Response response = PetEndPoints.addNewPet(petpayload);
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(), 200);
		}
		@Test(priority = 2)
		public void testGetById() {
			Response response =	PetEndPoints.getPetById(this.petpayload.getId());
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(), 200);
		}
		
		@Test(priority = 3)
		public void testupdatepet() {
//			petpayload.setId(faker.idNumber().hashCode());
			this.petpayload.setName(faker.animal().name());
			Response response = PetEndPoints.updatePet(this.petpayload);
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(), 200);
		}
		@Test(priority = 4)
		public void testDeleteById() {
			Response response =	PetEndPoints.deletePetById(this.petpayload.getId());
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(), 200);
		}
}
