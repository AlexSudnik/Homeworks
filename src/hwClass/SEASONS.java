package hwClass;

public enum SEASONS {

    JANUARY("зима"),
    FEBRUARY("зима"),
    MARCH("весна"),
    APRIL("весна"),
    MAY("весна"),
    JUNE("лето"),
    JULY("лето"),
    AUGUST("лето"),
    SEPTEMBER("осень"),
    OCTOBER("осень"),
    NOVEMBER("осень"),
    DECEMBER("зима");

    private String seasonName;

    public String getSeasonName() {
        return seasonName;
    }

    SEASONS(String seasonName) {
        this.seasonName = seasonName;

    }
}
