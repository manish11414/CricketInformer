package com.dhurva.api.service;

import com.dhurva.api.entity.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
