package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController

@Api(value = "Swagger Resource", description = "Swagger World")
public class HelloResource {

    @ApiOperation(value = "Returns Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Swagger")
                    }
    )
    @GetMapping(value = "/test")
    public String hello() {
        return "Swagger World";
    }

    @ApiOperation(value = "Returns Swagger World")
    @PostMapping(value = "/post", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "Returns Hello World")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
}

