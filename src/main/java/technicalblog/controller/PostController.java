package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.util.ArrayList;

@Controller
public class PostController {

    @Autowired
    public PostService postService;

    @RequestMapping ("posts")
    public String getUserPosts(Model model){
        ArrayList<Post> Posts = postService.getOnePost();
        model.addAttribute("Posts", Posts);
        return "Posts";
    }
}
