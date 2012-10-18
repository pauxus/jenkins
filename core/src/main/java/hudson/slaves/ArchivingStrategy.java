package hudson.slaves;

import hudson.Extension;
import hudson.ExtensionPoint;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;

import org.kohsuke.stapler.DataBoundConstructor;


public class ArchivingStrategy extends AbstractDescribableImpl<ArchivingStrategy> implements ExtensionPoint {

  public static final StreamStrategy INSTANCE = new StreamStrategy();

  public static class StreamStrategy extends ArchivingStrategy {

    /**
     * Constructs a new Always.
     */
    @DataBoundConstructor
    public StreamStrategy() {
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<ArchivingStrategy> {

      public String getDisplayName() {
        return "Use stream copy";
      }
    }
  }

}
