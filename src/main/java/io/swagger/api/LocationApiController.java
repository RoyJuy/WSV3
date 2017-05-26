package io.swagger.api;

import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Min;

/**
 * Created by tao on 17-5-15.
 */
@Controller
public class LocationApiController implements LocationApi{
    @Override
    public ResponseEntity<Void> getAuthLocationCover(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getAuthLocationAlbum(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getLocationItem(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getLocationList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getReviewList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addLocationCover(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addLocationAlbum(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addLocation(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> editLocation(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getLocationSearch(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteLocationAlbum(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }
}
