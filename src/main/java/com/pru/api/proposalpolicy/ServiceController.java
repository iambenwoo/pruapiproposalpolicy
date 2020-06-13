package com.pru.api.proposalpolicy;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.pru.api.proposalpolicy.domain.Policy;

@Service
@Path("/pruapi")
public class ServiceController {

	@GET
	@Path("/policylist")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Policy> getPolicyList(){		
		Policy pol1 = new Policy();
		pol1.setPolicyNo("00000001");
		Policy pol2 = new Policy();
		pol2.setPolicyNo("00000002");
		ArrayList<Policy> al = new ArrayList<Policy>();
		al.add(pol1);
		al.add(pol2);
		return al;		
	}
	
}
