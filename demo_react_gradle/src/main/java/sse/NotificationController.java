/*
 * package sse;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestHeader; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
 * 
 * 
 * @Controller public class NotificationController {
 * 
 * private final NotificationService notificationService;
 * 
 * public NotificationController(NotificationService notificationService) {
 * this.notificationService = notificationService; }
 * 
 * @GetMapping("/notificationstart") public String start() { return
 * "sse/notification"; }
 * 
 *//**
	 * @title 로그인 한 유저 sse 연결
	 *//*
		 * @GetMapping(value = "/subscribe/{id}", produces = "text/event-stream")
		 * 
		 * @ResponseBody public SseEmitter subscribe(@PathVariable Long id,
		 * 
		 * @RequestHeader(value = "Last-Event-ID", required = false, defaultValue = "")
		 * String lastEventId) { return notificationService.subscribe(id, lastEventId);
		 * } }
		 */