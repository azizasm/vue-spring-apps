package com.hokenso.vuespringapps.controller;

import com.hokenso.vuespringapps.domain.Challenges;
import com.hokenso.vuespringapps.repository.ChallengesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class BackendController {

    private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

    public static final String PING_TEXT = "Hello from Spring Boot Backend!";

    @Autowired
    private ChallengesRepository challengesRepository;

    @RequestMapping(path = "/ping")
    public @ResponseBody String sayHello() {
        LOG.info("GET called on /hello resource");
        return PING_TEXT;
    }

    @RequestMapping(path = "/challenges", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody long addNewChallenges (@RequestParam String level, @RequestParam String title) {
        Challenges challenges = new Challenges(level, title, "", "", "", "", "");
        challengesRepository.save(challenges);

        LOG.info(challenges.toString() + " successfully saved into DB");

        return challenges.getId();
    }

    @GetMapping(path="/challenges/{id}")
    public @ResponseBody
    Challenges getChallengesById(@PathVariable("id") long id) {
        LOG.info("Reading challenges with id " + id + " from database.");
        return challengesRepository.findById(id).get();
    }

}
