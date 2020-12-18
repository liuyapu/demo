package com.example.demo.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Builder
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class User {

    private String userId;
    private String userName;
    private String userSex;
    private Timestamp createTime;
    private Timestamp updateTime;

}

