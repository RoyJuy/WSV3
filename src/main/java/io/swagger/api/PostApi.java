package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Min;

/**
 * Created by tao on 17-5-15.
 */
@Api(value = "post", description = "the post API")
public interface PostApi {
    @ApiOperation(value = "getPostList", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/getPostList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void> getPostList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken, @RequestParam(required = false)String accontId);

    @ApiOperation(value = "addPost", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/addPost",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addPost(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getpostItem", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/getpostItem",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getpostItem(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "deletePost", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/deletePost",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>deletePost(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "addLikePost", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/addLikePost",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addLikePost(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "addComment", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/addComment",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addComment(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "deleteLikePost", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/deleteLikePost",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>deleteLikePost(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getCommetList", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/getCommetList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getCommetList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "deleteComment", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/deleteComment",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>deleteComment(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "sharePostToThirdParty", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/sharePostToThirdParty",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>sharePostToThirdParty(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getPostItem", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/getPostItem",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getPostItem(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "editPost", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/editPost",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>editPost(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "editComment", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/editComment",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>editComment(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "addBookmarkPost", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/addBookmarkPost",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addBookmarkPost(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "deleteBookmarkPost", notes = "", response = Void.class, tags = {"post"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/post/deleteBookmarkPost",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>deleteBookmarkPost(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);
}
