package InterfacesAndAbstractionExercise.P04Telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Smartphone implements Browsable,Callable {
    private List<String> numbers;
    private List<String> sites;
    public Smartphone(){
        this.numbers=new ArrayList<>();
        this.sites=new ArrayList<>();
    }

    @Override
    public String browsing() {
        StringBuilder sb = new StringBuilder();

        this.sites.stream().forEach(n -> {
            if(n.matches("^([^\\d\\s]*)$")){
                sb.append(String.format("Browsing: %s!",n)).append(System.lineSeparator());
            }else{
                sb.append("Invalid URL!").append(System.lineSeparator());
                //Invalid number!"
            }
        });

        return sb.toString();
    }

    public void addNumber(List<String> number){

        this.numbers.addAll(number);
    }
public void addSite(List<String> site){
        this.sites.addAll(site);
}
    @Override
    public String calling() {
        StringBuilder sb = new StringBuilder();
        this.numbers.stream().forEach(n -> {
            if(n.matches("[\\d]+")){
                sb.append(String.format("Calling... %s",n)).append(System.lineSeparator());
            }else{
                sb.append("Invalid number!").append(System.lineSeparator());
                //Invalid number!"
            }
        });

        return sb.toString();
    }
}
