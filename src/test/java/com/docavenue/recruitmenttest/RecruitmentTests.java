package com.docavenue.recruitmenttest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.docavenue.recruitmenttest.api.model.Post;
import com.docavenue.recruitmenttest.api.util.RecruitmentTestUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecruitmentTests {

	private Post[] postMock;

	@Before
	public void init() throws IOException {
		byte[] postsFile;
		postsFile = Files.readAllBytes(Paths.get("src/test/resources/mocks/posts.json"));
		ObjectMapper mapper = new ObjectMapper();
		postMock = mapper.readValue(postsFile, Post[].class);
	}

	@Test
	public void testPostSortByTitle() {

		List<Post> sortedList = RecruitmentTestUtil.postSortByTitle(postMock);

		assertNotNull(sortedList);
		assertEquals(50, sortedList.size());
		assertEquals("a", sortedList.get(0).getTitle().toLowerCase().substring(0, 1));
		assertEquals("v", sortedList.get(sortedList.size() - 1).getTitle().toLowerCase().substring(0, 1));
	}

}
