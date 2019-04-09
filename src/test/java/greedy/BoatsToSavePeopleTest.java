package greedy;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiDaQian
 */
public class BoatsToSavePeopleTest {

    @Test
    public void test() {
        BoatsToSavePeople boatsToSavePeople = new BoatsToSavePeople();

        Assert.assertThat(1, Is.is(boatsToSavePeople.numRescueBoats(new int[] {1, 2}, 3)));
        Assert.assertThat(3, Is.is(boatsToSavePeople.numRescueBoats(new int[] {3, 2, 2, 1}, 3)));
        Assert.assertThat(4, Is.is(boatsToSavePeople.numRescueBoats(new int[] {3, 5, 3, 4}, 5)));
        Assert.assertThat(2, Is.is(boatsToSavePeople.numRescueBoats(new int[] {5, 1, 4, 2}, 6)));
    }
}
