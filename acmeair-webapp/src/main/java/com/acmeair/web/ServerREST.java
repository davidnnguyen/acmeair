/*******************************************************************************
* Copyright (c) 2013 IBM Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/
package com.acmeair.web;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Component;

import com.acmeair.entities.CustomerSession;
import com.acmeair.service.*;



@Path("/server")
@Component
public class ServerREST {
	@GET
	@Path("/queryip")
	@Produces("text/plain")
	public Response getIP() {
		try {
			String ipString = InetAddress.getLocalHost().getHostAddress();
      return Response.ok(ipString).build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
