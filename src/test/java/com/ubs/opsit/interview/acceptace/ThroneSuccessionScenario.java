package com.ubs.opsit.interview.acceptace;

import org.junit.Test;

import static com.ubs.opsit.interview.acceptace.framework.BehaviourTestEmbedder.aBehaviouralTestRunner;

/**
 * Acceptance test class that uses the JBehave (Gherkin) syntax for writing stories.  You need to
 * edit this class to complete the exercise.
 */
public class ThroneSuccessionScenario {
    @Test
    public void throneSuccessionAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("throne-succession.story")
                .run();
    }
}
