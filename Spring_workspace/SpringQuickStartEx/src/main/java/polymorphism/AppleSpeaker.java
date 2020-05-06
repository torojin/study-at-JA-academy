package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker{
	public void volumeUp() {
		System.out.println("애플 스피커  -- 소리 UP");
	}
	public void volumeDown() {
		System.out.println("애플 스피커  -- 소리 DOWN");
	}
}
