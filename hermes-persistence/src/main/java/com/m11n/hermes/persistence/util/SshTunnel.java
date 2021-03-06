package com.m11n.hermes.persistence.util;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SshTunnel {
    private static final Logger logger = LoggerFactory.getLogger(SshTunnel.class);

    @Value("${hermes.ssh.port}")
    private int sshPort;

    @Value("${hermes.ssh.username}")
    private String username;

    @Value("${hermes.ssh.password}")
    private String password;

    @Value("${hermes.ssh.remote.host}")
    private String remoteHost;

    @Value("${hermes.ssh.remote.port}")
    private int remotePort;

    @Value("${hermes.ssh.remote.binding}")
    private String remoteBinding = "localhost";

    @Value("${hermes.ssh.local.port}")
    private int localPort;

    @Value("${hermes.ssh.compression:true}")
    private boolean compression;

    private Session session;

    @PostConstruct
    public void start() {
        int assignedPort = 0;
        try {
            JSch jsch = new JSch();

            // Create SSH session.  Port 22 is your SSH remotePort which
            // is open in your firewall setup.
            session = jsch.getSession(username, remoteHost, sshPort);
            session.setPassword(password);

            // Additional SSH options.  See your ssh_config manual for
            // more options.  Set options according to your requirements.
            java.util.Properties config = new java.util.Properties();
            config.put("Compression", compression ? "yes" : "no");
            //config.put("ConnectionAttempts","2");
            config.put("StrictHostKeyChecking", "no");

            session.setConfig(config);
            session.setDaemonThread(true);
            session.setServerAliveInterval(60000);
            //session.setServerAliveCountMax(1);

            // Connect
            session.connect();

            Channel channel = session.openChannel("shell");
            channel.connect();

            // NOTE: the second remoteHost parameter is the binding address of the MySQL server... which is listening only on localhost
            //assignedPort = session.setPortForwardingL("127.0.0.1", localPort, remoteHost, remotePort);
            assignedPort = session.setPortForwardingL(localPort, remoteBinding, remotePort);
        } catch (Exception e) {
            logger.error(e.toString(), e);
        }

        if (assignedPort == 0) {
            throw new RuntimeException("Port forwarding failed !");
        }
    }

    public Session getSession() {
        return session;
    }

    @PreDestroy
    public void stop() {
        if(session!=null) {
            session.disconnect();
            logger.info("##################### DISCONNECTED.");
        }
    }

    public void restart() {
        stop();
        start();
    }

    public int getSshPort() {
        return sshPort;
    }

    public void setSshPort(int sshPort) {
        this.sshPort = sshPort;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public int getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(int remotePort) {
        this.remotePort = remotePort;
    }

    public String getRemoteBinding() {
        return remoteBinding;
    }

    public void setRemoteBinding(String remoteBinding) {
        this.remoteBinding = remoteBinding;
    }

    public int getLocalPort() {
        return localPort;
    }

    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }
}
