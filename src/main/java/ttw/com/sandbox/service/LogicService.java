package ttw.com.sandbox.service;

import org.springframework.stereotype.Service;

@Service
public class LogicService {
    public int doMath(int[] numbers){
        int total = 0;
        for(int number: numbers){
            total += number;
        }
        return total;
    }
}
