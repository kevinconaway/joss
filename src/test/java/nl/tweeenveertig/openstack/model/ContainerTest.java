package nl.tweeenveertig.openstack.model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ContainerTest {

    @Test
    public void testConstructor() {
        Container container = new Container("alpha");
        assertEquals("alpha", container.getName());
        assertEquals("alpha", container.toString());
    }
}