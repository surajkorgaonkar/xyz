package proxy_pattern;

public class tvobj implements proxyinterface {

	@Override
	public void channelup() {
		// TODO Auto-generated method stub
		System.out.println("you cane move CHANNEL UP");
	}

	@Override
	public void channeldown() {
		// TODO Auto-generated method stub
		System.out.println("you cane move CHANNEL DOWN");
	}

	@Override
	public void volup() {
		// TODO Auto-generated method stub
		System.out.println("you cane move VOLUME UP");
		
	}

	@Override
	public void voldown() {
		// TODO Auto-generated method stub
		System.out.println("you cane move VOLUME DOWN");
	}

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		System.out.println("you cane POWER ON TV ");
		
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println("you cane POWER 0FF TV ");
	}
	
	

}
