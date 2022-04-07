package test.aula01;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;



import static org.junit.jupiter.api.Assertions.assertTrue;

public class RuleTest {

	@Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();
 
    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = tmpFolder.newFile("file.txt");
 
        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
	
}
