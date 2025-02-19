package com.yn.phyClinic.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoginRes {

    private UUID token;
    private String userName;
}
