package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.service.PostService;
import technicalblog.model.Post;

import java.util.ArrayList;

@Controller
public class HomeController {
    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {

        ArrayList<Post> Posts = postService.getAllPosts();
        model.addAttribute("Posts", Posts);
        return "index";
    }
}
