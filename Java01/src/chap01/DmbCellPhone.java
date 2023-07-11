package chap01;

public class DmbCellPhone extends CellPhone {

	// 필드
	int channel;

	public DmbCellPhone(String model, String color, int _channel) {
		super(model, color);
		this.channel = _channel;
	}

	// method
	
	void turnOnDmb() {
		System.out.println("채널 "+ channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int _channel) {
		this.channel = _channel;
		System.out.println("채널 "+ channel + "번으로 바꿉니다");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
}
