	package com.post.repository;
	
	import java.util.List;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Repository;
	
	import com.post.entity.Post;
	
	
	@Repository
	public interface PostRepo extends JpaRepository<Post, Long> {
		
//		@Query(value = "SELECT post_id, post_content, date_time, status FROM tbl_posts", nativeQuery = true)
//		  List<Post> findPostsWithSpecificColumnsUsingNativeQuery();
		@Query("SELECT p FROM Post p ORDER BY p.dateTime DESC")
	    List<Post> findLatestPosts();
		
	}
