package Inheritance.OnlineRadioDatabase;

public class Length {
    private int minutes;
    private int seconds;
    public Length(String length){
        this.parseLength(length);

    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private void  parseLength(String length ){
        String[] arguments = length.split(":");
        if(arguments.length != 2 || !arguments[0].matches("\\d+") || !arguments[1].matches("\\d+")){
throw  new InvalidSongLengthException("Invalid song length.");

        }
        int minutes = Integer.parseInt(arguments[0]);
        int seconds = Integer.parseInt(arguments[1]);
     int totalLength = minutes* 60 + seconds;
    int minLength = 0;
    int maxLength = 14*60 + 59;
    if(totalLength<minLength || totalLength>maxLength){
       throw new InvalidSongLengthException("Invalid song length.");
    }

this.setMinutes(minutes);
    this.setSeconds(seconds);

    }

    private void setMinutes(int minutes) {
        if(minutes>14||minutes<0){
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    private void setSeconds(int seconds) {
         if(seconds<0 || seconds>59){
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }
}
