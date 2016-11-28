package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {
        mMusicEvent = new MusicEvent();
        mMusicEvent.setTitle("Test Title");
        mMusicEvent.setTitle("Test Date");
        mMusicEvent.setTitle("Test Time");
        mMusicEvent.setTitle("Test Location");
        mMusicEvent.setTitle("Test Address 1");
        mMusicEvent.setTitle("Test Address 2");
        mMusicEvent.setTitle("Test Image Name");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        assertEquals("Test Title", mMusicEvent.getTitle());
    }

    @Test
    public void getDate() throws Exception {
        assertEquals("Test Date", mMusicEvent.getDate());
    }

    @Test
    public void getDay() throws Exception {
        assertEquals("Test Day", mMusicEvent.getDay());
    }

    @Test
    public void getTime() throws Exception {
        assertEquals("Test Time", mMusicEvent.getTime());
    }

    @Test
    public void getLocation() throws Exception {
        assertEquals("Test Location", mMusicEvent.getLocation());
    }

    @Test
    public void getAddress1() throws Exception {
        assertEquals("Test Address 1", mMusicEvent.getAddress1());
    }

    @Test
    public void getAddress2() throws Exception {
        assertEquals("Test Address 2", mMusicEvent.getAddress2());
    }

    @Test
    public void getImageName() throws Exception {
        assertEquals("Test Image Name", mMusicEvent.getImageName());
    }
}