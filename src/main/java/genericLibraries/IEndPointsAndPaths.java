package genericLibraries;

public interface IEndPointsAndPaths {
	String postForAuthUser ="/user/repos";
	String getRepoForAuthUser ="/user/repos";
	String getAllUserRepo="/users/{username}/repos";
	String getRepoForOwner ="/repos/{owner}/{repo}";
	String patchRepo ="/repos/{owner}/{repo}";
	String deleteRepo="/repos/{owner}/{repo}";
	String searchRepo ="/search/repositories";
	
	String propertiesPath = System.getProperty("user.dir")+"/src/test/resources/pathParameters.properties";

}
