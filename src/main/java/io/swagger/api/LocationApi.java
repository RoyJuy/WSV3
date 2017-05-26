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
@Api(value = "location", description = "the location API")
public interface LocationApi {
    @ApiOperation(value = "getAuthLocationCover", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/getAuthLocationCover",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void> getAuthLocationCover(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken, @RequestParam(required = false)String accontId);

    @ApiOperation(value = "getAuthLocationAlbum", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/getAuthLocationAlbum",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getAuthLocationAlbum(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getLocationItem", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/getLocationItem",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getLocationItem(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getLocationList", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/getLocationList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getLocationList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getReviewList", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/getReviewList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getReviewList(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "addLocationCover", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/addLocationCover",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addLocationCover(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "addLocationAlbum", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/addLocationAlbum",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addLocationAlbum(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "addLocation", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/addLocation",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>addLocation(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "editLocation", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/editLocation",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>editLocation(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "getLocationSearch", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/getLocationSearch",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>getLocationSearch(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);

    @ApiOperation(value = "deleteLocationAlbum", notes = "", response = Void.class, tags = {"location"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/location/deleteLocationAlbum",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET
    )
    ResponseEntity<Void>deleteLocationAlbum(@Min(1)@ApiParam(value = "",required = true)@RequestParam(required = false)String userToken,@RequestParam(required = false)String accontId);
}
