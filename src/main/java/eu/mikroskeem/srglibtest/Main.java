package eu.mikroskeem.srglibtest;

import net.techcable.srglib.JavaType;
import net.techcable.srglib.SrgLib;
import net.techcable.srglib.format.MappingsFormat;
import net.techcable.srglib.mappings.Mappings;

/**
 * @author Mark Vainomaa
 */
public class Main {
    public static void main(String[] args) {
        Mappings m = MappingsFormat.SEARGE_FORMAT.parseLines(
                "CL: eu/mikroskeem/Foo eu/mikroskeem/Bar"
        );
        SrgLib.checkConsistency(m.snapshot());

        JavaType jt = m.getNewClass(JavaType.fromName("eu.mikroskeem.Foo"));
        System.out.println(jt.getName());
    }
}
