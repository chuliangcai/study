package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question401 {

    public List<String> readBinaryWatch(int num) {

        List<String> times = new ArrayList<>();
        for (int i = 0; i < 1 << 10; i++) {

            //取高四位
            int hour = i >> 6;


            //取低六位
            int minute = i & ((1 << 6) - 1);

            if (hour < 12 && minute < 60 && Integer.bitCount(i) == num) {
                times.add(hour + ":" + (minute < 10 ? ("0" + minute) : minute));
            }

        }
        return times;

    }
}
