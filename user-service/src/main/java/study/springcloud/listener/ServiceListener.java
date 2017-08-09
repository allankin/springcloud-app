package study.springcloud.listener;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

/**
 * Created by kim on 2017/8/9.
 */
@Configuration
public class ServiceListener implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    private EmbeddedServletContainerInitializedEvent containerEvent;

    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent embeddedServletContainerInitializedEvent) {
        this.containerEvent = embeddedServletContainerInitializedEvent;
    }

    public int getPort(){
        Assert.notNull(containerEvent,"EmbeddedServletContainerInitializedEvent 不能为null");
        int port = containerEvent.getEmbeddedServletContainer().getPort();
        Assert.state(port != -1,"端口号获取失败");
        return port;
    }
}
