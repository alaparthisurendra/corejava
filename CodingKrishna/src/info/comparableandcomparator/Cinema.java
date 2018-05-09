package info.comparableandcomparator;

import java.util.Date;

public class Cinema  implements Comparable<Cinema>{

	private String cinemaTitle;
	private String cinemaDirector;
	private String cinemaHero;
	private String cinemaHeroine;
	private Integer cinemaBudget;
	private String cinemaProducer;
	private String cinemaMusic;
	private String cinemaReleasedDate;
	private Integer cinemaCentres;
	private String cinemaResult;
	

	public Cinema() {
		super();
	}

	public Cinema(String cinemaTitle, String cinemaDirector, String cinemaHero, String cinemaHeroine,
			Integer cinemaBudget, String cinemaProducer, String cinemaMusic, String cinemaReleasedDate,
			Integer cinemaCentres, String cinemaResult) {
		super();
		this.cinemaTitle = cinemaTitle;
		this.cinemaDirector = cinemaDirector;
		this.cinemaHero = cinemaHero;
		this.cinemaHeroine = cinemaHeroine;
		this.cinemaBudget = cinemaBudget;
		this.cinemaProducer = cinemaProducer;
		this.cinemaMusic = cinemaMusic;
		this.cinemaReleasedDate = cinemaReleasedDate;
		this.cinemaCentres = cinemaCentres;
		this.cinemaResult = cinemaResult;
	}

	public String getCinemaTitle() {
		return cinemaTitle;
	}

	public void setCinemaTitle(String cinemaTitle) {
		this.cinemaTitle = cinemaTitle;
	}

	public String getCinemaDirector() {
		return cinemaDirector;
	}

	public void setCinemaDirector(String cinemaDirector) {
		this.cinemaDirector = cinemaDirector;
	}

	public String getCinemaHero() {
		return cinemaHero;
	}

	public void setCinemaHero(String cinemaHero) {
		this.cinemaHero = cinemaHero;
	}

	public String getCinemaHeroine() {
		return cinemaHeroine;
	}

	public void setCinemaHeroine(String cinemaHeroine) {
		this.cinemaHeroine = cinemaHeroine;
	}

	public Integer getCinemaBudget() {
		return cinemaBudget;
	}

	public void setCinemaBudget(Integer cinemaBudget) {
		this.cinemaBudget = cinemaBudget;
	}

	public String getCinemaProducer() {
		return cinemaProducer;
	}

	public void setCinemaProducer(String cinemaProducer) {
		this.cinemaProducer = cinemaProducer;
	}

	public String getCinemaMusic() {
		return cinemaMusic;
	}

	public void setCinemaMusic(String cinemaMusic) {
		this.cinemaMusic = cinemaMusic;
	}

	public String getCinemaReleasedDate() {
		return cinemaReleasedDate;
	}

	public void setCinemaReleasedDate(String cinemaReleasedDate) {
		this.cinemaReleasedDate = cinemaReleasedDate;
	}

	public Integer getCinemaCentres() {
		return cinemaCentres;
	}

	public void setCinemaCentres(Integer cinemaCentres) {
		this.cinemaCentres = cinemaCentres;
	}

	public String getCinemaResult() {
		return cinemaResult;
	}

	public void setCinemaResult(String cinemaResult) {
		this.cinemaResult = cinemaResult;
	}

	@Override
	public String toString() {
		return "Cinema [cinemaTitle=" + cinemaTitle + ", cinemaDirector=" + cinemaDirector + ", cinemaHero="
				+ cinemaHero + ", cinemaHeroine=" + cinemaHeroine + ", cinemaBudget=" + cinemaBudget
				+ ", cinemaProducer=" + cinemaProducer + ", cinemaMusic=" + cinemaMusic + ", cinemaReleasedDate="
				+ cinemaReleasedDate + ", cinemaCentres=" + cinemaCentres + ", cinemaResult=" + cinemaResult + "]";
	}

	@Override
	public int compareTo(Cinema o) {
		if(this.cinemaBudget > o.cinemaBudget)
			return 1;
		else if(this.cinemaBudget < o.cinemaBudget)
			return -1;
		return 0;
	}
	

}
