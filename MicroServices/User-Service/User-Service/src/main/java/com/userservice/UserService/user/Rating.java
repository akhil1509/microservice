package com.userservice.UserService.user;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private  String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private  String remark;
}
