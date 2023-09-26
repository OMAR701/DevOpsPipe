package com.example.pipedevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PipeDevOpsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    public static void main(String[] args) {
        SpringApplication.run(PipeDevOpsApplication.class, args);
    }

//    echo "# DevOpsPipe" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/OMAR701/DevOpsPipe.git
//    git push -u origin main
}
