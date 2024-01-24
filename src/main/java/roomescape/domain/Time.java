package roomescape.domain;

public class Time {
    private Long id;
    private String time;

    public Time() { }

    public Time(Long id) { this.id = id; }

    public Time(Long id, String time) {
        this.id = id;
        this.time = time;
    }

    public Long getId() { return id; }
    public String getTime() { return time; }

    public static Time toEntity(Time time, Long id) {
        return new Time(id, time.time);
    }

    public static boolean checkValidity(Time time) {
        return (time.getTime().isEmpty() || time.getId() == null);
    }
}
