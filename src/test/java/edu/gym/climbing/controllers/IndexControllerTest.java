package edu.gym.climbing.controllers;

import edu.gym.climbing.model.Gym;
import edu.gym.climbing.services.GymService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class IndexControllerTest {

    private IndexController controller;

    @Mock
    Model model;
    @Mock
    GymService gymService;

    @Captor
    ArgumentCaptor<Set> set;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        controller = new IndexController(gymService);
    }

    @Test
    public void testMVC() throws Exception {
        MockMvc mvc = MockMvcBuilders.standaloneSetup(controller).build();

        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void getIndex() {
        Set<Gym> gyms = new HashSet<>();
        Gym gym1 = new Gym();
        gym1.setId(1L);
        gyms.add(gym1);
        Gym gym2 = new Gym();
        gym2.setId(2L);
        gyms.add(gym2);
        String excpected = "index";

        Mockito.when(gymService.getAll()).thenReturn(gyms);

        String actual = controller.getIndex(model);

        Assert.assertEquals(excpected, actual);
        Mockito.verify(model, times(1)).addAttribute(eq("gyms"), set.capture());
        Set<Gym> capturedSet = set.getValue();
        Mockito.verify(gymService, times(1)).getAll();
        Assert.assertEquals(gyms, capturedSet);
    }
}