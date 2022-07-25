package behavioral.iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Channel> channelList = List.of(new Channel("Channel1"),
                new Channel("Channel2"),
                new Channel("Channel3"));
        TvChannelIterator iterator = new TvChannelIterator(channelList);

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}
