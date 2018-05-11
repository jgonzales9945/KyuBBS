package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		return postrepo.save(post);
	}

	@Override
	public Post updatePost(Post post) {
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
}
