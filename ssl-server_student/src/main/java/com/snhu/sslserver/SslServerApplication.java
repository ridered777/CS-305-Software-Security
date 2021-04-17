package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: DONE;
@RestController
class ServerController{
	@RequestMapping("/hash")
	public String myHash(){
		String stuff = "Hello World Check Sum!";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-512");
		}
		catch (NoSuchAlgorithmException e){
			e.printStackTrace();
		}
		md.update(stuff.getBytes());
		byte [] digest = md.digest();
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < digest.length; i++){
			hexString.append(Integer.toHexString(0xFF & digest[i]));
		}
		return "<p>String: " + stuff + "Name of Algorithm Used: SHA-512 " + "Checksum Value: " + hexString;
	}
}