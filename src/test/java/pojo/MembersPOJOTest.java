package pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class MembersPOJOTest {

    private int id;
    private String name;
    private ArrayList<Map<?,?>> members;
}
