package io.swagger.api;

import io.swagger.annotations.ApiParam;


import io.swagger.mybatis.Account;

import io.swagger.mybatis.Location;
import io.swagger.mybatis.Post;
import io.swagger.mybatis.Review;
import io.swagger.mybatis.dao.AccountMapper;
import io.swagger.mybatis.dao.LocationMapper;
import io.swagger.mybatis.dao.PostMapper;
import io.swagger.mybatis.dao.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tao on 17-5-15.
 */
@Controller
public class AccountApiController implements AccountApi{

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private ReviewMapper reviewMapper;

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public ResponseEntity<List<HashMap<String, Object>>> getFollowingList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) Integer accontId, @RequestParam(required = true)String testParm) {


       List< HashMap<String, Object>>result = new ArrayList<HashMap<String, Object>>();
        System.out.println("for  ----- ");
        List<Review> reviews = reviewMapper.selectByAccountId(accontId);
        System.out.println("for  ++++  ");

        for (Review review : reviews){
            System.out.println("review Id  "+review.getId());
            HashMap locationHistory = new HashMap();
            List<Post> posts = postMapper.selectByReviewId(review.getId());
            for (Post post : posts){
                Location location = locationMapper.selectByPrimaryKey(review.getLocationId());
                locationHistory.put("post",post);
                locationHistory.put("store", location);
            }

            result.add(locationHistory);
        }




//        Account account = post.getAccount();

        Account account = accountMapper.selectByPrimaryKey(accontId);
       ;


        System.out.println("------------account------" + account.toString());

        return new ResponseEntity<List<HashMap<String, Object>>>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> getFollowerList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String accontId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getBookmarkList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addFollow(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken, @RequestParam String accountId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> addBookmark(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken, @RequestParam String locationId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> editAccount(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken, @RequestParam(required = false) String nickname, @RequestParam(required = false) String address, @RequestParam(required = false) String avatarPath, @RequestParam(required = false) String signature) {
        return null;
    }

    @Override
    public ResponseEntity<Void> editPassword(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName, @RequestParam(required = true) String confirmationCode, @RequestParam(required = true) String newPassword) {
        return null;
    }

    @Override
    public ResponseEntity<Void> sendConfirmSms(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName) {
        return null;
    }

    @Override
    public ResponseEntity<Void> requestPasswordModify(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName) {
        return null;
    }

    @Override
    public ResponseEntity<Void> login(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName, @RequestParam(required = true) String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> signup(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName, @RequestParam(required = true) String password, @RequestParam(required = true) String confirmationCode) {
        return null;
    }

    @Override
    public ResponseEntity<Void> thirdpartyLogin(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String openid, @RequestParam(required = true) String thirdParty) {
        return null;
    }

    @Override
    public ResponseEntity<Void> thirdpartySigup(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String thirdParty) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getAccountList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = false) String keyword, @RequestParam(required = false) String page) {
        return null;
    }

    @Override
    public ResponseEntity<Void> exists(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName) {
        return null;
    }

    @Override
    public ResponseEntity<Void> userFollowing(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteFollow(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken, @RequestParam(required = true) String accountId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getPostList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = true) String accountId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBookmark(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken, @RequestParam(required = true) String locationId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getLocationHistoryList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = false) String userToken, @RequestParam(required = true) String accountId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> sendConfirmMG(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName) {
        return null;
    }

    @Override
    public ResponseEntity<Void> rePasswordtoMG(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getFriendList(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String userToken) {
        return null;
    }

    @Override
    public ResponseEntity<Void> sendConfirmMail(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName) {
        return null;
    }

    @Override
    public ResponseEntity<Void> rePasswordtoMail(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName) {
        return null;
    }

    @Override
    public ResponseEntity<Void> adminSignup(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName, @RequestParam(required = true) String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> editAdminPwd(@Min(1) @ApiParam(value = "", required = true) @RequestParam(required = true) String accountName, @RequestParam(required = true) String password, @RequestParam(required = true) String newPassword) {
        return null;
    }
}
