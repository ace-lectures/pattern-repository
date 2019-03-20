import remote.CachedRegistry;
import remote.Registry;
import remote.RemoteRegistry;

public class Main {

  public static void main(String[] args) {

    System.out.println("\n# Using the remote registry directly");
    Registry remote = new RemoteRegistry();
    consult(remote, "bob");
    consult(remote, "bob");
    consult(remote, "alice");
    consult(remote, "alice");
    consult(remote, "bob");

    System.out.println("\n# Using a cached Registry");
    Registry cached = new CachedRegistry(remote);
    consult(cached, "bob");
    consult(cached, "bob");
    consult(cached, "alice");
    consult(cached, "alice");
    consult(cached, "bob");
  }


  private static void consult(Registry r, String p) {
    System.out.println("  ["+p+"] --> ["+r.getPhoneNumber(p)+"]");
  }


}
