package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.*;

import io.swagger.mybatis.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tao on 17-5-15.
 */
@Api(value = "account", description = "the account api")
public interface AccountApi {
    @ApiOperation(value = "find Account Item", notes = "", response = Void.class, tags = {"account", })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/getFollowingList",
            produces = {"application/xml", "application/json"},
            method = {RequestMethod.GET,RequestMethod.POST}

    )
    ResponseEntity<List<HashMap<String, Object>>> getFollowingList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken, @RequestParam(required = false)Integer accontId, @RequestParam(required = true)String testParm);

    @ApiOperation(value = "find Account Item", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/getFollowerList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getFollowerList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getBookmarkList", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/getBookmarkList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getBookmarkList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken);

    @ApiOperation(value = "addFollow", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/addFollow",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addFollow(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken, @RequestParam String accountId);

    @ApiOperation(value = "addBookmark", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/addBookmark",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addBookmark(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken, @RequestParam String locationId);

    @ApiOperation(value = "editAccount", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/editAccount",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>editAccount(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken, @RequestParam(required = false) String nickname, @RequestParam(required = false) String address, @RequestParam(required = false) String avatarPath, @RequestParam(required = false) String signature);

    @ApiOperation(value = "editPassword", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/editPassword",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>editPassword(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName, @RequestParam(required = true) String confirmationCode, @RequestParam(required = true) String newPassword);


    @ApiOperation(value = "sendConfirmSms", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/sendConfirmSms",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>sendConfirmSms(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName);

    @ApiOperation(value = "requestPasswordModify", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/requestPasswordModify",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>requestPasswordModify(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName);

    @ApiOperation(value = "login", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/login",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>login(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName, @RequestParam(required = true)String password);

    @ApiOperation(value = "signup", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/signup",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>signup(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName, @RequestParam(required = true)String password, @RequestParam(required = true)String confirmationCode);

    @ApiOperation(value = "thirdpartyLogin", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/thirdpartyLogin",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>thirdpartyLogin(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String openid, @RequestParam(required = true)String thirdParty);

    @ApiOperation(value = "thirdpartySigup", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/thirdpartySigup",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>thirdpartySigup(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String thirdParty);

    @ApiOperation(value = "getAccountList", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/getAccountList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getAccountList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken, @RequestParam(required = false)String keyword, @RequestParam(required = false)String page);

    @ApiOperation(value = "exists", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/exists",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>exists(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName);

    @ApiOperation(value = "userFollowing", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/userFollowing",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>userFollowing(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken);

    @ApiOperation(value = "deleteFollow", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/deleteFollow",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>deleteFollow(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken, @RequestParam(required = true)String accountId);

    @ApiOperation(value = "getPostList", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/getPostList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getPostList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken, @RequestParam(required = true)String accountId);

    @ApiOperation(value = "deleteBookmark", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/deleteBookmark",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>deleteBookmark(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken, @RequestParam(required = true)String locationId);

    @ApiOperation(value = "getLocationHistoryList", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/getLocationHistoryList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getLocationHistoryList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken, @RequestParam(required = true)String accountId);

    @ApiOperation(value = "sendConfirmMG", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/sendConfirmMG",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>sendConfirmMG(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName);

    @ApiOperation(value = "rePasswordtoMG", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/rePasswordtoMG",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>rePasswordtoMG(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName);

    @ApiOperation(value = "getFriendList", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/getFriendList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getFriendList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String userToken);

    @ApiOperation(value = "sendConfirmMail", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/sendConfirmMail",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>sendConfirmMail(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName);

    @ApiOperation(value = "rePasswordtoMail", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/rePasswordtoMail",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>rePasswordtoMail(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName);

    @ApiOperation(value = "adminSignup", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/adminSignup",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>adminSignup(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName, @RequestParam(required = true)String password);

    @ApiOperation(value = "editAdminPwd", notes = "", response = Void.class, tags = {"account"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/account/editAdminPwd",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>editAdminPwd(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = true)String accountName, @RequestParam(required = true)String password, @RequestParam(required = true)String newPassword);

}
