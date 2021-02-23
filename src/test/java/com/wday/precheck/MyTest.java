package com.wday.precheck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MyTest {

    @Mock
    private List<Integer> strings;

    @Test
    void verify() {
        when(strings.size()).thenReturn(1);

        assertEquals(1, strings.size());
    }
}