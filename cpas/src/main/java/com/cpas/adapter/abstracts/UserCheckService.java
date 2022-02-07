package com.cpas.adapter.abstracts;

import com.cpas.domain.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user);
}
