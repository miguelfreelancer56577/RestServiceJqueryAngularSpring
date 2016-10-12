package com.walmartstores.backOffice.spendManagement.supplierManagement.cntrldb2;

import org.omg.CORBA.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walmartstores.backOffice.spendManagement.supplierManagement.pojo.User;

@RestController
@RequestMapping(value = "/test")
public class Test {
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<User> getUser(@RequestBody User data){
		User ap = data;
		return new ResponseEntity<User>(ap,HttpStatus.OK);
	} 
}
