package com.yn.phyClinic.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MyToken {
    private UUID token;
    private String userName;
}
