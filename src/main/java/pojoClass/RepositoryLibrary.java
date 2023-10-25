package pojoClass;

public class RepositoryLibrary {

	private String name;
	private String description;
	private String homepage;
	private boolean repoStatus;

	public RepositoryLibrary() {

	}

	public RepositoryLibrary(String name, String description, String homepage, boolean repoStatus) {
		// super();
		this.name = name;
		this.description = description;
		this.homepage = homepage;
		this.repoStatus = repoStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public boolean getRepoStatus() {
		return repoStatus;
	}

	public void setRepoStatus(boolean repoStatus) {
		this.repoStatus = repoStatus;
	}

}
