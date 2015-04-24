package com.pylon.controller.sample;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by simon on 4/22/15.
 */
@Controller
@Validated
@Api(value = "//sample", description = "the products API")
@RequestMapping(value = "/sample")
public class SampleController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @ApiOperation(value = "Echoes TimeZone value that service receive from a user. ex) ko_KR")
    @RequestMapping(value = "/echo/timezone", method = RequestMethod.GET, consumes = "*/*")
    @ResponseBody
    public TimeZone echoTimeZone(@ApiParam(required = false, value = "TimeZOne value will be echoed.") @RequestParam(required = false) TimeZone timeZone) {
        if (timeZone == null) {
            return TimeZone.getTimeZone("Asia/Tokyo");
        }

        return timeZone;
    }

    @ApiOperation(value = "Echoes Locale value that service receive from a user. ex) ko_KR")
    @RequestMapping(value = "/echo/locale", method = RequestMethod.GET, consumes = "*/*")
    @ResponseBody
    public Locale echoLocale(@ApiParam(required = false, value = "Locale value will be echoed.") @RequestParam(required = false) Locale locale) {
        if (locale == null) {
            return Locale.US;
        }

        return locale;
    }

    @ApiOperation(value = "Echo encoded password from plain input")
    @RequestMapping(value = "/echo/encoded-password", method = RequestMethod.GET, consumes = "*/*", produces = "*/*")
    @ResponseBody
    public String makePasswordCode(@ApiParam(required = false, value = "Plain password") @RequestParam(required = false) String password) {
        return passwordEncoder.encode(password);
    }

}
