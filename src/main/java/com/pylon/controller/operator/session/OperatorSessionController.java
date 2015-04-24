package com.pylon.controller.operator.session;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by simon on 4/22/15.
 */
@Api(value = "", description = "Operator's session management.")
@Controller
@RequestMapping(value = "/api/v1/operators/session")
public class OperatorSessionController {

    /**
     * This is hollow controller to represent signature of spring-security to swagger. It just have a same mapping which described by 'login-processing-url'
     *
     * @see http://docs.spring.io/spring-security/site/docs/3.0.x/reference/appendix-namespace.html#nsa-form-login
     */
    @ApiOperation(value = "Acquire a session for an operator. It means, you can access using this session.")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.TEMPORARY_REDIRECT)
    public void operatorSignIn(
            @ApiParam(required = true, value = "Operator account name for a session.") @RequestParam String username,
            @ApiParam(required = true, value = "Password for a session.") @RequestParam String password
    ) {
        throw new UnsupportedOperationException("Temporarily Unavailable.");
    }

    /**
     * This is hollow controller to represent signature of spring-security to swagger. It just have a same mapping which described by 'logout-url'
     *
     * @see http://docs.spring.io/spring-security/site/docs/3.0.x/reference/appendix-namespace.html#nsa-logout
     */
    @ApiOperation(value = "Remove current session. It means you can't access using session anymore.")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.TEMPORARY_REDIRECT)
    public void operatorSignOut() {
        throw new UnsupportedOperationException("Temporarily Unavailable.");
    }

}
