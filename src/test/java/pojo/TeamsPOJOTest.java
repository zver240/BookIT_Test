package pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class TeamsPOJOTest {

    private String number;
    private Boolean isGraduated;
    private ArrayList<Map<?,?>> teams;

}
