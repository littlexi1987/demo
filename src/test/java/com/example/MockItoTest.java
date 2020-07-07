package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockItoTest {

    @Mock
    private List<String> mockList;

    @Test
    public void test() {
        mockList.size();
        mockList.add("add a parameter");
        mockList.clear();

        InOrder inOrder = inOrder(mockList);
        inOrder.verify(mockList).size();
        inOrder.verify(mockList).add("add a parameter");
        inOrder.verify(mockList).clear();
    }

    @Mock
    public Map<String, Integer> mockMap;

    @Test
    public void whenConfigNonVoidReturnMethodToThrowEx_thenExIsThrown() {
        when(mockMap.get(anyString())).thenThrow(NullPointerException.class);
        assertThrows(NullPointerException.class, () -> mockMap.get("mghio"));
    }

    private final List<String> mockList1 = spy(ArrayList.class);

    @Test
    public void addTest() {
        mockList1.add("test");
        assertEquals(1, mockList1.size());
    }

}
