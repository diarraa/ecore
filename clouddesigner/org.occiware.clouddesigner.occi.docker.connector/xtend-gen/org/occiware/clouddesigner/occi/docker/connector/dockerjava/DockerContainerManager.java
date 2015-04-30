package org.occiware.clouddesigner.occi.docker.connector.dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.InspectContainerCmd;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.StartContainerCmd;
import com.github.dockerjava.api.command.StopContainerCmd;
import com.github.dockerjava.api.command.WaitContainerCmd;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.LxcConf;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.google.common.base.Objects;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerConfig;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;

@SuppressWarnings("all")
public class DockerContainerManager {
  public Map<DockerClient, CreateContainerResponse> createContainer(final Machine machine, final Container container) {
    DockerFactory.eINSTANCE.eClass();
    final DockerClient dockerClient = this.setConfig(machine);
    Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>();
    final CreateContainerCmd create = this.containerFactory(container, dockerClient);
    final CreateContainerResponse rcontainer = create.exec();
    result.put(dockerClient, rcontainer);
    return result;
  }
  
  public CreateContainerCmd containerFactory(final Container container, final DockerClient dockerClient) {
    CreateContainerCmd create = null;
    String _image = container.getImage();
    boolean _notEquals = (!Objects.equal(_image, null));
    if (_notEquals) {
      String _image_1 = container.getImage();
      CreateContainerCmd _createContainerCmd = dockerClient.createContainerCmd(_image_1);
      create = _createContainerCmd;
    } else {
      String _image_2 = container.getImage();
      boolean _equals = Objects.equal(_image_2, null);
      if (_equals) {
        CreateContainerCmd _createContainerCmd_1 = dockerClient.createContainerCmd("busybox");
        create = _createContainerCmd_1;
      }
    }
    String _command = container.getCommand();
    boolean _notEquals_1 = (!Objects.equal(_command, null));
    if (_notEquals_1) {
      String _command_1 = container.getCommand();
      final String[] cmd = _command_1.split(",");
      create.withCmd(cmd);
    }
    int _cpu_shares = container.getCpu_shares();
    boolean _greaterThan = (_cpu_shares > 0);
    if (_greaterThan) {
      int _cpu_shares_1 = container.getCpu_shares();
      create.withCpuShares(_cpu_shares_1);
    }
    String _add_host = container.getAdd_host();
    boolean _notEquals_2 = (!Objects.equal(_add_host, null));
    if (_notEquals_2) {
      String _hostname = container.getHostname();
      create.withHostName(_hostname);
    }
    String _cpuset = container.getCpuset();
    boolean _notEquals_3 = (!Objects.equal(_cpuset, null));
    if (_notEquals_3) {
      String _cpuset_1 = container.getCpuset();
      create.withCpuset(_cpuset_1);
    }
    boolean _isPrivileged = container.isPrivileged();
    if (_isPrivileged) {
      boolean _isPrivileged_1 = container.isPrivileged();
      create.withPrivileged(_isPrivileged_1);
    }
    String _dns = container.getDns();
    boolean _notEquals_4 = (!Objects.equal(_dns, null));
    if (_notEquals_4) {
      String _dns_1 = container.getDns();
      create.withDns(_dns_1);
    }
    String _environment = container.getEnvironment();
    boolean _notEquals_5 = (!Objects.equal(_environment, null));
    if (_notEquals_5) {
      String _environment_1 = container.getEnvironment();
      create.withEnv(_environment_1);
    }
    String _ports = container.getPorts();
    boolean _notEquals_6 = (!Objects.equal(_ports, null));
    if (_notEquals_6) {
      String _ports_1 = container.getPorts();
      int _parseInt = Integer.parseInt(_ports_1);
      ExposedPort port = ExposedPort.tcp(_parseInt);
      final Ports portBindings = new Ports();
      Ports.Binding _Binding = Ports.Binding(Integer.valueOf(11022));
      portBindings.bind(port, _Binding);
      create.withPortBindings(portBindings);
    }
    String _name = container.getName();
    boolean _notEquals_7 = (!Objects.equal(_name, null));
    if (_notEquals_7) {
      String _name_1 = container.getName();
      create.withName(_name_1);
    }
    String _net = container.getNet();
    boolean _notEquals_8 = (!Objects.equal(_net, null));
    if (_notEquals_8) {
      String _net_1 = container.getNet();
      create.withNetworkMode(_net_1);
    }
    boolean _isPublish_all = container.isPublish_all();
    if (_isPublish_all) {
      boolean _isPublish_all_1 = container.isPublish_all();
      create.withPublishAllPorts(_isPublish_all_1);
    }
    boolean _isTty = container.isTty();
    if (_isTty) {
      boolean _isTty_1 = container.isTty();
      create.withTty(_isTty_1);
    }
    boolean _isStdin_open = container.isStdin_open();
    if (_isStdin_open) {
      boolean _isStdin_open_1 = container.isStdin_open();
      create.withStdInOnce(_isStdin_open_1);
    }
    String _user = container.getUser();
    boolean _notEquals_9 = (!Objects.equal(_user, null));
    if (_notEquals_9) {
      String _user_1 = container.getUser();
      create.withUser(_user_1);
    }
    String _volumes = container.getVolumes();
    boolean _notEquals_10 = (!Objects.equal(_volumes, null));
    if (_notEquals_10) {
      String _volumes_1 = container.getVolumes();
      Volume _volume = new Volume(_volumes_1);
      create.withVolumes(_volume);
    }
    int _mem_limit = container.getMem_limit();
    boolean _greaterThan_1 = (_mem_limit > 0);
    if (_greaterThan_1) {
      int _mem_limit_1 = container.getMem_limit();
      create.withMemoryLimit(_mem_limit_1);
    }
    int _memory_swap = container.getMemory_swap();
    boolean _greaterThan_2 = (_memory_swap > 0);
    if (_greaterThan_2) {
      int _memory_swap_1 = container.getMemory_swap();
      create.withMemorySwap(_memory_swap_1);
    }
    String _lxc_conf = container.getLxc_conf();
    boolean _notEquals_11 = (!Objects.equal(_lxc_conf, null));
    if (_notEquals_11) {
      final LxcConf lxcCon = new LxcConf("key", "value");
      create.withLxcConf(lxcCon);
    }
    int _cores = container.getCores();
    boolean _greaterThan_3 = (_cores > 0);
    if (_greaterThan_3) {
      int _cores_1 = container.getCores();
      String _valueOf = String.valueOf(_cores_1);
      create.withCpuset(_valueOf);
    }
    return create;
  }
  
