/*
 * Copyright (c) 2024 AVI-SPL, Inc. All Rights Reserved.
 */
package com.avispl.symphony.dal.device.communicator;

import com.avispl.symphony.api.dal.control.Controller;
import com.avispl.symphony.api.dal.dto.control.ControllableProperty;
import com.avispl.symphony.api.dal.dto.monitor.ExtendedStatistics;
import com.avispl.symphony.api.dal.dto.monitor.Statistics;
import com.avispl.symphony.api.dal.monitor.Monitorable;
import com.avispl.symphony.dal.communicator.HttpCommunicator;

import java.util.Arrays;
import java.util.List;

/**
 * TODO: Please add communicator details here
 *
 * @author %AuthorName%/AVISPL Team
 */
public class TemplateCommunicator extends HttpCommunicator implements Monitorable, Controller {

    @Override
    public void controlProperty(ControllableProperty controllableProperty) throws Exception {
        //TODO: add controls logic here
    }

    @Override
    public void controlProperties(List<ControllableProperty> list) throws Exception {
        //TODO: add controls logic here
    }

    @Override
    public List<Statistics> getMultipleStatistics() throws Exception {
        //TODO: add multiple statistics retrieval logic here
        return Arrays.asList(new ExtendedStatistics());
    }

    @Override
    protected void authenticate() throws Exception {
        //TODO: add authentication logic here
    }
}
