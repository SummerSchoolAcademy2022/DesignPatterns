package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class TvChannelIterator implements ChannelIterator {

    private List<Channel> channels;
    private int current;

    public TvChannelIterator(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public Channel getNext() {
        return channels.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < channels.size();
    }
}
