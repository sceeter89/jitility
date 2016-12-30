package ut.pl.co.marszalek.jitility;

import org.junit.Test;
import pl.co.marszalek.jitility.api.MyPluginComponent;
import pl.co.marszalek.jitility.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}