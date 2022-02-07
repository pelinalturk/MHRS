package com.cpas.adapter.concrete;

import org.springframework.stereotype.Service;

import com.cpas.adapter.abstracts.UserCheckService;
import com.cpas.domain.User;

@Service("fakeMernis")
public class FakeUserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		return true;
	}

}
