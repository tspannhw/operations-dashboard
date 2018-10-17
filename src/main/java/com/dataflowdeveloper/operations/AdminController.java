package com.dataflowdeveloper.operations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// https://cwiki.apache.org/confluence/display/Hive/HiveServer2+Clients#HiveServer2Clients-JDBCClientSampleCode
/**
 * 
 */
@Controller
@RequestMapping(value = "/admin/**", produces = "application/json")
public class AdminController {

  @RequestMapping(value = "/kill", method = RequestMethod.GET)
  @ResponseBody
  public MessageResponse kill() {
	System.err.println("Killing instance");
    System.exit(-1);
    return MessageResponse.errorResponse("system killed");
  }
}
