package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

/**
 * Created by tao on 17-5-9.
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-04T15:09:31.604+08:00")

@Api(value = "review", description = "the review API")
public interface ReviewApi {

    @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors", response = Void.class, tags={ "review", })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
    @RequestMapping(value = "/review/order/{orderId}",
            produces = { "application/xml", "application/json" },
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOrder(@Min(1)@ApiParam(value = "ID of the order that needs to be deleted",required=true ) @PathVariable("orderId") Long orderId, @RequestHeader("Accept") String accept);

    @ApiOperation(value = "read review list", tags = {"review"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ", response = Void.class),
            @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    @RequestMapping(value = "/review/getReviewList",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Void>getReviewList( @RequestParam(required = false)String userToken, @RequestParam(required = false)String locationId);

    @ApiOperation(value = "add review", tags = {"review"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = ""),
            @ApiResponse(code = 404, message = "")
    })
    @RequestMapping(value = "/review/addReview",
            produces = {"application/xml", "application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Void>addReview( @RequestParam String userToken, @RequestParam String locationId,
    @RequestParam(required = false)String rating, @RequestParam(required = false)String review, @RequestParam(required = false)String tags,
    @RequestParam(required = false)String image1, @RequestParam(required = false)String image2, @RequestParam(required = false)String image3
    );


}
