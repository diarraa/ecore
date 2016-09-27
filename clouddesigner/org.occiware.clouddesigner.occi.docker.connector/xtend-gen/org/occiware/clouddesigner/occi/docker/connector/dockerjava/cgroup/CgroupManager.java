/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;

@SuppressWarnings("all")
public class CgroupManager {
  private final static String cGroupPath = "/sys/fs/cgroup/";
  
  public final static String blkio_subsystem = "blkio";
  
  public final static String cpuset_subsystem = "cpuset";
  
  public final static String cpu_subsystem = "cpu";
  
  public final static String cpuacct_subsystem = "cpuacct";
  
  public final static String devices_subsystem = "devices";
  
  public final static String freezer_subsystem = "freezer";
  
  public final static String memory_subsystem = "memory";
  
  public final static String netcls_subsystem = "netcls";
  
  public final static String blkio_write = "blkio.throttle.write_bps_device";
  
  public final static String blkio_read = "blkio.throttle.read_bps_device";
  
  public final static String memory_max_mem = "memory.limit_in_bytes";
  
  public final static String memory_swap = "memory.memsw.limit_in_bytes";
  
  public final static String cpuset_cpus = "cpuset.cpus";
  
  public final static String cpu_cfs_period = "cpu.cfs_period_us";
  
  public final static String cpu_cfs_quota = "cpu.cfs_quota_us";
  
  public static void SetValue(final String host, final String privateKey, final Container container, final String subsystem, final String file, final String value) {
    String _containerid = container.getContainerid();
    String _plus = (((CgroupManager.cGroupPath + subsystem) + "/docker/") + _containerid);
    String _plus_1 = (_plus + "/");
    final String FilePath = (_plus_1 + file);
    String _cpuSetGenerator = CgroupManager.cpuSetGenerator(value, container);
    String _plus_2 = ("echo \'" + _cpuSetGenerator);
    String _plus_3 = (_plus_2 + "\' > ");
    final String command = (_plus_3 + FilePath);
    InputOutput.<String>println(("EXECUTE COMMAND: " + command));
    final DockerContainerManager dockerContainerManager = new DockerContainerManager();
    dockerContainerManager.connect(host, privateKey, command);
  }
  
  public static String cpuSetGenerator(final String nbCores, final Container container) {
    if ((((Integer.valueOf(nbCores)).intValue() > 1) && ((Integer.valueOf(nbCores)).intValue() <= container.getCore_max()))) {
      String cpuSet = String.format("0-%s", nbCores);
      return cpuSet;
    }
    return "0";
  }
}
