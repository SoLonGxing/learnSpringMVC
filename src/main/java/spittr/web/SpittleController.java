package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        System.out.println("SpittleRepository is in");
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)

    public List<Spittle> spittles(
            @RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count", defaultValue = "20") int count)
    {
        return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
    }


}
