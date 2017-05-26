package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Min;

/**
 * Created by tao on 17-5-9.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-04T15:09:31.604+08:00")
@Controller
public class ReviewApiController implements ReviewApi {
    private final ObjectMapper objectMapper;

    public ReviewApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    @Override
    public ResponseEntity<Void> deleteOrder(@Min(1) @ApiParam(value = "ID of the order that needs to be deleted", required = true) @PathVariable("orderId") Long orderId, @RequestHeader("Accept") String accept) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> getReviewList(@RequestParam(required = false) String userToken, @RequestParam(required = false) String locationId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addReview(@RequestParam String userToken, @RequestParam String locationId, @RequestParam(required = false) String rating, @RequestParam(required = false) String review, @RequestParam(required = false) String tags, @RequestParam(required = false) String image1, @RequestParam(required = false) String image2, @RequestParam(required = false) String image3) {
        return null;
    }


}
