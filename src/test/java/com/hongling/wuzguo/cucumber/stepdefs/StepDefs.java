package com.hongling.wuzguo.cucumber.stepdefs;

import com.hongling.wuzguo.HipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
