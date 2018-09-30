/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentplanner;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sriem
 */
public class TimeGapTest {
    
    Time startTime = new Time(12,00);
    Time endTime = new Time(13,00);
    TimeSpan timespan = new TimeSpan(startTime, endTime);
    TimeGap timeGap = new TimeGap(startTime, endTime);
    /**
     * Test of getStart method, of class TimeGap.
     */
    @Test
    public void testTimeGap() {
        TimeGap firstConstructor = new TimeGap(timespan, startTime);
        assertEquals(startTime, firstConstructor.getStart());
        
        TimeGap secondConsturctor = new TimeGap(startTime, endTime);
        assertEquals(startTime, secondConsturctor.getStart());
        
    }
    
    /**
     * Test of getStart method, of class TimeGap.
     */
    @Test
    public void testGetStart() {
        assertEquals(startTime, timeGap.getStart());
    }

    /**
     * Test of getEnd method, of class TimeGap.
     */
    @Test
    public void testGetEnd() {
        assertEquals(endTime, timeGap.getEnd());
    }

    /**
     * Test of getLength method, of class TimeGap.
     */
    @Test
    public void testGetLength() {
        assertEquals(new TimeSpan(startTime, endTime), timeGap.getLength());

    }

    /**
     * Test of toString method, of class TimeGap.
     */
    @Test
    public void testToString() {
        assertEquals("StartTime: 12:00, EndTime: 13:00", timeGap.toString());
    }

    /**
     * Test of equals method, of class TimeGap.
     */
    @Test
    public void testEquals() {
        Time startTime2 = new Time(11,00);
        Time endTime2 = new Time(15,00);
        TimeGap timeGap2 = new TimeGap(startTime2, endTime2);
        TimeGap timeGap3 = null;
        assertTrue(timeGap.equals(timeGap));
        assertFalse(timeGap.equals(timeGap3));
        
        assertFalse(timeGap.equals(timeGap2));
        
        assertFalse(timeGap.getClass().equals(startTime2.getClass()));
        assertTrue(timeGap2.getClass().equals(timeGap.getClass()));
        
        
        assertFalse(timeGap.getStart().equals(timeGap2.getStart()));
        assertFalse(timeGap.getEnd().equals(timeGap2.getEnd()));
    }
    
}
