import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.jetty.websocket.WebSocket;
import org.eclipse.jetty.websocket.WebSocket.Connection;
import org.eclipse.jetty.websocket.WebSocketClient;
import org.eclipse.jetty.websocket.WebSocketClientFactory;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.FrameworkMessage;
import com.esotericsoftware.kryonet.Listener;

public class TreeRemote {

	private WebSocketClientFactory cf = new WebSocketClientFactory();
	private Connection connection = null;
	private TreeRemoteImpl tree;

	public TreeRemote() {
		tree = new TreeRemoteImpl();
		startWebSocket();
		startBohnifyConnection();
	}

	public void startWebSocket() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					cf.start();
					WebSocketClient client = new WebSocketClient(cf);
					try {
						connection = client.open(new URI(
								"ws://localhost:9002/ws"),
								new WebSocket.OnTextMessage() {

									@Override
									public void onOpen(
											org.eclipse.jetty.websocket.WebSocket.Connection arg0) {
										// TODO Auto-generated method stub
										tree.connectedToTree();
									}

									@Override
									public void onClose(int arg0, String arg1) {
										// TODO Auto-generated method stub
										tree.disconnectedFromTree();
									}

									@Override
									public void onMessage(String arg0) {
										// TODO Auto-generated method stub
										// System.out.println(arg0);
										tree.dataFromTree(arg0);
									}
								}, 5000, TimeUnit.MILLISECONDS);
					} catch (IOException | InterruptedException
							| TimeoutException | URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					connection.setMaxTextMessageSize(Integer.MAX_VALUE);
					connection.setMaxIdleTime(Integer.MAX_VALUE);
					connection.setMaxBinaryMessageSize(Integer.MAX_VALUE);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}).start();

	}

	public void startBohnifyConnection() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Client c = new Client(1048576, 1048576);
					c.start();
					c.addListener(new Listener() {

						@Override
						public void connected(
								com.esotericsoftware.kryonet.Connection arg0) {
							tree.connectedToBohnify(arg0);
						}

						@Override
						public void disconnected(
								com.esotericsoftware.kryonet.Connection arg0) {
							tree.disconnectedFromBohnify();
						}

						@Override
						public void received(
								com.esotericsoftware.kryonet.Connection arg0,
								Object arg1) {
							if (!(arg1 instanceof FrameworkMessage)) {
								tree.dataFromBohnify(arg1.toString());
							}
						}

					});
					c.connect(5000, "localhost", 1651);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

}
