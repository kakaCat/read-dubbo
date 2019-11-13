//package read.dubbo.bootstarp;
//
//import com.alibaba.dubbo.common.Constants;
//import com.alibaba.dubbo.common.utils.ConfigUtils;
//import com.alibaba.dubbo.container.Container;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
//import static com.alibaba.dubbo.container.Main.CONTAINER_KEY;
//
//public class BootDubbo {
//
//    private static Logger logger = LoggerFactory.getLogger(BootDubbo.class);
//
//
////    private Look
//
//    public static void main(String[] args) {
//        try {
//            if (args == null || args.length == 0) {
//                String config = ConfigUtils.getProperty(CONTAINER_KEY, loader.getDefaultExtensionName());
//                args = Constants.COMMA_SPLIT_PATTERN.split(config);
//            }
//
//            final List<Container> containers = new ArrayList<Container>();
//            for (int i = 0; i < args.length; i++) {
//                containers.add(loader.getExtension(args[i]));
//            }
//            logger.info("Use container type(" + Arrays.toString(args) + ") to run dubbo serivce.");
//
//            if ("true".equals(System.getProperty(SHUTDOWN_HOOK_KEY))) {
//                Runtime.getRuntime().addShutdownHook(new Thread() {
//                    public void run() {
//                        for (Container container : containers) {
//                            try {
//                                container.stop();
//                                logger.info("Dubbo " + container.getClass().getSimpleName() + " stopped!");
//                            } catch (Throwable t) {
//                                logger.error(t.getMessage(), t);
//                            }
//                            try {
//                                LOCK.lock();
//                                STOP.signal();
//                            } finally {
//                                LOCK.unlock();
//                            }
//                        }
//                    }
//                });
//            }
//
//            for (Container container : containers) {
//                container.start();
//                logger.info("Dubbo " + container.getClass().getSimpleName() + " started!");
//            }
//            System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date()) + " Dubbo service server started!");
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//            logger.error(e.getMessage(), e);
//            System.exit(1);
//        }
////        try {
////            LOCK.lock();
////            STOP.await();
////        } catch (InterruptedException e) {
////            logger.warn("Dubbo service server stopped, interrupted by other thread!", e);
////        } finally {
////            LOCK.unlock();
////        }
//    }
//
//}
