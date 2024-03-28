package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDayBeenInAllRoomsTest {

    @Test
    void firstDayBeenInAllRooms() {
        FirstDayBeenInAllRooms firstDayBeenInallRooms = new FirstDayBeenInAllRooms();
        assertEquals(6, firstDayBeenInallRooms.firstDayBeenInAllRooms(new int[]{0, 1, 2, 0}));
    }
}