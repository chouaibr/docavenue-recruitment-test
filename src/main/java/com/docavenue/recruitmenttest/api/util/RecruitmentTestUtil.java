/**
 *
 */
package com.docavenue.recruitmenttest.api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.docavenue.recruitmenttest.api.model.Post;

/**
 * @author crabhi
 *
 */
public class RecruitmentTestUtil {

	/**
	 * Private constructor for Util class
	 */
	private RecruitmentTestUtil() {
		// Do nothing
	}

	/**
	 * Sort list of {@link Post} by title
	 *
	 * @param posts
	 * @return
	 */
	public static List<Post> postSortByTitle(Post[] posts) {

		List<Post> sortedList = posts == null ? new ArrayList<>() : Arrays.asList(posts);

		Comparator<Post> comparatorTitle = (p1, p2) -> p1.getTitle().compareTo(p2.getTitle());

		sortedList = sortedList.stream().limit(50).sorted(comparatorTitle).collect(Collectors.toList());

		return sortedList;
	}

}
