package com.myweapon.rtc_chatting.Repository;

import java.util.Optional;
import com.myweapon.rtc_chatting.Entity.RefreshToken;
import org.springframework.data.repository.CrudRepository;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, String> {
    Optional<RefreshToken> findByToken(String token);

    Optional<RefreshToken> findByAuthId(String authId);
}