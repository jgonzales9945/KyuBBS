package com.revature.kyubbs.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.BoardThread;
import com.revature.kyubbs.models.Post;
import com.revature.kyubbs.repositories.PostRepository;

@Service
@Transactional
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postrepo;

//	@Override
//	public List<Post> getAllPostsByThread(Long thread_id) {
//		List<Post> temp = postrepo.findAll();
//		List<Post> returnPost = new ArrayList<Post>();
//
//		for (Post p : temp) {
//			if (p.getThread_id().getId() == thread_id) {
//				returnPost.add(p);
//			}
//		}
//		return returnPost;
//	}

	@Override
	public Post findPostById(Long id) {
		return postrepo.getOne(id);
	}

	@Override
	public Post addPost(Post post) {
		
		if(post.getName() == null || post.getName().trim().length() <= 0) {
			post.setName("Anonymous");
		}
		
		Timestamp date = new Timestamp(System.currentTimeMillis());
		post.setFlag(0);
		post.setStartDate(date);
		
		return postrepo.save(post);
	}

	@Override
	public Post updatePost(Post post) {
		
		Timestamp date = new Timestamp(System.currentTimeMillis());
		post.setModifiedDate(date);
		
		return postrepo.save(post);
	}

	@Override
	public void deletePost(Long id) {
		postrepo.deleteById(id);
	}

	@Override
	public List<Post> findAllPosts() {
		return postrepo.findAll();
	}

	@Override
	public List<Post> findPostsByThreadId(Long threadId) {

		BoardThread thread = new BoardThread();
		thread.setId(threadId);
		
		return postrepo.findPostsByThreadId(thread);
	}
}
