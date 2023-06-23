package First_Bad_Version;

public class Version {

    private boolean badVersion;

    public Version(boolean badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(){
        return badVersion;
    }
}
