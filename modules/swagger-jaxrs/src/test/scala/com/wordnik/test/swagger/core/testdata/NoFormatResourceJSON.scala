/**
 *  Copyright 2012 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wordnik.test.swagger.core.testdata

import com.wordnik.swagger.core._
import com.wordnik.swagger.jaxrs._
import com.wordnik.swagger.annotations._

import javax.ws.rs._
import javax.ws.rs.core.Response

// the actual resource
@Path("/basic")
@Api(value = "/basic", 
    description = "Basic resource", 
    listingPath="/resources/basic")
@Produces(Array("application/json"))
class NoFormatResourceJSON extends BasicResource

// listing resource which refers to the actual resource
@Path("/resources/basic")
@Api(value = "/basic", 
    description = "Basic resource", 
    listingPath="/resources/basic",
    listingClass="com.wordnik.test.swagger.core.testdata.NoFormatResourceJSON")
@Produces(Array("application/json"))
class NoFormatResourceListingJSON