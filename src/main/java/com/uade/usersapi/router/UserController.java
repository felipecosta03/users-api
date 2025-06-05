package com.uade.usersapi.router;

import com.uade.usersapi.router.dto.user.FollowRequestDto;
import com.uade.usersapi.router.dto.user.UserDto;
import com.uade.usersapi.router.dto.user.UserPreviewDto;
import com.uade.usersapi.router.dto.user.UserSignUpDto;
import com.uade.usersapi.router.dto.user.UserUpdateDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Tag(name = "Users API", description = "API for managing users in the system")
@RestController
public class UserController {

  @GetMapping("/users/{id}")
  public ResponseEntity<UserDto> getUser(@PathVariable String id) {

    return null;
  }

  @PostMapping("/sign-up")
  public ResponseEntity<UserDto> signUp(@RequestBody UserSignUpDto userSignUpDto) {

    return null;
  }

  @PostMapping("/sign-in")
  public ResponseEntity<UserDto> createUser(@RequestBody UserSignUpDto userSignInDto) {

    return null;
  }

  @PutMapping("/users")
  public ResponseEntity<UserDto> updateUser(
      @RequestPart("user") UserUpdateDto userDto,
      @RequestPart(value = "image", required = false) MultipartFile image) {

    return null;
  }

  @GetMapping("/users/{id}/followers")
  public ResponseEntity<UserPreviewDto> getFollowers(@PathVariable String id) {
    return null;
  }

  @GetMapping("/users/{id}/following")
  public ResponseEntity<UserPreviewDto> getFollowing(@PathVariable String id) {
    return null;
  }

  @GetMapping("/users/{id}/followers-requests")
  public ResponseEntity<FollowRequestDto> getFollowersRequests(@PathVariable String id) {
    return null;
  }

  @PostMapping("/users/{id}/follow-requests")
  public ResponseEntity<Void> sendFollowRequest(@PathVariable String id) {
    return null;
  }

  @PostMapping("/users/follow-requests/{requestId}/accept")
  public ResponseEntity<Void> acceptFollowRequest(@PathVariable String requestId) {
    return null;
  }

  @PostMapping("/users/follow-requests/{requestId}/reject")
  public ResponseEntity<Void> rejectFollowRequest(@PathVariable String requestId) {
    return null;
  }
}
