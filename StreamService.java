import java.util.*;


public class StreamService {
    private List<Stream> streamList;

    public List<Stream> getStreamList() {
        return streamList;
    }

    public StreamService(List<Stream> streamList) {
        this.streamList = streamList;
    }

    public List<Stream> getSortedStreamBySize(){
        List<Stream> streamListCopy = new ArrayList<>(streamList);
        Collections.sort(streamListCopy);
        return streamListCopy;
    }
}