package com.dataflowdeveloper.operations;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 
 * @author tspann
 *
 */
@RestController
public class DataController {

	public static HttpServletRequest getCurrentRequest() {
	     RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
	     Assert.state(requestAttributes != null, "Could not find current request via RequestContextHolder");
	     Assert.isInstanceOf(ServletRequestAttributes.class, requestAttributes);
	     HttpServletRequest servletRequest = ((ServletRequestAttributes) requestAttributes).getRequest();
	     Assert.state(servletRequest != null, "Could not find current HttpServletRequest");
	     return servletRequest;
	 }
	

	@Autowired
	private DataSourceService dataSourceService;
	
   
    @RequestMapping("/query/{query}")
    public List<Inception> query(
    		@PathVariable(value="query") String query) 
    {
    	List<Inception> value = dataSourceService.search(query);
    	final String userIpAddress = getCurrentRequest().getRemoteAddr();
    	final String userAgent = getCurrentRequest().getHeader("user-agent");
    	final String userDisplay = String.format("Query:%s,IP:%s Browser:%s", query, userIpAddress, userAgent);
    	System.out.println("User:" + userDisplay);
        return value;
    }
}
