package cn.merryyou.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created on 2017/11/18 0018.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Component
@ServerEndpoint("/webSocket")
@Slf4j
public class WebSocket {

    private static CopyOnWriteArraySet<WebSocket> webSockets = new CopyOnWriteArraySet<>();
    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        webSockets.add(this);
        log.info("【websocket消息】 有新的链接，总数：{}", webSockets.size());
    }

    @OnClose
    public void onClose() {
        webSockets.remove(this);
        log.info("【websocket消息】 连接断开，总数：{}", webSockets.size());
    }

    @OnMessage
    public void onMessage(String message) {
        log.info("【websocket消息】 收到客户端发来的消息，总数：{}", webSockets.size());
    }

    public void sendMessage(String message) {
        for (WebSocket webSocket : webSockets) {
            log.info("【websocket消息】 广播消息，message={}", message);
            try {
                webSocket.session.getBasicRemote().sendText(message);
            } catch (Exception e) {
                log.error("【websocket消息】 发送消息异常！");
                e.printStackTrace();
            }
        }
    }

    @OnError
    public void onError(Throwable e, Session session){
        log.error("【websocket消息】 异常！");
    }
}