  public InspectContainerResponse inspectContainer(final Map<DockerClient, CreateContainerResponse> map) {
    Set<DockerClient> _keySet = map.keySet();
    Iterator<DockerClient> _iterator = _keySet.iterator();
    DockerClient _next = _iterator.next();
    final DockerClient dockerClient = ((DockerClient) _next);
    CreateContainerResponse _get = map.get(dockerClient);
    final CreateContainerResponse createContainerResponse = ((CreateContainerResponse) _get);
    String _id = createContainerResponse.getId();
    InspectContainerCmd _inspectContainerCmd = dockerClient.inspectContainerCmd(_id);
    final InspectContainerResponse inspectContainerResponse = _inspectContainerCmd.exec();
    return inspectContainerResponse;
  }
  
  public Void startContainer(final Machine machine, final Container container) {
    Void _xblockexpression = null;
    {
      final DockerClient dockerClient = this.setConfig(machine);
      String _id = container.getId();
      StartContainerCmd _startContainerCmd = dockerClient.startContainerCmd(_id);
      _xblockexpression = _startContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Void stopContainer(final Machine machine, final Container container) {
    Void _xblockexpression = null;
    {
      final DockerClient dockerClient = this.setConfig(machine);
      String _id = container.getId();
      StopContainerCmd _stopContainerCmd = dockerClient.stopContainerCmd(_id);
      _xblockexpression = _stopContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Integer waitContainer(final Machine machine, final Container container) {
    Integer _xblockexpression = null;
    {
      final DockerClient dockerClient = this.setConfig(machine);
      String _id = container.getId();
      WaitContainerCmd _waitContainerCmd = dockerClient.waitContainerCmd(_id);
      _xblockexpression = _waitContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public List<com.github.dockerjava.api.model.Container> listContainer(final Machine machine) {
    final DockerClient dockerClient = this.setConfig(machine);
    ListContainersCmd _listContainersCmd = dockerClient.listContainersCmd();
    ListContainersCmd _withShowAll = _listContainersCmd.withShowAll(true);
    final List<com.github.dockerjava.api.model.Container> containers = _withShowAll.exec();
    for (final com.github.dockerjava.api.model.Container c : containers) {
      for (final com.github.dockerjava.api.model.Container.Port p : c.ports) {
      }
    }
    return containers;
  }
  
  public DockerClient pullImage(final Machine machine, final String image) {
    final DockerClient dockerClient = this.setConfig(machine);
    String containerImage = image;
    InputOutput.<String>println(("Downloading image: ->" + containerImage));
    boolean _equals = Objects.equal(image, null);
    if (_equals) {
      containerImage = "busybox";
    }
    PullImageCmd _pullImageCmd = dockerClient.pullImageCmd(containerImage);
    PullImageCmd _withTag = _pullImageCmd.withTag("latest");
    InputStream _exec = _withTag.exec();
    final String output = DockerUtil.asString(_exec);
    InputOutput.<String>println(output);
    InputOutput.<String>println("Download is finished");
    return dockerClient;
  }
  
  public DockerClient setConfig(final Machine machine) {
    try {
      final DockerConfig lconfig = new DockerConfig();
      final Properties dockerClientconfig = lconfig.loadConfig();
      String _name = machine.getName();
      InputOutput.<String>println(_name);
      Runtime _runtime = Runtime.getRuntime();
      String _name_1 = machine.getName();
      String ENDPOINT = DockerMachineManager.urlCmd(_runtime, _name_1);
      String _name_2 = machine.getName();
      final String certPath = DockerUtil.getEnv(_name_2);
      final String port = ":2376";
      final URL url = new URL(ENDPOINT);
      String _protocol = url.getProtocol();
      String _host = url.getHost();
      String _path = url.getPath();
      String _query = url.getQuery();
      final URI uri = new URI(_protocol, _host, _path, _query, null);
      String _string = uri.toString();
      final String dockerUri = (_string + port);
      String _string_1 = uri.toString();
      InputOutput.<String>println(_string_1);
      DockerClientConfig.DockerClientConfigBuilder _createDefaultConfigBuilder = DockerClientConfig.createDefaultConfigBuilder();
      Object _get = dockerClientconfig.get("docker.version");
      String _string_2 = _get.toString();
      DockerClientConfig.DockerClientConfigBuilder _withVersion = _createDefaultConfigBuilder.withVersion(_string_2);
      DockerClientConfig.DockerClientConfigBuilder _withUri = _withVersion.withUri(dockerUri);
      Object _get_1 = dockerClientconfig.get("docker.username");
      String _string_3 = _get_1.toString();
      DockerClientConfig.DockerClientConfigBuilder _withUsername = _withUri.withUsername(_string_3);
      Object _get_2 = dockerClientconfig.get("docker.password");
      String _string_4 = _get_2.toString();
      DockerClientConfig.DockerClientConfigBuilder _withPassword = _withUsername.withPassword(_string_4);
      Object _get_3 = dockerClientconfig.get("docker.email");
      String _string_5 = _get_3.toString();
      DockerClientConfig.DockerClientConfigBuilder _withEmail = _withPassword.withEmail(_string_5);
      DockerClientConfig.DockerClientConfigBuilder _withServerAddress = _withEmail.withServerAddress("https://index.docker.io/v1/");
      DockerClientConfig.DockerClientConfigBuilder _withDockerCertPath = _withServerAddress.withDockerCertPath(certPath);
      final DockerClientConfig config = _withDockerCertPath.build();
      DockerClientBuilder _instance = DockerClientBuilder.getInstance(config);
      final DockerClient dockerClient = _instance.build();
      return dockerClient;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}