package main.java.Util;

public class VersionControl {
    protected static boolean isBadVersion(int version) {
        if (version <= 3) return false;
        return true;
    }
}
