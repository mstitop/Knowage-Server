/*
 * Knowage, Open Source Business Intelligence suite
 * Copyright (C) 2016 Engineering Ingegneria Informatica S.p.A.
 * 
 * Knowage is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Knowage is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.eng.spagobi.engine.chart.api;


import it.eng.spagobi.utilities.engines.rest.SimpleRestClient;

import java.util.Map;

import org.apache.log4j.Logger;
import org.jboss.resteasy.client.ClientResponse;
import org.json.JSONObject;

public class ChartTemplateClient extends SimpleRestClient{

	private String serviceUrl = "/restful-services/1.0/documents/saveChartTemplate";

	
	public ChartTemplateClient(){
		
	}
	
	static protected Logger logger = Logger.getLogger(ChartTemplateClient.class);

	public String saveTemplate(JSONObject jsonTemplate, String docLabel, String userId) throws Exception {

		logger.debug("IN");

		Map<String, Object> parameters = new java.util.HashMap<String, Object> ();

		parameters.put("jsonTemplate", jsonTemplate);
		parameters.put("docLabel", docLabel);

		logger.debug("Call persist service in post");
		ClientResponse resp = executePostService(parameters, serviceUrl, userId, null, null);
		
		String respString = (String)resp.getEntity(String.class);
				
		logger.debug("OUT");
		
		return respString;
	}

}
