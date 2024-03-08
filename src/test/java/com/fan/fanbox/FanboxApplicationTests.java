package com.fan.fanbox;

import com.fan.fanbox.mapper.PermissionMapper;
import com.fan.fanbox.utils.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class FanboxApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private PermissionMapper permissionMapper;
    @Test
    public void TestBCryptPasswordEncoder() throws Exception {

        System.out.println(permissionMapper.selectPermsByUserId(1L));

    }

}
