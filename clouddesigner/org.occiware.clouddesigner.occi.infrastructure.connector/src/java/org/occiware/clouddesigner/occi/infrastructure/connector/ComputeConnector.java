/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *
 * Generated at Fri Jul 01 14:13:59 CEST 2016 from platform:/plugin/org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.infrastructure.connector;

import org.json.simple.JSONObject;
import org.occiware.clouddesigner.occi.infrastructure.Architecture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: compute
 * - title: Compute Resource
 */
public class ComputeConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl
{

    private static final String ID = "id";
    private static final String TITLE = "title";
    private static final String SUMMARY = "summary";
    private static final String ARCHITECTURE = "architecture";
    private static final String CORES = "cores";
    private static final String MEMORY = "memory";
    private static final String HOSTNAME = "hostname";
    private static final String STATE = "state";

    /**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);

	/**
	 * Constructs a compute connector.
	 */
	ComputeConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Compute instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

        try {

            JSONObject json = new JSONObject();
            json.put(ARCHITECTURE, this.getArchitecture().toString().toUpperCase());
            json.put(CORES, this.getCores());
            json.put(MEMORY,this.getMemory());
            json.put(TITLE, this.getTitle());
			json.put(SUMMARY, this.getSummary());
			System.out.println("json : "+ json.toJSONString());
            JSONObject response = new ConnectPCA().postRequest(json);
            //getCloudAutomationInfo(response);
        }catch (Exception e){
            System.out.println(e.getClass().getName() + " : "+e.getMessage());
        }

	}

	/**
	 * Called when this Compute instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		try{
			JSONObject response = new ConnectPCA().getRequest(this.id);
			getCloudAutomationInfo(response);
		}catch (Exception e){
			System.out.println(e.getClass().getName() + " : "+e.getMessage());
		}

	}

	/**
	 * Called when this Compute instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Compute instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Compute actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: start
     * - title: Start the system
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Compute State Machine.
		switch(getState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"start\")...");

			// TODO Implement transition(state=active, action="start")

			break;

		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");

			// TODO Implement transition(state=inactive, action="start")

			break;

		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"start\")...");

			// TODO Implement transition(state=suspended, action="start")

			break;

		case ComputeStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"start\")...");

			// TODO Implement transition(state=error, action="start")

			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: stop
     * - title: Stop the system (graceful, acpioff or poweroff)
	 */
	@Override
	public void stop(final org.occiware.clouddesigner.occi.infrastructure.StopMethod method)
	{
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");

			// TODO Implement transition(state=active, action="stop")

			break;

		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"stop\")...");

			// TODO Implement transition(state=inactive, action="stop")

			break;

		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"stop\")...");

			// TODO Implement transition(state=suspended, action="stop")

			break;

		case ComputeStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"stop\")...");

			// TODO Implement transition(state=error, action="stop")

			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: restart
     * - title: Restart the system (graceful, warm or cold)
	 */
	@Override
	public void restart(final org.occiware.clouddesigner.occi.infrastructure.RestartMethod method)
	{
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"restart\")...");

			// TODO Implement transition(state=active, action="restart")

			break;

		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"restart\")...");

			// TODO Implement transition(state=inactive, action="restart")

			break;

		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"restart\")...");

			// TODO Implement transition(state=suspended, action="restart")

			break;

		case ComputeStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"restart\")...");

			// TODO Implement transition(state=error, action="restart")

			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: suspend
     * - title: Suspend the system (hibernate or in RAM)
	 */
	@Override
	public void suspend(final org.occiware.clouddesigner.occi.infrastructure.SuspendMethod method)
	{
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"suspend\")...");

			// TODO Implement transition(state=active, action="suspend")

			break;

		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"suspend\")...");

			// TODO Implement transition(state=inactive, action="suspend")

			break;

		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"suspend\")...");

			// TODO Implement transition(state=suspended, action="suspend")

			break;

		case ComputeStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"suspend\")...");

			// TODO Implement transition(state=error, action="suspend")

			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: save
     * - title: Save the system (hot, deferred)
	 */
	@Override
	public void save(final org.occiware.clouddesigner.occi.infrastructure.SaveMethod method, final java.lang.String name)
	{
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		// Compute State Machine.
		switch(getState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"save\")...");

			// TODO Implement transition(state=active, action="save")

			break;

		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"save\")...");

			// TODO Implement transition(state=inactive, action="save")

			break;

		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"save\")...");

			// TODO Implement transition(state=suspended, action="save")

			break;

		case ComputeStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"save\")...");

			// TODO Implement transition(state=error, action="save")

			break;

		default:
			break;
		}
	}

    private void getCloudAutomationInfo(JSONObject response){
        this.id = (String) response.getOrDefault(ID,this.id);
        this.title = (String) response.getOrDefault(TITLE,this.title);
        this.summary  = (String) response.getOrDefault(SUMMARY,this.title);
        this.cores = (Integer) response.getOrDefault(CORES,this.cores);
        this.memory = (Float) response.getOrDefault(MEMORY,this.memory);
        this.hostname = (String) response.getOrDefault(HOSTNAME,this.hostname);
        setArchitecture((String) response.getOrDefault(ARCHITECTURE,this.architecture.getName()));
        setStateStatus((String) response.getOrDefault(STATE,this.state.getName()));
    }

    private void setArchitecture(String s){
        if("X86".equalsIgnoreCase(s)) {
            this.architecture = Architecture.X86;
        }
        else if("X64".equalsIgnoreCase(s)) {
            this.architecture = Architecture.X86;
        }
    }

    public void setStateStatus(String stateStatus){
        if("ACTIVE".equalsIgnoreCase(stateStatus)){
            this.state = ComputeStatus.ACTIVE;
        }
        else if("SUSPENDED".equalsIgnoreCase(stateStatus)){
            this.state = ComputeStatus.SUSPENDED;
        }
        else if("INACTIVE".equalsIgnoreCase(stateStatus)){
            this.state = ComputeStatus.INACTIVE;
        }
        else if("ERROR".equalsIgnoreCase(stateStatus)){
            this.state = ComputeStatus.ERROR;
        }
    }
}	
