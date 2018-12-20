package maxplus.kmj.com.listview;

public class Data {
    private String title;
    private String content;
    private int peopleCount;
    private String when;

    public Data(String title, String content, int peopleCount, String when) {
        this.title = title;
        this.content = content;
        this.peopleCount = peopleCount;
        this.when = when;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }
}
