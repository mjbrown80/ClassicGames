public class RockPaperScissors {

    private String rock;
    private String paper;
    private String scissors;

    public RockPaperScissors(String rock, String paper, String scissors) {
        this.rock = rock;
        this.paper = paper;
        this.scissors = scissors;
    }

    public RockPaperScissors() {
    }

    public String getRock() {
        return rock;
    }

    public void setRock(String rock) {
        this.rock = rock;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getScissors() {
        return scissors;
    }

    public void setScissors(String scissors) {
        this.scissors = scissors;
    }
}
