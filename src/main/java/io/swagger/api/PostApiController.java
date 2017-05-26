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
public class PostApiController implements PostApi{
    @Override
    public ResponseEntity<Void> getPostList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addPost(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getpostItem(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePost(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addLikePost(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addComment(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteLikePost(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getCommetList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteComment(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> sharePostToThirdParty(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getPostItem(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> editPost(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> editComment(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addBookmarkPost(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBookmarkPost(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }
}
