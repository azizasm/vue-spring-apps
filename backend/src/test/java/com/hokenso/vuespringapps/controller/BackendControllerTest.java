package com.hokenso.vuespringapps.controller;

import com.hokenso.vuespringapps.VuejsApplication;
import com.hokenso.vuespringapps.domain.Challenges;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = VuejsApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class BackendControllerTest {

	@LocalServerPort
	private int port;

	@Before
    public void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

	@Test
	public void saysHello() {
		when()
			.get("/api/ping")
		.then()
			.statusCode(HttpStatus.SC_OK)
			.assertThat()
				.body(is(equalTo(BackendController.PING_TEXT)));
	}

	@Test
    public void addNewChallengesAndRetrieveItBack() {
        Challenges norbertSiegmund = new Challenges("t1", "l1", "", "" , "" , "", "");

        Long challengesId =
            given()
                .queryParam("title", "t1")
                .queryParam("level", "l1")
            .when()
                .post("/api/challenges")
            .then()
                .statusCode(is(HttpStatus.SC_CREATED))
                .extract()
                    .body().as(Long.class);

	    Challenges responseChallenges =
            given()
                    .pathParam("id", challengesId)
                .when()
                    .get("/api/challenges/{id}")
                .then()
                    .statusCode(HttpStatus.SC_OK)
                    .assertThat()
                        .extract().as(Challenges.class);

	    // Did Norbert came back?
        assertThat(responseChallenges.getTitle(), is("l1"));
        assertThat(responseChallenges.getLevel(), is("t1"));
    }

}
