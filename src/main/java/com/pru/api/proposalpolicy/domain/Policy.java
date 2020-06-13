package com.pru.api.proposalpolicy.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Policy {
	
	private String policyNo;

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}	

}
