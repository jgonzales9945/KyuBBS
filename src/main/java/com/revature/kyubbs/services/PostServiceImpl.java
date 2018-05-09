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
<<<<<<< HEAD
	public List<Post> findPostByThreadId(Long threadId) {
=======
	public List<Post> getAllPostsByThreadId(Long threadId) {

>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
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
	public void deletePostById(Long id) {
		postrepo.deleteById(id);
	}

	@Override
	public List<Post> findPostByIpAddress(String ipAddress) {
		return postrepo.findPostByIpAddress(ipAddress);
	}

	@Override
	public List<Post> findPostByUserId(Long userId) {
		return postrepo.findPostByUserId(userId);
	}

	@Override
	public List<Post> findPostByName(String name) {
		return postrepo.findPostByName(name);
	}

	@Override
	public List<Post> findAllPosts() {
		return postrepo.findAll();
	}
}
