package testapp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class TestAppOsgiEntryPoint implements BundleActivator {
  public void start(BundleContext context) throws Exception {
    System.out.println("@@@ starting test bundle @@@");

    TestApp.main(new String[0]);
  }

  public void stop(BundleContext context) throws Exception {
    System.out.println("@@@ stopping test bundle @@@");
  }
}