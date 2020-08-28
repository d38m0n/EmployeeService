package EmployeeService.EmployeeService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommuteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commute;
    private String time_start;
    private String time_stop;
    private String realization_date;
    private int distance;
    private String totalTime;

    public Long getId_commute() {
        return id_commute;
    }

    public void setId_commute(Long id_commute) {
        this.id_commute = id_commute;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_stop() {
        return time_stop;
    }

    public void setTime_stop(String time_stop) {
        this.time_stop = time_stop;
    }

    public String getRealization_date() {
        return realization_date;
    }

    public void setRealization_date(String realization_date) {
        this.realization_date = realization_date;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }
}
