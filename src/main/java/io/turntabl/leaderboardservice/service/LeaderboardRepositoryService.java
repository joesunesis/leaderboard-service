package io.turntabl.leaderboardservice.service;

import io.turntabl.leaderboardservice.controller.request.UsernameRequestDto;
import io.turntabl.leaderboardservice.controller.response.ProfileDto;
import io.turntabl.leaderboardservice.model.Profile;
import io.turntabl.leaderboardservice.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LeaderboardRepositoryService {

    private final ProfileRepository profileRepository;

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public Profile saveProfile(Profile usernameRequest) {
        return profileRepository.save(usernameRequest);
    }
}
