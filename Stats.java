import java.util.*;

public class Stats {
    private ArrayList<ScoreInfo> scoreList = new ArrayList<ScoreInfo>();

    public boolean record(int score) {
        for (int i = 0; i < scoreList.size(); i++) {
            ScoreInfo s = scoreList.get(i);
            if (s.getScore() == score) {
                s.increment();
                return false;
            }
        }
        scoreList.add(new ScoreInfo(score));
        return true;
    }

    public void recordScores(int[] stuScores) {
        for (int i = 0; i < stuScores.length; i++) {
            record(stuScores[i]);
        }
    }
}
