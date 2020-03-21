package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Felipe Lima");
        post1.setData(LocalDate.now());
        post1.setTitulo("Estudo Java");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus egestas sem et justo gravida accumsan. Curabitur nec nibh non felis lacinia efficitur et ac turpis. Vestibulum sit amet congue leo. Vestibulum tincidunt volutpat ipsum a imperdiet. Nullam vel magna eu risus faucibus pellentesque mattis at nibh. Nullam congue imperdiet orci.");

        Post post2 = new Post();
        post2.setAutor("Felipe Lima");
        post2.setData(LocalDate.now());
        post2.setTitulo("Estudo Spring");
        post2.setTexto("Vestibulum sit amet congue leo. Vestibulum tincidunt volutpat ipsum a imperdiet. Nullam vel magna eu risus faucibus pellentesque mattis at nibh. Nullam congue imperdiet orci.");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
