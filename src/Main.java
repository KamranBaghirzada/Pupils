import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        PupilDao pd = new PupilDao();
        Pupil.list = pd.getPupilsPutIntoList(pd.pupilCount());
        for (int i = 0; i <=26; i++) {
            Pupil p = Pupil.list.get(i);
            System.out.println(p.toString(i));
        }
    }
}
