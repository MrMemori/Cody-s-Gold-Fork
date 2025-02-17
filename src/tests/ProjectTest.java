package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import model.Expense;
import model.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TCSS 360B
 * Team MVP - Deliverable 3
 * tests.ProjectTest.java
 *
 * @author Maple Gunn
 *
 */
public class ProjectTest {

    private Project myDefaultProject;

    @BeforeEach
    void setUp() throws Exception {
        myDefaultProject = new Project("Test-Project", 500);
    }

    @Test
    void testProjectName() {
        final String expectedName = "Test-Project";

        assertEquals(expectedName, myDefaultProject.getName(),
                "This assert tests the default Project name");
    }

    @Test
    void testBudget() {
        final int expectedBudget = 500;

        assertEquals(expectedBudget, myDefaultProject.getBudget(),
                "This assert tests the default Project budget");
    }

}
