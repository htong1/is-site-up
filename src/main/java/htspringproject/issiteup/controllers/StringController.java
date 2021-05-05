package htspringproject.issiteup.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class StringController {
    @GetMapping("/echo")
    public String getWord(@RequestParam String word){
        return word;
    }
    @GetMapping("/mirror")
    public String mirrorWord(@RequestParam String word){
        String reverse = "";
        char[] welp = word.toCharArray();
            for(int x = word.length()-1; x >= 0; x--){
                reverse += welp[x];
            }
        return reverse;
    }
    @GetMapping("/shuffle")
    public String shuffleWord(@RequestParam String word){
     ArrayList<Character> chars = new ArrayList<Character>();
     for(int i = 0; i < word.length(); i++){
         chars.add(word.charAt(i));
     }
     String shuffled = "";
     for(int i = 0; i < word.length(); i++){
         int random = (int)Math.floor(Math.random() * chars.size());
         shuffled+=chars.get(random);
         chars.remove(random);
     }
     return shuffled;
    }
}
