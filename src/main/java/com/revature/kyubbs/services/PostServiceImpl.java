package com.revature.kyubbs.services;

import java.util.ArrayList;
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

	public PostServiceImpl() {
		super();
	}

	@Override
	public List<Post> getAllPostsByThread(Long threadId) {
		List<Post> temp = postrepo.findAll();
		List<Post> returnPost = new ArrayList<Post>();

		for (Post p : temp) {
			if (p.getThreadId() == threadId) {
				returnPost.add(p);
			}
		}
		return returnPost;
	}

	@Override
	public Post findPostById(Long id) {
		return postrepo.getOne(id);
	}

	@Override
	public void addPost(Post post) {
		postrepo.save(post);
	}

	@Override
	public void updatePost(Post post) {
		postrepo.save(post);
	}

	@Override
	public void deletePost(Post post) {
		postrepo.delete(post);
	}
}
