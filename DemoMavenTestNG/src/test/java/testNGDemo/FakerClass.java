package testNGDemo;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
public class FakerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			Faker faker=new Faker();
			String fname=faker.name().firstName();
			String lastname=faker.name().lastName();
			String phone=faker.phoneNumber().phoneNumber();
			String addres=faker.address().fullAddress();
			String location=faker.address().latitude();
			FakeValuesService fakeValuesService = new FakeValuesService(  new Locale("en-GB"), new RandomService());
	        //en-GB => lang
	        String email = fakeValuesService.bothify("????##@gmail.com");
	        String vatNo=faker.idNumber().ssnValid();
	        String ssnNo=faker.idNumber().ssnValid();
			System.out.println(fname);
			System.out.println(lastname);
			System.out.println(phone);
			System.out.println(addres);
			System.out.println(location);
			System.out.println(email);
			System.out.println(vatNo);
			System.out.println(ssnNo);
		}

	}

}
