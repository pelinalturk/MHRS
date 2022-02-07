package com.cpas.adapter.concrete;

import org.springframework.stereotype.Service;

import com.cpas.adapter.abstracts.UserCheckService;
import com.cpas.domain.User;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service("mernis")
public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy kpsPublicSoapProxy;
		 try {
	            kpsPublicSoapProxy= new KPSPublicSoapProxy();
	         boolean verifiy= kpsPublicSoapProxy.TCKimlikNoDogrula(
	                    Long.parseLong(user.getNationalId()),
	                    user.getName().toUpperCase(),
	                    user.getSurname().toUpperCase(),
	                    user.getBirthDate().getYear());
	         return verifiy;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	}

}
